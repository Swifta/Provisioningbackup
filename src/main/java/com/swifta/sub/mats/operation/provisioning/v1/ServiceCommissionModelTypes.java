
package com.swifta.sub.mats.operation.provisioning.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceCommissionModelTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="serviceCommissionModelTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOTAPPLICABLE"/>
 *     &lt;enumeration value="TIERED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "serviceCommissionModelTypes")
@XmlEnum
public enum ServiceCommissionModelTypes {

    NOTAPPLICABLE,
    TIERED;

    public String value() {
        return name();
    }

    public static ServiceCommissionModelTypes fromValue(String v) {
        return valueOf(v);
    }

}
