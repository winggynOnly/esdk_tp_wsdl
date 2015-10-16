
package com.huawei.esdk.csdemo.soap.impl.autogen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PointToPointCDREx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointToPointCDREx">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="callingUri" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="callingProtocol" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="calledUri" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="calledProtocol" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointToPointCDREx", propOrder = {
    "callingUri",
    "callingProtocol",
    "calledUri",
    "calledProtocol",
    "rate",
    "startTime",
    "endTime"
})
public class PointToPointCDREx {

    @XmlElement(required = true)
    protected String callingUri;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "int")
    protected Integer callingProtocol;
    @XmlElement(required = true)
    protected String calledUri;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "int")
    protected Integer calledProtocol;
    @XmlElement(required = true)
    protected String rate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;

    /**
     * Gets the value of the callingUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingUri() {
        return callingUri;
    }

    /**
     * Sets the value of the callingUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingUri(String value) {
        this.callingUri = value;
    }

    /**
     * Gets the value of the callingProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getCallingProtocol() {
        return callingProtocol;
    }

    /**
     * Sets the value of the callingProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingProtocol(Integer value) {
        this.callingProtocol = value;
    }

    /**
     * Gets the value of the calledUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledUri() {
        return calledUri;
    }

    /**
     * Sets the value of the calledUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledUri(String value) {
        this.calledUri = value;
    }

    /**
     * Gets the value of the calledProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getCalledProtocol() {
        return calledProtocol;
    }

    /**
     * Sets the value of the calledProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledProtocol(Integer value) {
        this.calledProtocol = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRate(String value) {
        this.rate = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

}
