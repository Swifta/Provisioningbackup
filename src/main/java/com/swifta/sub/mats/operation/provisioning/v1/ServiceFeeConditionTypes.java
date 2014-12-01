
package com.swifta.sub.mats.operation.provisioning.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceFeeConditionTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="serviceFeeConditionTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TRANSACTIONTYPE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "serviceFeeConditionTypes")
@XmlEnum
public enum ServiceFeeConditionTypes {

    TRANSACTIONTYPE;

    public String value() {
        return name();
    }

    public static ServiceFeeConditionTypes fromValue(String v) {
        return valueOf(v);
    }

}
