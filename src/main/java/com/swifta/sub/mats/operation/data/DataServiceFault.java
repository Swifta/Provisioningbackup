
/**
 * DataServiceFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.swifta.sub.mats.operation.data;

public class DataServiceFault extends java.lang.Exception{

    private static final long serialVersionUID = 1415658538671L;
    
    private com.swifta.sub.mats.operation.data.MatsdataserviceStub.DataServiceFault faultMessage;

    
        public DataServiceFault() {
            super("DataServiceFault");
        }

        public DataServiceFault(java.lang.String s) {
           super(s);
        }

        public DataServiceFault(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public DataServiceFault(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.swifta.sub.mats.operation.data.MatsdataserviceStub.DataServiceFault msg){
       faultMessage = msg;
    }
    
    public com.swifta.sub.mats.operation.data.MatsdataserviceStub.DataServiceFault getFaultMessage(){
       return faultMessage;
    }
}
    