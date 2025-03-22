package claseAbstractaEjemplo;

import com.sun.security.jgss.GSSUtil;

public class EjemploMamiferos {
    public static void main(String[] args) {
        Mamifero[] mamiferos = new Mamifero[5];

        Mamifero leon = new Leon("Africa", 2f, 6f, 200f, "leon", 4f, 100, 10, 105f);
        Mamifero guepardo = new Guepardo("Jungla",2f,7f,100f,"Guepardo",3f, 400);
        Mamifero tigre = new Tigre("selva",2.5f, 6f, 300f, "Tigre", 5f, 150, "Siberiano");

        Mamifero lobo = new Lobo("bosque", 4f,5f,100f,"lobo", 3f,"Gris",10, "ugarenio");
        Mamifero perro = new Perro("casa",2f,5f,40f,"Perro",2f,"Marron", 100);

        mamiferos[0]= leon;
        mamiferos[1]= guepardo;
        mamiferos[2]= tigre;
        mamiferos[3]= lobo;
        mamiferos[4]= perro;

        for (Mamifero mamifero : mamiferos) {
            System.out.println(mamifero.comer());
            System.out.println(mamifero.dormir());
            System.out.println(mamifero.correr());
            System.out.println(mamifero.comunicarse());
            System.out.println("------------------------------------------");
        }

    }
}
