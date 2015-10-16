
package com.huawei.esdk.csdemo.soap.impl.autogen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IPAddressFilterEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IPAddressFilterEx">
 *   &lt;complexContent>
 *     &lt;extension base="{http://smc.huawei.com/}FilterBaseEx">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://smc.huawei.com/}IPAddressEx"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPAddressFilterEx", propOrder = {
    "value"
})
public class IPAddressFilterEx
    extends FilterBaseEx
{

    @XmlElement(required = true)
    protected IPAddressEx value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link IPAddressEx }
     *     
     */
    public IPAddressEx getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link IPAddressEx }
     *     
     */
    public void setValue(IPAddressEx value) {
        this.value = value;
    }

}
