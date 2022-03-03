
package com.example.hallgatoixmlserver.webuni.nyilvantarto.wsclient;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;

import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.hallgatoixmlserver.webuni.nyilvantarto.wsclient package.
 * &lt;p&gt;An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetRemainingSemester_QNAME = new QName("http://remote.ws.freesemesterbackend.webuni.hu/", "getRemainingSemester");
    private final static QName _GetRemainingSemesterResponse_QNAME = new QName("http://remote.ws.freesemesterbackend.webuni.hu/", "getRemainingSemesterResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.hallgatoixmlserver.webuni.nyilvantarto.wsclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRemainingSemester }
     * 
     */
    public GetRemainingSemester createGetRemainingSemester() {
        return new GetRemainingSemester();
    }

    /**
     * Create an instance of {@link GetRemainingSemesterResponse }
     * 
     */
    public GetRemainingSemesterResponse createGetRemainingSemesterResponse() {
        return new GetRemainingSemesterResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRemainingSemester }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRemainingSemester }{@code >}
     */
    @XmlElementDecl(namespace = "http://remote.ws.freesemesterbackend.webuni.hu/", name = "getRemainingSemester")
    public JAXBElement<GetRemainingSemester> createGetRemainingSemester(GetRemainingSemester value) {
        return new JAXBElement<GetRemainingSemester>(_GetRemainingSemester_QNAME, GetRemainingSemester.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRemainingSemesterResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRemainingSemesterResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://remote.ws.freesemesterbackend.webuni.hu/", name = "getRemainingSemesterResponse")
    public JAXBElement<GetRemainingSemesterResponse> createGetRemainingSemesterResponse(GetRemainingSemesterResponse value) {
        return new JAXBElement<GetRemainingSemesterResponse>(_GetRemainingSemesterResponse_QNAME, GetRemainingSemesterResponse.class, null, value);
    }

}
