
package com.swifta.sub.mats.operation.provisioning.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceCommissionConditionTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="serviceCommissionConditionTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FEE"/>
 *     &lt;enumeration value="AMOUNT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "serviceCommissionConditionTypes")
@XmlEnum
public enum ServiceCommissionConditionTypes {

    FEE,
    AMOUNT;

    public String value() {
        return name();
    }

    public static ServiceCommissionConditionTypes fromValue(String v) {
        return valueOf(v);
    }

}
