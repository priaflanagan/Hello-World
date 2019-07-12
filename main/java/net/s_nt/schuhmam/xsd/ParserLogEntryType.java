//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.03 at 10:46:34 AM CEST 
//


package net.s_nt.schuhmam.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This type represents one protocol entry of a parser log with a message and a type.
 * The type is a signed byte (in Java byte primitive data type) which allows the following values: 1, 2, 4, 8, 16, 32, 64.
 *  1: ERROR
 *  2: INFORMATION
 *  4: WARNING
 *  8: DEBUG
 *  16: VERBOSE_PARSER
 *  32: COMPILE_ERROR
 *  64: Currently not in use.
 * 
 * <p>Java class for ParserLogEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParserLogEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *             &lt;enumeration value="1"/>
 *             &lt;enumeration value="2"/>
 *             &lt;enumeration value="4"/>
 *             &lt;enumeration value="8"/>
 *             &lt;enumeration value="16"/>
 *             &lt;enumeration value="32"/>
 *             &lt;enumeration value="64"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParserLogEntryType", propOrder = {
    "message"
})
public class ParserLogEntryType
{
    @XmlElement(required = true)
    protected String message;
    @XmlAttribute(name = "type", required = true)
    protected int type;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the type property.
     * 
     */
    public int getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     */
    public void setType(int value) {
        this.type = value;
    }

	@Override
	public String toString()
	{
		return String.format("[%d] :: %s", this.type, this.message);
	}
}