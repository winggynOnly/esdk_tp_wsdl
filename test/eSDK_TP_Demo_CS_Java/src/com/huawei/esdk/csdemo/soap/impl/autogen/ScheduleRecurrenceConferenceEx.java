
package com.huawei.esdk.csdemo.soap.impl.autogen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scheduleConf" type="{http://smc.huawei.com/}RecurrenceConfInfoEx"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "scheduleConf"
})
@XmlRootElement(name = "scheduleRecurrenceConferenceEx")
public class ScheduleRecurrenceConferenceEx {

    @XmlElement(required = true)
    protected RecurrenceConfInfoEx scheduleConf;

    /**
     * Gets the value of the scheduleConf property.
     * 
     * @return
     *     possible object is
     *     {@link RecurrenceConfInfoEx }
     *     
     */
    public RecurrenceConfInfoEx getScheduleConf() {
        return scheduleConf;
    }

    /**
     * Sets the value of the scheduleConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurrenceConfInfoEx }
     *     
     */
    public void setScheduleConf(RecurrenceConfInfoEx value) {
        this.scheduleConf = value;
    }

}
