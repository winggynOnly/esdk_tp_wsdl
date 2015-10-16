
package com.huawei.esdk.csdemo.soap.impl.autogen;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import com.huawei.esdk.csdemo.soap.impl.utils.StringUtils;


public class Adapter2
    extends XmlAdapter<String, Integer>
{


    public Integer unmarshal(String value) {
        if (StringUtils.isEmpty(value))
        {
            return null;
        }
        return ((int)javax.xml.bind.DatatypeConverter.parseInt(value));
    }

    public String marshal(Integer value) {
        if (value == null) {
            return null;
        }
        return (javax.xml.bind.DatatypeConverter.printInt((int)(int)value));
    }
    
}
