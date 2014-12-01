
package com.swifta.sub.mats.operation.provisioning.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceFeematrix.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="serviceFeematrix">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PERCENT"/>
 *     &lt;enumeration value="FIXED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "serviceFeematrix")
@XmlEnum
public enum ServiceFeematrix {

    PERCENT,
    FIXED;

    public String value() {
        return name();
    }

    public static ServiceFeematrix fromValue(String v) {
        return valueOf(v);
    }

}
