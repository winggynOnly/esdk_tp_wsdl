
package com.huawei.esdk.csdemo.soap.impl.autogen;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import com.huawei.esdk.csdemo.soap.impl.utils.StringUtils;

public class Adapter3
    extends XmlAdapter<String, Double>
{


    public Double unmarshal(String value) {
        if (StringUtils.isEmpty(value))
        {
            return null;
        }
        return ((double)javax.xml.bind.DatatypeConverter.parseDouble(value));
    }

    public String marshal(Double value) {
        if (value == null) {
            return null;
        }
        return (javax.xml.bind.DatatypeConverter.printDouble((double)(double)value));
    }

}
