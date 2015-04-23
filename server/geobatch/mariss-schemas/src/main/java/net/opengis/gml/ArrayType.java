//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.13 at 10:49:44 AM CEST 
//

package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * A non-abstract generic collection type that can be used as a document element for a homogeneous collection of any GML types - Geometries,
 * Topologies, Features ...
 * 
 * <p>
 * Java class for ArrayType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGMLType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}members" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayType", propOrder = { "members" })
public class ArrayType extends AbstractGMLType {

    protected ArrayAssociationType members;

    /**
     * Gets the value of the members property.
     * 
     * @return possible object is {@link ArrayAssociationType }
     * 
     */
    public ArrayAssociationType getMembers() {
        return members;
    }

    /**
     * Sets the value of the members property.
     * 
     * @param value allowed object is {@link ArrayAssociationType }
     * 
     */
    public void setMembers(ArrayAssociationType value) {
        this.members = value;
    }

}
