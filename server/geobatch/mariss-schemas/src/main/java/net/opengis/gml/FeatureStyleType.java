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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * [complexType of] The style descriptor for features.
 * 
 * <p>
 * Java class for FeatureStyleType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureStyleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGMLType">
 *       &lt;sequence>
 *         &lt;element name="featureConstraint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}geometryStyle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}topologyStyle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}labelStyle" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="featureType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="baseType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="queryGrammar" type="{http://www.opengis.net/gml}QueryGrammarEnumeration" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureStyleType", propOrder = { "featureConstraint", "geometryStyle",
        "topologyStyle", "labelStyle" })
public class FeatureStyleType extends AbstractGMLType {

    protected String featureConstraint;

    protected List<GeometryStylePropertyType> geometryStyle;

    protected List<TopologyStylePropertyType> topologyStyle;

    protected LabelStylePropertyType labelStyle;

    @XmlAttribute
    protected String featureType;

    @XmlAttribute
    protected String baseType;

    @XmlAttribute
    protected QueryGrammarEnumeration queryGrammar;

    /**
     * Gets the value of the baseType property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getBaseType() {
        return baseType;
    }

    /**
     * Gets the value of the featureConstraint property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFeatureConstraint() {
        return featureConstraint;
    }

    /**
     * Gets the value of the featureType property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFeatureType() {
        return featureType;
    }

    /**
     * Gets the value of the geometryStyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be
     * present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the geometryStyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getGeometryStyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link GeometryStylePropertyType }
     * 
     * 
     */
    public List<GeometryStylePropertyType> getGeometryStyle() {
        if (geometryStyle == null) {
            geometryStyle = new ArrayList<GeometryStylePropertyType>();
        }
        return this.geometryStyle;
    }

    /**
     * Gets the value of the labelStyle property.
     * 
     * @return possible object is {@link LabelStylePropertyType }
     * 
     */
    public LabelStylePropertyType getLabelStyle() {
        return labelStyle;
    }

    /**
     * Gets the value of the queryGrammar property.
     * 
     * @return possible object is {@link QueryGrammarEnumeration }
     * 
     */
    public QueryGrammarEnumeration getQueryGrammar() {
        return queryGrammar;
    }

    /**
     * Gets the value of the topologyStyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be
     * present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the topologyStyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getTopologyStyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link TopologyStylePropertyType }
     * 
     * 
     */
    public List<TopologyStylePropertyType> getTopologyStyle() {
        if (topologyStyle == null) {
            topologyStyle = new ArrayList<TopologyStylePropertyType>();
        }
        return this.topologyStyle;
    }

    /**
     * Sets the value of the baseType property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setBaseType(String value) {
        this.baseType = value;
    }

    /**
     * Sets the value of the featureConstraint property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setFeatureConstraint(String value) {
        this.featureConstraint = value;
    }

    /**
     * Sets the value of the featureType property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setFeatureType(String value) {
        this.featureType = value;
    }

    /**
     * Sets the value of the labelStyle property.
     * 
     * @param value allowed object is {@link LabelStylePropertyType }
     * 
     */
    public void setLabelStyle(LabelStylePropertyType value) {
        this.labelStyle = value;
    }

    /**
     * Sets the value of the queryGrammar property.
     * 
     * @param value allowed object is {@link QueryGrammarEnumeration }
     * 
     */
    public void setQueryGrammar(QueryGrammarEnumeration value) {
        this.queryGrammar = value;
    }

}
