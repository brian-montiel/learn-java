package ejemploInterfaces;

public class Iphone extends Electronico{
    private String modelo;
    private String color;

    public Iphone(int precio, String fabricante, String modelo, String color) {
        super(precio, fabricante);
        this.modelo = modelo;
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 5;
    }

    @Override
    public String toString() {
        return "Iphone "+ "modelo='" + modelo + '\'' +
                ", color='" + color + '\'' + ", "+
                super.toString();
    }


}
