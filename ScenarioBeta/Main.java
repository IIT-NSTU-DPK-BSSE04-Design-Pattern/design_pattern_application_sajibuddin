
public class Main {
    public static void main(String[] args) {
        
        FileProcessor csvProcessor = new CSVProcessor();
        csvProcessor.processFile("data.csv");

        
        FileProcessor jsonProcessor = new JSONProcessor();
        jsonProcessor.processFile("data.json");

        FileProcessor xmlProcessor = new XMLProcessor();
        xmlProcessor.processFile("data.xml");
    }
}
