//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.13 at 10:49:44 AM CEST 
//

package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;
import org.w3._1999.xlink.TypeType;

/**
 * Association to a linear coordinate system, either referencing or containing the definition of that coordinate system.
 * 
 * <p>
 * Java class for LinearCSRefType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinearCSRefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{http://www.opengis.net/gml}LinearCS"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opengis.net/gml}AssociationAttributeGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinearCSRefType", propOrder = { "linearCS" })
public class LinearCSRefType {

    @XmlElement(name = "LinearCS")
    protected LinearCSType linearCS;

    @XmlAttribute(namespace = "http://www.opengis.net/gml")
    @XmlSchemaType(name = "anyURI")
    protected String remoteSchema;

    @XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
    protected TypeType type;

    @XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
    protected String href;

    @XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
    protected String role;

    @XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
    protected String arcrole;

    @XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
    protected String title;

    @XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
    protected ShowType show;

    @XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
    protected ActuateType actuate;

    /**
     * Gets the value of the actuate property.
     * 
     * @return possible object is {@link ActuateType }
     * 
     */
    public ActuateType getActuate() {
        return actuate;
    }

    /**
     * Gets the value of the arcrole property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getArcrole() {
        return arcrole;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getHref() {
        return href;
    }

    /**
     * Gets the value of the linearCS property.
     * 
     * @return possible object is {@link LinearCSType }
     * 
     */
    public LinearCSType getLinearCS() {
        return linearCS;
    }

    /**
     * Gets the value of the remoteSchema property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getRemoteSchema() {
        return remoteSchema;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getRole() {
        return role;
    }

    /**
     * Gets the value of the show property.
     * 
     * @return possible object is {@link ShowType }
     * 
     */
    public ShowType getShow() {
        return show;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return possible object is {@link TypeType }
     * 
     */
    public TypeType getType() {
        if (type == null) {
            return TypeType.SIMPLE;
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the actuate property.
     * 
     * @param value allowed object is {@link ActuateType }
     * 
     */
    public void setActuate(ActuateType value) {
        this.actuate = value;
    }

    /**
     * Sets the value of the arcrole property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setArcrole(String value) {
        this.arcrole = value;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Sets the value of the linearCS property.
     * 
     * @param value allowed object is {@link LinearCSType }
     * 
     */
    public void setLinearCS(LinearCSType value) {
        this.linearCS = value;
    }

    /**
     * Sets the value of the remoteSchema property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setRemoteSchema(String value) {
        this.remoteSchema = value;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Sets the value of the show property.
     * 
     * @param value allowed object is {@link ShowType }
     * 
     */
    public void setShow(ShowType value) {
        this.show = value;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value allowed object is {@link TypeType }
     * 
     */
    public void setType(TypeType value) {
        this.type = value;
    }

}
