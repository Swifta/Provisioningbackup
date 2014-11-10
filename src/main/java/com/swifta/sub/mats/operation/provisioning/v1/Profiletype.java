
package com.swifta.sub.mats.operation.provisioning.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for profiletype.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="profiletype">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACCOUNT_HOLDER_PROFILE"/>
 *     &lt;enumeration value="ACCOUNT_HOLDER_ACCOUNT_REFERENCE_PROFILE"/>
 *     &lt;enumeration value="ACCOUNT_PROFILE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "profiletype")
@XmlEnum
public enum Profiletype {

    ACCOUNT_HOLDER_PROFILE,
    ACCOUNT_HOLDER_ACCOUNT_REFERENCE_PROFILE,
    ACCOUNT_PROFILE;

    public String value() {
        return name();
    }

    public static Profiletype fromValue(String v) {
        return valueOf(v);
    }

}
