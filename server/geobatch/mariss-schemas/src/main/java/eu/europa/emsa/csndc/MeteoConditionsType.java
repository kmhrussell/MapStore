//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.13 at 10:49:44 AM CEST 
//

package eu.europa.emsa.csndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for MeteoConditionsType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeteoConditionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="meteoWind" type="{http://www.emsa.europa.eu/csndc}WindConditionType" minOccurs="0"/>
 *         &lt;element name="SARWind" type="{http://www.emsa.europa.eu/csndc}WindConditionType" minOccurs="0"/>
 *         &lt;element name="sea" type="{http://www.emsa.europa.eu/csndc}SeaConditionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeteoConditionsType", propOrder = { "meteoWind", "sarWind", "sea" })
public class MeteoConditionsType {

    protected WindConditionType meteoWind;

    @XmlElement(name = "SARWind")
    protected WindConditionType sarWind;

    protected SeaConditionType sea;

    /**
     * Gets the value of the meteoWind property.
     * 
     * @return possible object is {@link WindConditionType }
     * 
     */
    public WindConditionType getMeteoWind() {
        return meteoWind;
    }

    /**
     * Gets the value of the sarWind property.
     * 
     * @return possible object is {@link WindConditionType }
     * 
     */
    public WindConditionType getSARWind() {
        return sarWind;
    }

    /**
     * Gets the value of the sea property.
     * 
     * @return possible object is {@link SeaConditionType }
     * 
     */
    public SeaConditionType getSea() {
        return sea;
    }

    /**
     * Sets the value of the meteoWind property.
     * 
     * @param value allowed object is {@link WindConditionType }
     * 
     */
    public void setMeteoWind(WindConditionType value) {
        this.meteoWind = value;
    }

    /**
     * Sets the value of the sarWind property.
     * 
     * @param value allowed object is {@link WindConditionType }
     * 
     */
    public void setSARWind(WindConditionType value) {
        this.sarWind = value;
    }

    /**
     * Sets the value of the sea property.
     * 
     * @param value allowed object is {@link SeaConditionType }
     * 
     */
    public void setSea(SeaConditionType value) {
        this.sea = value;
    }

}
