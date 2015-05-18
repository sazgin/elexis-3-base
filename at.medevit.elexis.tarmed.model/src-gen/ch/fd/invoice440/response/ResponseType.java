//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.21 at 02:51:03 PM CET 
//

package ch.fd.invoice440.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * Java class for responseType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="processing" type="{http://www.forum-datenaustausch.ch/invoice}processingType"/>
 *         &lt;element name="payload" type="{http://www.forum-datenaustausch.ch/invoice}payloadType"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="language" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="de"/>
 *             &lt;enumeration value="fr"/>
 *             &lt;enumeration value="it"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="modus" default="production">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="production"/>
 *             &lt;enumeration value="test"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseType", propOrder = {
	"processing", "payload", "signature"
})
@XmlRootElement(name = "response")
public class ResponseType {
	
	@XmlElement(required = true)
	protected ProcessingType processing;
	@XmlElement(required = true)
	protected PayloadType payload;
	@XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
	protected SignatureType signature;
	@XmlAttribute(name = "language", required = true)
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String language;
	@XmlAttribute(name = "modus")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String modus;
	
	/**
	 * Gets the value of the processing property.
	 * 
	 * @return possible object is {@link ProcessingType }
	 * 
	 */
	public ProcessingType getProcessing(){
		return processing;
	}
	
	/**
	 * Sets the value of the processing property.
	 * 
	 * @param value
	 *            allowed object is {@link ProcessingType }
	 * 
	 */
	public void setProcessing(ProcessingType value){
		this.processing = value;
	}
	
	/**
	 * Gets the value of the payload property.
	 * 
	 * @return possible object is {@link PayloadType }
	 * 
	 */
	public PayloadType getPayload(){
		return payload;
	}
	
	/**
	 * Sets the value of the payload property.
	 * 
	 * @param value
	 *            allowed object is {@link PayloadType }
	 * 
	 */
	public void setPayload(PayloadType value){
		this.payload = value;
	}
	
	/**
	 * Gets the value of the signature property.
	 * 
	 * @return possible object is {@link SignatureType }
	 * 
	 */
	public SignatureType getSignature(){
		return signature;
	}
	
	/**
	 * Sets the value of the signature property.
	 * 
	 * @param value
	 *            allowed object is {@link SignatureType }
	 * 
	 */
	public void setSignature(SignatureType value){
		this.signature = value;
	}
	
	/**
	 * Gets the value of the language property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLanguage(){
		return language;
	}
	
	/**
	 * Sets the value of the language property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLanguage(String value){
		this.language = value;
	}
	
	/**
	 * Gets the value of the modus property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getModus(){
		if (modus == null) {
			return "production";
		} else {
			return modus;
		}
	}
	
	/**
	 * Sets the value of the modus property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setModus(String value){
		this.modus = value;
	}
	
}