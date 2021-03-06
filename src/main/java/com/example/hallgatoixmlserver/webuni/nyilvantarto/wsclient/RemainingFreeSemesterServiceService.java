
package com.example.hallgatoixmlserver.webuni.nyilvantarto.wsclient;

import jakarta.xml.ws.*;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0-M2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "RemainingFreeSemesterServiceService", targetNamespace = "http://service.ws.freesemesterbackend.webuni.hu/", wsdlLocation = "file:/Users/patonaiszabolcs/IdeaProjects/HallgatoiXMLServer/src/main/resources/wsdl/remaining.wsdl")
public class RemainingFreeSemesterServiceService
    extends Service
{

    private final static URL REMAININGFREESEMESTERSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException REMAININGFREESEMESTERSERVICESERVICE_EXCEPTION;
    private final static QName REMAININGFREESEMESTERSERVICESERVICE_QNAME = new QName("http://service.ws.freesemesterbackend.webuni.hu/", "RemainingFreeSemesterServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/Users/patonaiszabolcs/IdeaProjects/HallgatoiXMLServer/src/main/resources/wsdl/remaining.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        REMAININGFREESEMESTERSERVICESERVICE_WSDL_LOCATION = url;
        REMAININGFREESEMESTERSERVICESERVICE_EXCEPTION = e;
    }

    public RemainingFreeSemesterServiceService() {
        super(__getWsdlLocation(), REMAININGFREESEMESTERSERVICESERVICE_QNAME);
    }

    public RemainingFreeSemesterServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), REMAININGFREESEMESTERSERVICESERVICE_QNAME, features);
    }

    public RemainingFreeSemesterServiceService(URL wsdlLocation) {
        super(wsdlLocation, REMAININGFREESEMESTERSERVICESERVICE_QNAME);
    }

    public RemainingFreeSemesterServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, REMAININGFREESEMESTERSERVICESERVICE_QNAME, features);
    }

    public RemainingFreeSemesterServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RemainingFreeSemesterServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns RemainingFreeSemesterIF
     */
    @WebEndpoint(name = "RemainingFreeSemesterServicePort")
    public RemainingFreeSemesterIF getRemainingFreeSemesterServicePort() {
        return super.getPort(new QName("http://service.ws.freesemesterbackend.webuni.hu/", "RemainingFreeSemesterServicePort"), RemainingFreeSemesterIF.class);
    }

    /**
     * 
     * @param features
     *     A list of {&#064;link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the &lt;code&gt;features&lt;/code&gt; parameter will have their default values.
     * @return
     *     returns RemainingFreeSemesterIF
     */
    @WebEndpoint(name = "RemainingFreeSemesterServicePort")
    public RemainingFreeSemesterIF getRemainingFreeSemesterServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.ws.freesemesterbackend.webuni.hu/", "RemainingFreeSemesterServicePort"), RemainingFreeSemesterIF.class, features);
    }

    private static URL __getWsdlLocation() {
        if (REMAININGFREESEMESTERSERVICESERVICE_EXCEPTION!= null) {
            throw REMAININGFREESEMESTERSERVICESERVICE_EXCEPTION;
        }
        return REMAININGFREESEMESTERSERVICESERVICE_WSDL_LOCATION;
    }

}
