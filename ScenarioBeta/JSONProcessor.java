import org.json.JSONObject;

class JSONProcessor extends FileProcessor {
    private String jsonData;

    @Override
    protected void read(String filePath) {
        System.out.println("Reading JSON file from: " + filePath);
    
        jsonData = "{\"name\": \"John\", \"age\": 30}";
    }

    @Override
    protected Object parse() {
        System.out.println("Parsing JSON data...");
        return new JSONObject(jsonData);
    }

    @Override
    protected void save(Object data) {
        System.out.println("Saving parsed JSON data: " + data);
    }
}

