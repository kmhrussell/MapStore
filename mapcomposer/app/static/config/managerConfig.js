﻿{
   "composerUrl":"",
   "socialUrl":"",
   "start":0,
   "limit":20,
   "msmTimeout":30000,
   "twitter":{
      "via":"geosolutions_it",
      "hashtags":""
   },
   "ASSET":{
        "delete_icon": "./externals/mapmanager/theme/img/user_delete.png",
        "edit_icon": "./externals/mapmanager/theme/img/user_edit.png"
   },
   "locales":[
      [
         "en",
         "English"
      ],
      [
         "it",
         "Italiano"
      ],
      [
         "fr",
         "Français"
      ],
      [
         "de",
         "Deutsch"
      ],
      [
         "es",
         "Español"
      ]
   ],
   "tools":[{
        "ptype": "mxp_mapmanager",
        "loginManager": "loginTool",
        "actionTarget":null
    },{
        "ptype": "mxp_login",
        "pluginId": "loginTool",
        "actionTarget":{
          "target": "north.tbar",
          "index": 3
        }
    },{
        "ptype": "mxp_languageselector",
        "actionTarget":{
          "target": "north.tbar",
          "index": 7
        }
    }],
   "adminTools":[{
        "ptype": "mxp_mapmanager",
        "loginManager": "loginTool",
        "actionTarget": null
    },{
        "ptype": "mxp_myaccount",
        "loginManager": "loginTool",
        "actionTarget":{
          "target": "north.tbar",
          "index": 1
        }
    },{
        "ptype": "mxp_usermanager",
        "showEnabled":true,
        "loginManager": "loginTool",
        "actionTarget":{
          "target": "north.tbar",
          "index": 2
        }
     },{
         "ptype": "mxp_updater",
         "geoBatchRestURL":"http://84.33.2.29/opensdi2-manager/facade/geobatch/rest/",
         "uploadUrl":"http://84.33.2.29/opensdi2-manager/mvc/admin/updater/upload",
         "GWCRestURL":"http://84.33.2.29/opensdi2-manager/facade/geoserver/gwc/rest/",
         "actionTarget":{
           "target": "north.tbar",
           "index": 3
         }
    },{
        "ptype": "mxp_login",
        "pluginId": "loginTool",
        "actionTarget":{
          "target": "north.tbar",
          "index": 10
        }
    },{
        "ptype": "mxp_languageselector",
        "actionTarget":{
          "target": "north.tbar",
          "index": 20
        }
    }],
    "loggedTools":[{
        "ptype": "mxp_mapmanager",
        "loginManager": "loginTool",
        "actionTarget": null
    },{
        "ptype": "mxp_myaccount",
        "loginManager": "loginTool",
        "actionTarget":{
          "target": "north.tbar",
          "index": 1 
        }
    },{
        "ptype": "mxp_login",
        "pluginId": "loginTool",
        "actionTarget":{
          "target": "north.tbar",
          "index": 4
        }
    },{
        "ptype": "mxp_languageselector",
        "actionTarget":{
          "target": "north.tbar",
          "index": 8
        }
    }],
   "embedLink": {
		"embeddedTemplateName": "viewer",
		"showDirectURL": true,
        "showQRCode":true,
        "qrCodeSize":128,
        "appDownloadUrl":"http://demo.geo-solutions.it/share/mapstoremobile/MapStoreMobile.apk"

	}
}