package Factory;

import java.util.Map;

public class DocumentItem extends Item {
    @Override
    void fillTemplates() {
        templates.put("title", "Umowa Śmieciarex");
        templates.put("content", "Lorem ipsum");
    }

    @Override
    public String toString() {
        String documentInfo = "Document\n";
        for (Map.Entry<String, String> set : templates.entrySet())
            documentInfo += String.format("%s : %s\n", set.getKey(), set.getValue());
        return documentInfo;
    }
}
