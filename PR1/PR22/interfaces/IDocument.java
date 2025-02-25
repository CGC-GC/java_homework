package PR22.interfaces;

public interface IDocument {
    String getTitle();
    String getInfo();
    void setTitle(String title);
    void open();
    void close();
    void save();
    void print();
}