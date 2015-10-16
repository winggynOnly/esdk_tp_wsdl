
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
 *         &lt;element name="queryConfig" type="{http://smc.huawei.com/}PointToPointCDRQueryConfigEx"/>
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
    "queryConfig"
})
@XmlRootElement(name = "queryPointToPointCDREx")
public class QueryPointToPointCDREx {

    @XmlElement(required = true)
    protected PointToPointCDRQueryConfigEx queryConfig;

    /**
     * Gets the value of the queryConfig property.
     * 
     * @return
     *     possible object is
     *     {@link PointToPointCDRQueryConfigEx }
     *     
     */
    public PointToPointCDRQueryConfigEx getQueryConfig() {
        return queryConfig;
    }

    /**
     * Sets the value of the queryConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointToPointCDRQueryConfigEx }
     *     
     */
    public void setQueryConfig(PointToPointCDRQueryConfigEx value) {
        this.queryConfig = value;
    }

}
