
package com.swifta.sub.mats.operation.provisioning.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transfercounttype.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="transfercounttype">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NUMBEROFTIMES_BASED"/>
 *     &lt;enumeration value="AMOUNT_BASED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "transfercounttype")
@XmlEnum
public enum Transfercounttype {

    NUMBEROFTIMES_BASED,
    AMOUNT_BASED;

    public String value() {
        return name();
    }

    public static Transfercounttype fromValue(String v) {
        return valueOf(v);
    }

}
