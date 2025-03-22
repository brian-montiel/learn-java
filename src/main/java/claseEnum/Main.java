package claseEnum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche(4, "Rojo", MarcaCoche.FERRARI);
        Coche coche2 = new Coche(4, "Verde", MarcaCoche.TOYOTA);
        Coche coche3 = new Coche(4, "Azul", MarcaCoche.PEUGEOT);

        Coche[] coches = new Coche[3];
        coches[0]=coche1;
        coches[1]=coche2;
        coches[2]=coche3;


        Arrays.sort(coches);
        for (Coche coch : coches) {
            System.out.println(coch);
        }


    }
}
