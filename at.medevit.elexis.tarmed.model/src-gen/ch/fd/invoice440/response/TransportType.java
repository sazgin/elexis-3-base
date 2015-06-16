//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.21 at 02:51:03 PM CET 
//


package ch.fd.invoice440.response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="via" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="via" use="required" type="{http://www.forum-datenaustausch.ch/invoice}eanPartyType" />
 *                 &lt;attribute name="sequence_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="from" use="required" type="{http://www.forum-datenaustausch.ch/invoice}eanPartyType" />
 *       &lt;attribute name="to" use="required" type="{http://www.forum-datenaustausch.ch/invoice}eanPartyType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transportType", propOrder = {
    "via"
})
public class TransportType {

    @XmlElement(required = true)
    protected List<TransportType.Via> via;
    @XmlAttribute(name = "from", required = true)
    protected String from;
    @XmlAttribute(name = "to", required = true)
    protected String to;

    /**
     * Gets the value of the via property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the via property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportType.Via }
     * 
     * 
     */
    public List<TransportType.Via> getVia() {
        if (via == null) {
            via = new ArrayList<TransportType.Via>();
        }
        return this.via;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrom(String value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTo(String value) {
        this.to = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="via" use="required" type="{http://www.forum-datenaustausch.ch/invoice}eanPartyType" />
     *       &lt;attribute name="sequence_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Via {

        @XmlAttribute(name = "via", required = true)
        protected String via;
        @XmlAttribute(name = "sequence_id", required = true)
        @XmlSchemaType(name = "unsignedShort")
        protected int sequenceId;

        /**
         * Gets the value of the via property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVia() {
            return via;
        }

        /**
         * Sets the value of the via property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVia(String value) {
            this.via = value;
        }

        /**
         * Gets the value of the sequenceId property.
         * 
         */
        public int getSequenceId() {
            return sequenceId;
        }

        /**
         * Sets the value of the sequenceId property.
         * 
         */
        public void setSequenceId(int value) {
            this.sequenceId = value;
        }

    }

}