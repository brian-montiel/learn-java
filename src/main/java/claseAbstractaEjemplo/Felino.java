package claseAbstractaEjemplo;

abstract class Felino extends Mamifero{
    protected Float tamanoGarras;
    protected Integer velocidad;

    public Felino(String habitat, Float altura, Float largo, Float peso, String nombreCintifico, Float tamanoGarras, Integer velocidad) {
        super(habitat, altura, largo, peso, nombreCintifico);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }

    public Float getTamanoGarras() {
        return tamanoGarras;
    }

    public void setTamanoGarras(Float tamanoGarras) {
        this.tamanoGarras = tamanoGarras;
    }
}
