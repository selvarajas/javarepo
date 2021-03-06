
package com.agimatec.publicinterfaces.service;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b14002
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "ReservationServiceException", targetNamespace = "http://service.publicinterfaces.agimatec.com")
public class ReservationServiceException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ReservationServiceException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public ReservationServiceException_Exception(String message, ReservationServiceException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public ReservationServiceException_Exception(String message, ReservationServiceException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.agimatec.publicinterfaces.service.ReservationServiceException
     */
    public ReservationServiceException getFaultInfo() {
        return faultInfo;
    }

}
