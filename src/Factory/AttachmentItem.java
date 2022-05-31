package Factory;

import java.util.Map;

public class AttachmentItem extends Item {
    @Override
    void fillTemplates() {
        templates.put("name", "plik");
        templates.put("extension", "pdf");
    }

    @Override
    public String toString() {
        String documentInfo = "Attachment\n";
        for (Map.Entry<String, String> set : templates.entrySet())
            documentInfo += String.format("%s : %s\n", set.getKey(), set.getValue());
        return documentInfo;
    }
}
