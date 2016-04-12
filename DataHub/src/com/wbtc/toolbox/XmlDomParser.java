package com.wbtc.toolbox;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.wbtc.beans.vho.Employee;

public class XmlDomParser {

     public List parseXMLintoClass(String xmlFileName) throws ParserConfigurationException,
         SAXException, IOException {
          if(xmlFileName.length() <1)
               throw new RuntimeException("No content in XML data!");

          DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
          DocumentBuilder builder = factory.newDocumentBuilder();


          // Load the input XML document, parse it and return an instance of the
          // Document class.
          Document document = builder.parse(xmlFileName);


          List<Employee> employees = new ArrayList<Employee>();
          NodeList nodeList = document.getDocumentElement().getChildNodes();
          for (int i = 0; i < nodeList.getLength(); i++) {
               Node node = nodeList.item(i);

               if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element elem = (Element) node;

                    // Get the value of the ID attribute.
                    String ID = node.getAttributes().getNamedItem("ID").getNodeValue();

                    // Get the value of all sub-elements.
                    String firstname = elem.getElementsByTagName("Firstname")
                                        .item(0).getChildNodes().item(0).getNodeValue();

                    String lastname = elem.getElementsByTagName("Lastname").item(0)
                                        .getChildNodes().item(0).getNodeValue();

                    Integer age = Integer.parseInt(elem.getElementsByTagName("Age")
                                        .item(0).getChildNodes().item(0).getNodeValue());

                    Double salary = Double.parseDouble(elem.getElementsByTagName("Salary")
                                        .item(0).getChildNodes().item(0).getNodeValue());

                    employees.add(new Employee(ID, firstname, lastname, age, salary));
               }
          }

  
          return employees;
     }
}
