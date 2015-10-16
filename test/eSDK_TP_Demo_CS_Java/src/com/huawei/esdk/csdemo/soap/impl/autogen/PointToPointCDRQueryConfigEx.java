
package com.huawei.esdk.csdemo.soap.impl.autogen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PointToPointCDRQueryConfigEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointToPointCDRQueryConfigEx">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beginTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *         &lt;element name="endPoint" type="{http://smc.huawei.com/}CallEndPointEx" minOccurs="0"/>
 *         &lt;element name="pageParam" type="{http://smc.huawei.com/}PageParamEx"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointToPointCDRQueryConfigEx", propOrder = {
    "beginTime",
    "duration",
    "endPoint",
    "pageParam"
})
public class PointToPointCDRQueryConfigEx {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar beginTime;
    @XmlElement(required = true)
    protected Duration duration;
    protected CallEndPointEx endPoint;
    @XmlElement(required = true)
    protected PageParamEx pageParam;

    /**
     * Gets the value of the beginTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginTime() {
        return beginTime;
    }

    /**
     * Sets the value of the beginTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginTime(XMLGregorianCalendar value) {
        this.beginTime = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * Gets the value of the endPoint property.
     * 
     * @return
     *     possible object is
     *     {@link CallEndPointEx }
     *     
     */
    public CallEndPointEx getEndPoint() {
        return endPoint;
    }

    /**
     * Sets the value of the endPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallEndPointEx }
     *     
     */
    public void setEndPoint(CallEndPointEx value) {
        this.endPoint = value;
    }

    /**
     * Gets the value of the pageParam property.
     * 
     * @return
     *     possible object is
     *     {@link PageParamEx }
     *     
     */
    public PageParamEx getPageParam() {
        return pageParam;
    }

    /**
     * Sets the value of the pageParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageParamEx }
     *     
     */
    public void setPageParam(PageParamEx value) {
        this.pageParam = value;
    }

}
