// Abstract class 
abstract class FileProcessor {

    public final void processFile(String filePath) {
        read(filePath);           
        Object data = parse();   
        save(data);          
    }

    
    protected abstract void read(String filePath);
    protected abstract Object parse();
    protected abstract void save(Object data);
}
