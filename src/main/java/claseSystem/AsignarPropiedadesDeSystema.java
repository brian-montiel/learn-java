package claseSystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class AsignarPropiedadesDeSystema {
    public static void main(String[] args) {
        try {
            FileInputStream archivo = new FileInputStream("src/main/java/claseSystem/config.properties");

            Properties p = new Properties(System.getProperties());//cargamos todas las propiedades del sistema
            p.load(archivo);//subimos el archivo de propiedades que creamos config.propierties
            p.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto propierties");

            System.setProperties(p);//Vuelvo a cargar el archivo propierties del sistema para que se guarde las configuraciones
            System.getProperties().list(System.out);//Muestro un listado de las propiedades del sistema
        } catch (Exception e) {
            System.out.println("no existe el archivo = " + e);
        }
    }
}
