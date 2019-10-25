package mx.gob.segob.dgti.ecurp.wserv.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mssg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessionID",
    "mssg"
})
@XmlRootElement(name = "getConfirm")
public class GetConfirm {

    @XmlElementRef(name = "sessionID", namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx", type = JAXBElement.class)
    protected JAXBElement<String> sessionID;
    @XmlElementRef(name = "Mssg", namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx", type = JAXBElement.class)
    protected JAXBElement<String> mssg;

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSessionID(JAXBElement<String> value) {
        this.sessionID = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mssg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMssg() {
        return mssg;
    }

    /**
     * Sets the value of the mssg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMssg(JAXBElement<String> value) {
        this.mssg = ((JAXBElement<String> ) value);
    }

}
