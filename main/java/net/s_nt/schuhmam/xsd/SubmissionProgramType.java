//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.03 at 10:46:34 AM CEST 
//


package net.s_nt.schuhmam.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * SubmissionProgramType is one program of the entire submission. It contains the output of the parser which was made for this program. If applicable it contains a percentage of the match between the basecode program and this program.
 * 
 * <p>Java class for SubmissionProgramType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubmissionProgramType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parser" type="{http://jplag.ipd.kit.edu/JPlagService/JPlagXMLResult}ParserLogEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="basecodeMatchPercentage" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="parsedSuccessfully" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="basecodeMatch" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubmissionProgramType", propOrder = {
    "parser",
    "basecodeMatchPercentage",
    "parsedSuccessfully",
    "basecodeMatch"
})
public class SubmissionProgramType
{
    protected List<ParserLogEntryType> parser;
    protected Float basecodeMatchPercentage;
    protected boolean parsedSuccessfully;
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object basecodeMatch;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the parser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParserLogEntryType }
     * 
     * 
     */
    public List<ParserLogEntryType> getParser() {
        if (parser == null) {
            parser = new ArrayList<ParserLogEntryType>();
        }
        return this.parser;
    }

    /**
     * Gets the value of the basecodeMatchPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBasecodeMatchPercentage() {
        return basecodeMatchPercentage;
    }

    /**
     * Sets the value of the basecodeMatchPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBasecodeMatchPercentage(Float value) {
        this.basecodeMatchPercentage = value;
    }

    /**
     * Gets the value of the parsedSuccessfully property.
     * 
     */
    public boolean isParsedSuccessfully() {
        return parsedSuccessfully;
    }

    /**
     * Sets the value of the parsedSuccessfully property.
     * 
     */
    public void setParsedSuccessfully(boolean value) {
        this.parsedSuccessfully = value;
    }

    /**
     * Gets the value of the basecodeMatch property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBasecodeMatch() {
        return basecodeMatch;
    }

    /**
     * Sets the value of the basecodeMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBasecodeMatch(Object value) {
        this.basecodeMatch = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    @Override
    public boolean equals(Object obj)
    {
    	if (obj == null)
    		return false;
    	
    	if (obj instanceof SubmissionProgramType)
    		if (((SubmissionProgramType) obj).getName().equals(this.getName()))
    			return true;
    	
    	return false;
    }
    
    @Override
    public String toString()
    {
    	return this.name;
    }
}