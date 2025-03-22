package claseAbstractaEjemplo;

public class Leon extends Felino{
    private Integer numManada;
    private Float potenciaRugidoDecibel;

    public Leon(String habitat, Float altura, Float largo, Float peso, String nombreCintifico, Float tamanoGarras, Integer velocidad, Integer numManada, Float potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCintifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public Integer getNumManada() {
        return numManada;
    }

    public void setNumManada(Integer numManada) {
        this.numManada = numManada;
    }

    public Float getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    public void setPotenciaRugidoDecibel(Float potenciaRugidoDecibel) {
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "Como como un leon";
    }

    @Override
    public String dormir() {
        return "Duermo como un leon";
    }

    @Override
    public String correr() {
        return "Corro como un leon";
    }

    @Override
    public String comunicarse() {
        return "rugido leon";
    }
}
