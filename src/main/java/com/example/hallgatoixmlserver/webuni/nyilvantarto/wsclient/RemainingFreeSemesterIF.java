
package com.example.hallgatoixmlserver.webuni.nyilvantarto.wsclient;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0-M2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "RemainingFreeSemesterIF", targetNamespace = "http://remote.ws.freesemesterbackend.webuni.hu/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface RemainingFreeSemesterIF {


    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getRemainingSemester", targetNamespace = "http://remote.ws.freesemesterbackend.webuni.hu/", className = "com.example.hallgatoixmlserver.webuni.nyilvantarto.wsclient.GetRemainingSemester")
    @ResponseWrapper(localName = "getRemainingSemesterResponse", targetNamespace = "http://remote.ws.freesemesterbackend.webuni.hu/", className = "com.example.hallgatoixmlserver.webuni.nyilvantarto.wsclient.GetRemainingSemesterResponse")
    public int getRemainingSemester(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}