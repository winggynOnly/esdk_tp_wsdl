
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
 *         &lt;element name="orgId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="siteInfo" type="{http://smc.huawei.com/}TerminalInfoEx"/>
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
    "orgId",
    "siteInfo"
})
@XmlRootElement(name = "addSiteInfoEx")
public class AddSiteInfoEx {

    @XmlElement(required = true)
    protected String orgId;
    @XmlElement(required = true)
    protected TerminalInfoEx siteInfo;

    /**
     * Gets the value of the orgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * Sets the value of the orgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgId(String value) {
        this.orgId = value;
    }

    /**
     * Gets the value of the siteInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalInfoEx }
     *     
     */
    public TerminalInfoEx getSiteInfo() {
        return siteInfo;
    }

    /**
     * Sets the value of the siteInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalInfoEx }
     *     
     */
    public void setSiteInfo(TerminalInfoEx value) {
        this.siteInfo = value;
    }

}