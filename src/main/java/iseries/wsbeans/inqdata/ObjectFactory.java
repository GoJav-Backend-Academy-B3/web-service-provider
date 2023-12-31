//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.26 at 01:06:11 PM WIB 
//


package iseries.wsbeans.inqdata;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the iseries.wsbeans.inqdata package. 
 * <p>An ObjectFactory allows you to programatically 
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

    private final static QName _Inqdata_QNAME = new QName("http://inqdata.wsbeans.iseries/", "inqdata");
    private final static QName _InqdataResponse_QNAME = new QName("http://inqdata.wsbeans.iseries/", "inqdataResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: iseries.wsbeans.inqdata
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Inqdata }
     * 
     */
    public Inqdata createInqdata() {
        return new Inqdata();
    }

    /**
     * Create an instance of {@link InqdataResponse }
     * 
     */
    public InqdataResponse createInqdataResponse() {
        return new InqdataResponse();
    }

    /**
     * Create an instance of {@link InqdataInput }
     * 
     */
    public InqdataInput createInqdataInput() {
        return new InqdataInput();
    }

    /**
     * Create an instance of {@link InqdataResult }
     * 
     */
    public InqdataResult createInqdataResult() {
        return new InqdataResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Inqdata }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Inqdata }{@code >}
     */
    @XmlElementDecl(namespace = "http://inqdata.wsbeans.iseries/", name = "inqdata")
    public JAXBElement<Inqdata> createInqdata(Inqdata value) {
        return new JAXBElement<Inqdata>(_Inqdata_QNAME, Inqdata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InqdataResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InqdataResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://inqdata.wsbeans.iseries/", name = "inqdataResponse")
    public JAXBElement<InqdataResponse> createInqdataResponse(InqdataResponse value) {
        return new JAXBElement<InqdataResponse>(_InqdataResponse_QNAME, InqdataResponse.class, null, value);
    }

}
