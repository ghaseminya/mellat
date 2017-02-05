
package com.bps.sw.core.interfaces;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bps.sw.core.interfaces package. 
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

    private final static QName _BpReversalRequest_QNAME = new QName("http://interfaces.core.sw.bps.com/", "bpReversalRequest");
    private final static QName _BpSaleReferenceIdRequest_QNAME = new QName("http://interfaces.core.sw.bps.com/", "bpSaleReferenceIdRequest");
    private final static QName _BpDynamicPayRequestResponse_QNAME = new QName("http://interfaces.core.sw.bps.com/", "bpDynamicPayRequestResponse");
    private final static QName _BpReversalRequestResponse_QNAME = new QName("http://interfaces.core.sw.bps.com/", "bpReversalRequestResponse");
    private final static QName _BpVerifyRequest_QNAME = new QName("http://interfaces.core.sw.bps.com/", "bpVerifyRequest");
    private final static QName _BpPayRequestResponse_QNAME = new QName("http://interfaces.core.sw.bps.com/", "bpPayRequestResponse");
    private final static QName _BpRefundVerifyRequestResponse_QNAME = new QName("http://interfaces.core.sw.bps.com/", "bpRefundVerifyRequestResponse");
    private final static QName _BpRefundVerifyRequest_QNAME = new QName("http://interfaces.core.sw.bps.com/", "bpRefundVerifyRequest");
    private final static QName _BpPayRequest_QNAME = new QName("http://interfaces.core.sw.bps.com/", "bpPayRequest");
    private final static QName _BpRefundInquiryRequest_QNAME = new QName("http://interfaces.core.sw.bps.com/", "bpRefundInquiryRequest");
    private final static QName _BpRefundRequest_QNAME = new QName("http://interfaces.core.sw.bps.com/", "bpRefundRequest");
    private final static QName _BpRefundInquiryRequestResponse_QNAME = new QName("http://interfaces.core.sw.bps.com/", "bpRefundInquiryRequestResponse");
    private final static QName _BpSettleRequestResponse_QNAME = new QName("http://interfaces.core.sw.bps.com/", "bpSettleRequestResponse");
    private final static QName _BpSettleRequest_QNAME = new QName("http://interfaces.core.sw.bps.com/", "bpSettleRequest");
    private final static QName _BpDynamicPayRequest_QNAME = new QName("http://interfaces.core.sw.bps.com/", "bpDynamicPayRequest");
    private final static QName _BpRefundRequestResponse_QNAME = new QName("http://interfaces.core.sw.bps.com/", "bpRefundRequestResponse");
    private final static QName _BpSaleReferenceIdRequestResponse_QNAME = new QName("http://interfaces.core.sw.bps.com/", "bpSaleReferenceIdRequestResponse");
    private final static QName _BpInquiryRequestResponse_QNAME = new QName("http://interfaces.core.sw.bps.com/", "bpInquiryRequestResponse");
    private final static QName _BpVerifyRequestResponse_QNAME = new QName("http://interfaces.core.sw.bps.com/", "bpVerifyRequestResponse");
    private final static QName _BpInquiryRequest_QNAME = new QName("http://interfaces.core.sw.bps.com/", "bpInquiryRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bps.sw.core.interfaces
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BpReversalRequest }
     * 
     */
    public BpReversalRequest createBpReversalRequest() {
        return new BpReversalRequest();
    }

    /**
     * Create an instance of {@link BpRefundInquiryRequest }
     * 
     */
    public BpRefundInquiryRequest createBpRefundInquiryRequest() {
        return new BpRefundInquiryRequest();
    }

    /**
     * Create an instance of {@link BpInquiryRequestResponse }
     * 
     */
    public BpInquiryRequestResponse createBpInquiryRequestResponse() {
        return new BpInquiryRequestResponse();
    }

    /**
     * Create an instance of {@link BpVerifyRequest }
     * 
     */
    public BpVerifyRequest createBpVerifyRequest() {
        return new BpVerifyRequest();
    }

    /**
     * Create an instance of {@link BpRefundRequestResponse }
     * 
     */
    public BpRefundRequestResponse createBpRefundRequestResponse() {
        return new BpRefundRequestResponse();
    }

    /**
     * Create an instance of {@link BpDynamicPayRequestResponse }
     * 
     */
    public BpDynamicPayRequestResponse createBpDynamicPayRequestResponse() {
        return new BpDynamicPayRequestResponse();
    }

    /**
     * Create an instance of {@link BpSettleRequest }
     * 
     */
    public BpSettleRequest createBpSettleRequest() {
        return new BpSettleRequest();
    }

    /**
     * Create an instance of {@link BpInquiryRequest }
     * 
     */
    public BpInquiryRequest createBpInquiryRequest() {
        return new BpInquiryRequest();
    }

    /**
     * Create an instance of {@link BpSaleReferenceIdRequestResponse }
     * 
     */
    public BpSaleReferenceIdRequestResponse createBpSaleReferenceIdRequestResponse() {
        return new BpSaleReferenceIdRequestResponse();
    }

    /**
     * Create an instance of {@link BpRefundVerifyRequestResponse }
     * 
     */
    public BpRefundVerifyRequestResponse createBpRefundVerifyRequestResponse() {
        return new BpRefundVerifyRequestResponse();
    }

    /**
     * Create an instance of {@link BpReversalRequestResponse }
     * 
     */
    public BpReversalRequestResponse createBpReversalRequestResponse() {
        return new BpReversalRequestResponse();
    }

    /**
     * Create an instance of {@link BpSettleRequestResponse }
     * 
     */
    public BpSettleRequestResponse createBpSettleRequestResponse() {
        return new BpSettleRequestResponse();
    }

    /**
     * Create an instance of {@link BpRefundRequest }
     * 
     */
    public BpRefundRequest createBpRefundRequest() {
        return new BpRefundRequest();
    }

    /**
     * Create an instance of {@link BpRefundVerifyRequest }
     * 
     */
    public BpRefundVerifyRequest createBpRefundVerifyRequest() {
        return new BpRefundVerifyRequest();
    }

    /**
     * Create an instance of {@link BpVerifyRequestResponse }
     * 
     */
    public BpVerifyRequestResponse createBpVerifyRequestResponse() {
        return new BpVerifyRequestResponse();
    }

    /**
     * Create an instance of {@link BpPayRequest }
     * 
     */
    public BpPayRequest createBpPayRequest() {
        return new BpPayRequest();
    }

    /**
     * Create an instance of {@link BpRefundInquiryRequestResponse }
     * 
     */
    public BpRefundInquiryRequestResponse createBpRefundInquiryRequestResponse() {
        return new BpRefundInquiryRequestResponse();
    }

    /**
     * Create an instance of {@link BpPayRequestResponse }
     * 
     */
    public BpPayRequestResponse createBpPayRequestResponse() {
        return new BpPayRequestResponse();
    }

    /**
     * Create an instance of {@link BpSaleReferenceIdRequest }
     * 
     */
    public BpSaleReferenceIdRequest createBpSaleReferenceIdRequest() {
        return new BpSaleReferenceIdRequest();
    }

    /**
     * Create an instance of {@link BpDynamicPayRequest }
     * 
     */
    public BpDynamicPayRequest createBpDynamicPayRequest() {
        return new BpDynamicPayRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BpReversalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.core.sw.bps.com/", name = "bpReversalRequest")
    public JAXBElement<BpReversalRequest> createBpReversalRequest(BpReversalRequest value) {
        return new JAXBElement<BpReversalRequest>(_BpReversalRequest_QNAME, BpReversalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BpSaleReferenceIdRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.core.sw.bps.com/", name = "bpSaleReferenceIdRequest")
    public JAXBElement<BpSaleReferenceIdRequest> createBpSaleReferenceIdRequest(BpSaleReferenceIdRequest value) {
        return new JAXBElement<BpSaleReferenceIdRequest>(_BpSaleReferenceIdRequest_QNAME, BpSaleReferenceIdRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BpDynamicPayRequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.core.sw.bps.com/", name = "bpDynamicPayRequestResponse")
    public JAXBElement<BpDynamicPayRequestResponse> createBpDynamicPayRequestResponse(BpDynamicPayRequestResponse value) {
        return new JAXBElement<BpDynamicPayRequestResponse>(_BpDynamicPayRequestResponse_QNAME, BpDynamicPayRequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BpReversalRequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.core.sw.bps.com/", name = "bpReversalRequestResponse")
    public JAXBElement<BpReversalRequestResponse> createBpReversalRequestResponse(BpReversalRequestResponse value) {
        return new JAXBElement<BpReversalRequestResponse>(_BpReversalRequestResponse_QNAME, BpReversalRequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BpVerifyRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.core.sw.bps.com/", name = "bpVerifyRequest")
    public JAXBElement<BpVerifyRequest> createBpVerifyRequest(BpVerifyRequest value) {
        return new JAXBElement<BpVerifyRequest>(_BpVerifyRequest_QNAME, BpVerifyRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BpPayRequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.core.sw.bps.com/", name = "bpPayRequestResponse")
    public JAXBElement<BpPayRequestResponse> createBpPayRequestResponse(BpPayRequestResponse value) {
        return new JAXBElement<BpPayRequestResponse>(_BpPayRequestResponse_QNAME, BpPayRequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BpRefundVerifyRequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.core.sw.bps.com/", name = "bpRefundVerifyRequestResponse")
    public JAXBElement<BpRefundVerifyRequestResponse> createBpRefundVerifyRequestResponse(BpRefundVerifyRequestResponse value) {
        return new JAXBElement<BpRefundVerifyRequestResponse>(_BpRefundVerifyRequestResponse_QNAME, BpRefundVerifyRequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BpRefundVerifyRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.core.sw.bps.com/", name = "bpRefundVerifyRequest")
    public JAXBElement<BpRefundVerifyRequest> createBpRefundVerifyRequest(BpRefundVerifyRequest value) {
        return new JAXBElement<BpRefundVerifyRequest>(_BpRefundVerifyRequest_QNAME, BpRefundVerifyRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BpPayRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.core.sw.bps.com/", name = "bpPayRequest")
    public JAXBElement<BpPayRequest> createBpPayRequest(BpPayRequest value) {
        return new JAXBElement<BpPayRequest>(_BpPayRequest_QNAME, BpPayRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BpRefundInquiryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.core.sw.bps.com/", name = "bpRefundInquiryRequest")
    public JAXBElement<BpRefundInquiryRequest> createBpRefundInquiryRequest(BpRefundInquiryRequest value) {
        return new JAXBElement<BpRefundInquiryRequest>(_BpRefundInquiryRequest_QNAME, BpRefundInquiryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BpRefundRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.core.sw.bps.com/", name = "bpRefundRequest")
    public JAXBElement<BpRefundRequest> createBpRefundRequest(BpRefundRequest value) {
        return new JAXBElement<BpRefundRequest>(_BpRefundRequest_QNAME, BpRefundRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BpRefundInquiryRequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.core.sw.bps.com/", name = "bpRefundInquiryRequestResponse")
    public JAXBElement<BpRefundInquiryRequestResponse> createBpRefundInquiryRequestResponse(BpRefundInquiryRequestResponse value) {
        return new JAXBElement<BpRefundInquiryRequestResponse>(_BpRefundInquiryRequestResponse_QNAME, BpRefundInquiryRequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BpSettleRequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.core.sw.bps.com/", name = "bpSettleRequestResponse")
    public JAXBElement<BpSettleRequestResponse> createBpSettleRequestResponse(BpSettleRequestResponse value) {
        return new JAXBElement<BpSettleRequestResponse>(_BpSettleRequestResponse_QNAME, BpSettleRequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BpSettleRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.core.sw.bps.com/", name = "bpSettleRequest")
    public JAXBElement<BpSettleRequest> createBpSettleRequest(BpSettleRequest value) {
        return new JAXBElement<BpSettleRequest>(_BpSettleRequest_QNAME, BpSettleRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BpDynamicPayRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.core.sw.bps.com/", name = "bpDynamicPayRequest")
    public JAXBElement<BpDynamicPayRequest> createBpDynamicPayRequest(BpDynamicPayRequest value) {
        return new JAXBElement<BpDynamicPayRequest>(_BpDynamicPayRequest_QNAME, BpDynamicPayRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BpRefundRequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.core.sw.bps.com/", name = "bpRefundRequestResponse")
    public JAXBElement<BpRefundRequestResponse> createBpRefundRequestResponse(BpRefundRequestResponse value) {
        return new JAXBElement<BpRefundRequestResponse>(_BpRefundRequestResponse_QNAME, BpRefundRequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BpSaleReferenceIdRequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.core.sw.bps.com/", name = "bpSaleReferenceIdRequestResponse")
    public JAXBElement<BpSaleReferenceIdRequestResponse> createBpSaleReferenceIdRequestResponse(BpSaleReferenceIdRequestResponse value) {
        return new JAXBElement<BpSaleReferenceIdRequestResponse>(_BpSaleReferenceIdRequestResponse_QNAME, BpSaleReferenceIdRequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BpInquiryRequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.core.sw.bps.com/", name = "bpInquiryRequestResponse")
    public JAXBElement<BpInquiryRequestResponse> createBpInquiryRequestResponse(BpInquiryRequestResponse value) {
        return new JAXBElement<BpInquiryRequestResponse>(_BpInquiryRequestResponse_QNAME, BpInquiryRequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BpVerifyRequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.core.sw.bps.com/", name = "bpVerifyRequestResponse")
    public JAXBElement<BpVerifyRequestResponse> createBpVerifyRequestResponse(BpVerifyRequestResponse value) {
        return new JAXBElement<BpVerifyRequestResponse>(_BpVerifyRequestResponse_QNAME, BpVerifyRequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BpInquiryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.core.sw.bps.com/", name = "bpInquiryRequest")
    public JAXBElement<BpInquiryRequest> createBpInquiryRequest(BpInquiryRequest value) {
        return new JAXBElement<BpInquiryRequest>(_BpInquiryRequest_QNAME, BpInquiryRequest.class, null, value);
    }

}
