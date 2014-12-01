
package com.swifta.sub.mats.operation.provisioning.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceFeeModelTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="serviceFeeModelTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TIERED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "serviceFeeModelTypes")
@XmlEnum
public enum ServiceFeeModelTypes {

    TIERED;

    public String value() {
        return name();
    }

    public static ServiceFeeModelTypes fromValue(String v) {
        return valueOf(v);
    }

}
