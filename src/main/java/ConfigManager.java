import java.io.*;
import java.util.Properties;
public class ConfigManager {
    private static final String CONFIG_FILE = "config.properties";
    private Properties props = new Properties();
    public ConfigManager() {
        load();
    }
    public void load() {
        try (InputStream in = new FileInputStream(CONFIG_FILE)) {
            props.load(in);
        } catch (IOException e) {
            // Valeurs par défaut
            props.setProperty("fontSize", "14");
            props.setProperty("fontName", "Arial");
            props.setProperty("theme", "light");
            props.setProperty("wrap", "true");
        }
    }
    public void save() {
        try (OutputStream out = new FileOutputStream(CONFIG_FILE)) {
            props.store(out, "NoteFacile Config");
        } catch (IOException e) { e.printStackTrace(); }
    }
    public String get(String key) { return props.getProperty(key); }
    public void set(String key, String value) { props.setProperty(key, value); }
}