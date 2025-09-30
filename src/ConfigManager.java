import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {
    private static Properties properties=new Properties();
    static{
        try {
            //Charger le fichier config

            FileInputStream fis= new FileInputStream("ConfigProperty");
            properties.load(fis);
            fis.close();
        } catch (IOException e) {
            System.out.println("Erreur de chargement du fichier config:"+e.getMessage());

        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
