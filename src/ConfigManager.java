import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigManager {
    private static Properties properties=new Properties();
    static{
        try {
            //Charger le fichier config

            InputStream input = ConfigManager.class.getClassLoader().getResourceAsStream("Config.properties");
            if (input == null) {
            System.out.println("⚠️ Fichier config.properties introuvable !");
            } else {
                properties.load(input);
            }

        } catch (IOException e) {
            System.out.println("Erreur de chargement du fichier config:"+e.getMessage());

        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
