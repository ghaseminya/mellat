
package com.bps.sw.core.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bpRefundVerifyRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bpRefundVerifyRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="terminalId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="refundOrderId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="refundReferenceId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bpRefundVerifyRequest", propOrder = {
    "terminalId",
    "userName",
    "userPassword",
    "orderId",
    "refundOrderId",
    "refundReferenceId"
})
public class BpRefundVerifyRequest {

    protected long terminalId;
    protected String userName;
    protected String userPassword;
    protected long orderId;
    protected long refundOrderId;
    protected long refundReferenceId;

    /**
     * Gets the value of the terminalId property.
     * 
     */
    public long getTerminalId() {
        return terminalId;
    }

    /**
     * Sets the value of the terminalId property.
     * 
     */
    public void setTerminalId(long value) {
        this.terminalId = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the userPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * Sets the value of the userPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPassword(String value) {
        this.userPassword = value;
    }

    /**
     * Gets the value of the orderId property.
     * 
     */
    public long getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     */
    public void setOrderId(long value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the refundOrderId property.
     * 
     */
    public long getRefundOrderId() {
        return refundOrderId;
    }

    /**
     * Sets the value of the refundOrderId property.
     * 
     */
    public void setRefundOrderId(long value) {
        this.refundOrderId = value;
    }

    /**
     * Gets the value of the refundReferenceId property.
     * 
     */
    public long getRefundReferenceId() {
        return refundReferenceId;
    }

    /**
     * Sets the value of the refundReferenceId property.
     * 
     */
    public void setRefundReferenceId(long value) {
        this.refundReferenceId = value;
    }

}
