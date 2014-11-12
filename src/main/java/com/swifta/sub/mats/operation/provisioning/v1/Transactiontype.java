
package com.swifta.sub.mats.operation.provisioning.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transactiontype.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="transactiontype">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SPCASHIN"/>
 *     &lt;enumeration value="SPCASHOUT"/>
 *     &lt;enumeration value="CASHIN"/>
 *     &lt;enumeration value="CASHOUT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "transactiontype")
@XmlEnum
public enum Transactiontype {

    SPCASHIN,
    SPCASHOUT,
    CASHIN,
    CASHOUT;

    public String value() {
        return name();
    }

    public static Transactiontype fromValue(String v) {
        return valueOf(v);
    }

}
