package claseAbstractaEjemplo;

abstract class Mamifero {
    protected String habitat;
    protected Float altura;
    protected Float largo;
    protected Float peso;
    protected String nombreCintifico;

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public Float getLargo() {
        return largo;
    }

    public void setLargo(Float largo) {
        this.largo = largo;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public String getNombreCintifico() {
        return nombreCintifico;
    }

    public void setNombreCintifico(String nombreCintifico) {
        this.nombreCintifico = nombreCintifico;
    }

    public Mamifero(String habitat, Float altura, Float largo, Float peso, String nombreCintifico) {
        this.habitat = habitat;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
        this.nombreCintifico = nombreCintifico;
    }

    abstract public String comer();
    abstract public String dormir();
    abstract public String correr();
    abstract public String comunicarse();
}
