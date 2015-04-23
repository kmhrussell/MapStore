//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.13 at 10:49:44 AM CEST 
//

package eu.europa.emsa.csndc;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Sea condition associated to the area of spill
 * 
 * <p>
 * Java class for SeaConditionType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeaConditionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="waveHeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="waveLength" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="waveDirection" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="currentIntensity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="currentDirection" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeaConditionType", propOrder = { "dataSource", "dataType", "waveHeight",
        "waveLength", "waveDirection", "currentIntensity", "currentDirection" })
public class SeaConditionType {

    protected String dataSource;

    protected String dataType;

    protected Double waveHeight;

    protected Double waveLength;

    protected BigInteger waveDirection;

    protected Double currentIntensity;

    protected BigInteger currentDirection;

    /**
     * Gets the value of the currentDirection property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getCurrentDirection() {
        return currentDirection;
    }

    /**
     * Gets the value of the currentIntensity property.
     * 
     * @return possible object is {@link Double }
     * 
     */
    public Double getCurrentIntensity() {
        return currentIntensity;
    }

    /**
     * Gets the value of the dataSource property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Gets the value of the waveDirection property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getWaveDirection() {
        return waveDirection;
    }

    /**
     * Gets the value of the waveHeight property.
     * 
     * @return possible object is {@link Double }
     * 
     */
    public Double getWaveHeight() {
        return waveHeight;
    }

    /**
     * Gets the value of the waveLength property.
     * 
     * @return possible object is {@link Double }
     * 
     */
    public Double getWaveLength() {
        return waveLength;
    }

    /**
     * Sets the value of the currentDirection property.
     * 
     * @param value allowed object is {@link BigInteger }
     * 
     */
    public void setCurrentDirection(BigInteger value) {
        this.currentDirection = value;
    }

    /**
     * Sets the value of the currentIntensity property.
     * 
     * @param value allowed object is {@link Double }
     * 
     */
    public void setCurrentIntensity(Double value) {
        this.currentIntensity = value;
    }

    /**
     * Sets the value of the dataSource property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setDataSource(String value) {
        this.dataSource = value;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

    /**
     * Sets the value of the waveDirection property.
     * 
     * @param value allowed object is {@link BigInteger }
     * 
     */
    public void setWaveDirection(BigInteger value) {
        this.waveDirection = value;
    }

    /**
     * Sets the value of the waveHeight property.
     * 
     * @param value allowed object is {@link Double }
     * 
     */
    public void setWaveHeight(Double value) {
        this.waveHeight = value;
    }

    /**
     * Sets the value of the waveLength property.
     * 
     * @param value allowed object is {@link Double }
     * 
     */
    public void setWaveLength(Double value) {
        this.waveLength = value;
    }

}
