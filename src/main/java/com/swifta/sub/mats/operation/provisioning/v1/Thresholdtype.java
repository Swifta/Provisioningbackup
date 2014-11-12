
package com.swifta.sub.mats.operation.provisioning.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for thresholdtype.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="thresholdtype">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MAXIMUM_BALANCE_ON_ACCOUNT"/>
 *     &lt;enumeration value="MAXIMUM_AMOUNT_TO_SEND"/>
 *     &lt;enumeration value="MAXIMUM_AMOUNT_TO_RECEIVE"/>
 *     &lt;enumeration value="MINIMUM_AMOUNT_TO_SEND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "thresholdtype")
@XmlEnum
public enum Thresholdtype {

    MAXIMUM_BALANCE_ON_ACCOUNT,
    MAXIMUM_AMOUNT_TO_SEND,
    MAXIMUM_AMOUNT_TO_RECEIVE,
    MINIMUM_AMOUNT_TO_SEND;

    public String value() {
        return name();
    }

    public static Thresholdtype fromValue(String v) {
        return valueOf(v);
    }

}
