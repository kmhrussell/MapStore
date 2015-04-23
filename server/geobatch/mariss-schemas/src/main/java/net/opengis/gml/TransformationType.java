//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.13 at 10:49:44 AM CEST 
//

package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * A concrete operation on coordinates that usually includes a change of datum. The parameters of a coordinate transformation are empirically derived
 * from data containing the coordinates of a series of points in both coordinate reference systems. This computational process is usually
 * "over-determined", allowing derivation of error (or accuracy) estimates for the transformation. Also, the stochastic nature of the parameters may
 * result in multiple (different) versions of the same coordinate transformation.
 * 
 * This concrete complexType can be used for all operation methods, without using an Application Schema that defines operation-method-specialized
 * element names and contents, especially for methods with only one Transformation instance.
 * 
 * <p>
 * Java class for TransformationType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransformationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGeneralTransformationType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}usesMethod"/>
 *         &lt;element ref="{http://www.opengis.net/gml}usesValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransformationType", propOrder = { "usesMethod", "usesValue" })
public class TransformationType extends AbstractGeneralTransformationType {

    @XmlElement(required = true)
    protected OperationMethodRefType usesMethod;

    protected List<ParameterValueType> usesValue;

    /**
     * Gets the value of the usesMethod property.
     * 
     * @return possible object is {@link OperationMethodRefType }
     * 
     */
    public OperationMethodRefType getUsesMethod() {
        return usesMethod;
    }

    /**
     * Unordered set of composition associations to the set of parameter values used by this transformation operation. Gets the value of the usesValue
     * property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be
     * present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the usesValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getUsesValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link ParameterValueType }
     * 
     * 
     */
    public List<ParameterValueType> getUsesValue() {
        if (usesValue == null) {
            usesValue = new ArrayList<ParameterValueType>();
        }
        return this.usesValue;
    }

    /**
     * Sets the value of the usesMethod property.
     * 
     * @param value allowed object is {@link OperationMethodRefType }
     * 
     */
    public void setUsesMethod(OperationMethodRefType value) {
        this.usesMethod = value;
    }

}
