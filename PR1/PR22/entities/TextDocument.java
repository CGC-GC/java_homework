package PR22.entities;

public class TextDocument extends AbstractDocument{
    // Реализация специфичных методов или свойств для текстового документа
    String font;
    int fontSize;
    String fondTypes;

    public String getFont() {
        return font;
    }
    public void setFont(String font) {
        this.font = font;
    }
    public int getFontSize() {
        return fontSize;
    }
    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }
    public String getFondTypes() {
        return fondTypes;
    }
    public void setFondTypes(String fondTypes) {
        this.fondTypes = fondTypes;
    }
    boolean flag;
    public void open() {
        System.out.println(" txt document is open");
        flag = true;
    }
    @Override
    public void close() {
        if (!flag) {
            System.out.println("the txt document was not opened");
        } else {
            System.out.println("txt document closed");
            flag = false;
        }
    }
    @Override
    public void save() {
        System.out.println("txt document saved");

    }
    @Override
    public void print() {
        System.out.println("!some txt document content!");

    }
    @Override
    public String getInfo() {
        return  "font = " + font  + ", fontSize = " + fontSize + ", fondTypes = " + fondTypes;
    }
}