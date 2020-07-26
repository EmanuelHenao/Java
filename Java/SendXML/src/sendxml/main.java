package sendxml;

import java.io.IOException;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;

public class main {

    public static void main(String[] args) throws Exception {
        SAXParserFactory fac = SAXParserFactory.newInstance();
        fac.setNamespaceAware(true);
        SAXParser saxP = fac.newSAXParser();
        XMLReader parser = saxP.getXMLReader();
        Handler hand = new Handler();
        parser.setContentHandler(hand);
        parser.parse("geekyxml.xml");

    }

}
