
/**
 * MatsdataserviceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.swifta.sub.mats.operation.data;

    /**
     *  MatsdataserviceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class MatsdataserviceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public MatsdataserviceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public MatsdataserviceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for activationrequest method
            * override this method for handling normal response from activationrequest operation
            */
           public void receiveResultactivationrequest(
                    com.swifta.sub.mats.operation.data.MatsdataserviceStub.ActivationresponsesE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from activationrequest operation
           */
            public void receiveErroractivationrequest(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for linkccountrequest method
            * override this method for handling normal response from linkccountrequest operation
            */
           public void receiveResultlinkccountrequest(
                    com.swifta.sub.mats.operation.data.MatsdataserviceStub.LinkaccountresponsesE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from linkccountrequest operation
           */
            public void receiveErrorlinkccountrequest(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for setparentrequest method
            * override this method for handling normal response from setparentrequest operation
            */
           public void receiveResultsetparentrequest(
                    com.swifta.sub.mats.operation.data.MatsdataserviceStub.SetparentresponsesE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from setparentrequest operation
           */
            public void receiveErrorsetparentrequest(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for setdefaultaccountrequest method
            * override this method for handling normal response from setdefaultaccountrequest operation
            */
           public void receiveResultsetdefaultaccountrequest(
                    com.swifta.sub.mats.operation.data.MatsdataserviceStub.SetdefaultaccountresponsesE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from setdefaultaccountrequest operation
           */
            public void receiveErrorsetdefaultaccountrequest(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for registration method
            * override this method for handling normal response from registration operation
            */
           public void receiveResultregistration(
                    com.swifta.sub.mats.operation.data.MatsdataserviceStub.RegistrationresponsesE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from registration operation
           */
            public void receiveErrorregistration(java.lang.Exception e) {
            }
                


    }
    