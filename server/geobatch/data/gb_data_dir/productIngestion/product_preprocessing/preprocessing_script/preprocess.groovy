import it.geosolutions.geobatch.action.scripting.ScriptingConfiguration
import it.geosolutions.geobatch.flow.event.ProgressListenerForwarder
import it.geosolutions.geobatch.flow.event.action.ActionException
import it.geosolutions.geobatch.action.scripting.ScriptingAction;
import it.geosolutions.filesystemmonitor.monitor.FileSystemEvent;


import org.apache.commons.io.FilenameUtils
import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/** 
 * Script execute function
 **/
public Map execute(Map argsMap) throws Exception {
	

    // Full Action Configuration 
	final ScriptingConfiguration configuration=argsMap.get(ScriptingAction.CONFIG_KEY);
	
	// Events Queue. Contains the directory of uncompressed product package
	// and the file Product_Attributes.xml with information about user, service
	// and product id. 
	final List events=argsMap.get(ScriptingAction.EVENTS_KEY);
	final ProgressListenerForwarder listenerForwarder=argsMap.get(ScriptingAction.LISTENER_KEY);
	
    
	final Logger LOGGER = LoggerFactory.getLogger(ScriptingAction.class);

	try {
		// listenerForwarder.started();

        //
        // get product directory from event queue 
		//
		final EventObject event = events.remove();
		FileSystemEvent fsEvent = null;
		if (event instanceof FileSystemEvent) {
            fsEvent = (FileSystemEvent) event;
    	}
    	
    	// this is the uncompressed files to process in the next steps
    	// you can read/write these files to be compliant with the 
    	// next steps of the ingestion process 
    	File productDir = fsEvent.getSource();		
		LOGGER.info("pre-processing directory: " + productDir.getAbsolutePath());
		// DO SOMETHING HERE
		
        
		return null;
	} catch (Exception t) {
		LOGGER.error( "Error while executing pre-processing script", t); // no need to log, we're rethrowing it
		throw new ActionException(this, t.getMessage(), t);
	}
}