/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garden.planner.database.context.xml;

import java.io.File;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 * 
 * @author Thomas De Praetere
 * @param <T> 
 */
public class XmlGeneral<T> {

    private JAXBContext jaxbContext;
    private boolean correctInitialized;

    public XmlGeneral(Class<T> c) {
        try {
            jaxbContext = JAXBContext.newInstance(c);
            correctInitialized = true;
        } catch (JAXBException e) {
            correctInitialized = false;
        }
    }

    public String marshal(T t) {
        try {
            if (correctInitialized) {
                Marshaller marshaller = jaxbContext.createMarshaller();
                StringWriter writer = new StringWriter();
                marshaller.marshal(t, writer);
                return writer.toString();
            }
        } catch (JAXBException e) {
            e.printStackTrace();
            return "The class is not correctly annotated.";
        }
        return "Not initialized";
    }

    public T unmarshal(File f) {
        try {
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            return (T) unmarshaller.unmarshal(f);
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
    }

}
