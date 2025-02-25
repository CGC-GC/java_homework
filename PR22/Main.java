package PR22;
import PR22.interfaces.*;
import PR22.entities.*;

class Main {
    public static void main(String[] args) {
        ICreateDocument documentFactory = new DocumentFactory();
        IDocument newDocument = documentFactory.CreateNew();
        IDocument openDocument = documentFactory.CreateOpen();
        newDocument.close();
        System.out.println(newDocument.getInfo());
        openDocument.save();
        System.out.println(openDocument.getInfo());
    }
}