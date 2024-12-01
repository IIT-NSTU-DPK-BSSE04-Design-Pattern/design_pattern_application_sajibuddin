import java.util.ArrayList;
import java.util.List;
//concreate class
class CSVProcessor extends FileProcessor {
    private List<String> lines = new ArrayList<>();

    @Override
    protected void read(String filePath) {
        System.out.println("Reading CSV file from: " + filePath);
        lines.add("name,age");
        lines.add("John,30");
    }

    @Override
    protected Object parse() {
        System.out.println("Parsing CSV data...");
        List<Object> parsedData = new ArrayList<>();
        for (String line : lines) {
            String[] values = line.split(",");
            parsedData.add(values);
        }
        return parsedData;
    }

    @Override
    protected void save(Object data) {
        System.out.println("Saving parsed CSV data: " + data);
    }
} 