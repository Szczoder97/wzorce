package Factory;

public class AttachmentItemProducer implements ItemFactory {
    @Override
    public Item createItem() {
        var attachmentItem = new AttachmentItem();
        attachmentItem.fillTemplates();
        return attachmentItem;
    }
}
