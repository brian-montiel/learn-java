package claseEnum;

import javax.print.DocFlavor;

public class Coche implements Comparable<Coche>{
    private MarcaCoche Marca;
    private String Color;
    private int puertas;


    public Coche(MarcaCoche marca, String color) {
        Marca = marca;
        Color = color;
    }

    public Coche(int puertas, String color, MarcaCoche marca) {
        this(marca,color);
        this.puertas = puertas;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public MarcaCoche getMarca() {
        return Marca;
    }

    public void setMarca(MarcaCoche marca) {
        Marca = marca;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "Marca=" + Marca.getMarca() +
                ", Color='" + Color + '\'' +
                ", puertas=" + puertas +
                '}';
    }

    @Override
    public int compareTo(Coche o) {
        return this.getMarca().toString().compareTo(o.getMarca().toString());
    }


}
