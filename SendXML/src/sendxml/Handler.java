
package sendxml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class Handler extends DefaultHandler {

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        System.out.println("characters:\"" + new String(ch,start,length)+"\"");
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("Element:"+qName); 
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("StartElement:"+qName);
    }
    
    
}
