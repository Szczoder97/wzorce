package Factory;

public class DocumentItemProducer implements ItemFactory{

    @Override
    public Item createItem() {
        var documentItem = new DocumentItem();
        documentItem.fillTemplates();
        return documentItem;
    }
}
