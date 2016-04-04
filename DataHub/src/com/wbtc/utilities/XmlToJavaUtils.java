package com.wbtc.utilities;

import com.wbtc.beans.*;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XmlToJavaUtils {

  /**
   * @param args
   * @throws JAXBException 
   */

  public Person loadPersonInfoXMLtoJavaBean() throws JAXBException {
    //1. We need to create JAXContext instance
    JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);

    //2. Use JAXBContext instance to create the Unmarshaller.
    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

    //3. Use the Unmarshaller to unmarshal the XML document to get an instance of JAXBElement.
    System.out.println("Loading the person info ...." + 
    		ClassLoader.getSystemResourceAsStream("person.xml").toString());

    JAXBElement<Person> unmarshalledObject = 
        (JAXBElement<Person>)unmarshaller.unmarshal(
            ClassLoader.getSystemResourceAsStream("person.xml"));

    //4. Get the instance of the required JAXB Root Class from the JAXBElement.
    Person personObj = unmarshalledObject.getValue();

    return personObj;
  }

}