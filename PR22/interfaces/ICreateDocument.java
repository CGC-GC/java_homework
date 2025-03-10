package PR22.interfaces;

public interface ICreateDocument {
    // Фабричный метод для создания нового документа
    IDocument CreateNew();
    // Фабричный метод для открытия существующего документа
    IDocument CreateOpen();
}
