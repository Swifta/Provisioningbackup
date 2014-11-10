
package com.swifta.sub.mats.operation.provisioning.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for identificationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="identificationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PASSP"/>
 *     &lt;enumeration value="DRLCS"/>
 *     &lt;enumeration value="SOCS"/>
 *     &lt;enumeration value="IDCD"/>
 *     &lt;enumeration value="EMID"/>
 *     &lt;enumeration value="NRIN"/>
 *     &lt;enumeration value="OTHR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "identificationType")
@XmlEnum
public enum IdentificationType {

    PASSP,
    DRLCS,
    SOCS,
    IDCD,
    EMID,
    NRIN,
    OTHR;

    public String value() {
        return name();
    }

    public static IdentificationType fromValue(String v) {
        return valueOf(v);
    }

}
