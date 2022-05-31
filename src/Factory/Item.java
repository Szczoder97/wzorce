package Factory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public abstract class Item {
    Map<String, String> templates = new HashMap<>();

    public Item() {
        initTemplates();
    }

    void initTemplates() {
        templates.put("whoCreated", "Michał Parchaś");
        templates.put("whenCreated", DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm").format(LocalDateTime.now()));
    }

    abstract void fillTemplates();

    public Map<String, String> getTemplates() {
        return templates;
    }

    public void putTemplateValue(String label, String value) {
        templates.put(label, value);
    }
}
