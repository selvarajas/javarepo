
package com.agimatec.publicinterfaces.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAvailableFreeBoxesForMachineResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAvailableFreeBoxesForMachineResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="availableBoxes" type="{http://service.publicinterfaces.agimatec.com}dtAvailableBoxes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAvailableFreeBoxesForMachineResponse", propOrder = {
    "availableBoxes"
})
public class GetAvailableFreeBoxesForMachineResponse {

    protected List<DtAvailableBoxes> availableBoxes;

    /**
     * Gets the value of the availableBoxes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availableBoxes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailableBoxes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DtAvailableBoxes }
     * 
     * 
     */
    public List<DtAvailableBoxes> getAvailableBoxes() {
        if (availableBoxes == null) {
            availableBoxes = new ArrayList<DtAvailableBoxes>();
        }
        return this.availableBoxes;
    }

}
