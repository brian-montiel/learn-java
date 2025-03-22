package claseAbstractaEjemplo;

abstract class Canino extends Mamifero{
    protected String color;
    protected Float tamanoColmillos;

    public Canino(String habitat, Float altura, Float largo, Float peso, String nombreCintifico, Float tamanoColmillos, String color) {
        super(habitat, altura, largo, peso, nombreCintifico);
        this.tamanoColmillos = tamanoColmillos;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Float getTamanoColmillos() {
        return tamanoColmillos;
    }

    public void setTamanoColmillos(Float tamanoColmillos) {
        this.tamanoColmillos = tamanoColmillos;
    }
}
