
import org.w3c.dom.*;
import javax.xml.parsers.*;

class XMLProcessor extends FileProcessor {
    private String xmlData;

    @Override
    protected void read(String filePath) {
        System.out.println("Reading XML file from: " + filePath);
        
        xmlData = "<person><name>John</name><age>30</age></person>";
    }

    @Override
    protected Object parse() {
        System.out.println("Parsing XML data...");
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new java.io.ByteArrayInputStream(xmlData.getBytes()));
            return doc;
        } catch (Exception e) {
            throw new RuntimeException("Error parsing XML", e);
        }
    }

    @Override
    protected void save(Object data) {
        System.out.println("Saving parsed XML data: " + data);
    }
}