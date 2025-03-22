package claseAbstractaEjemplo;

public class Lobo extends Canino{
    private Integer numCamada;
    private String especieLobo;

    public Lobo(String habitat, Float altura, Float largo, Float peso, String nombreCintifico, Float tamanoColmillos, String color, Integer numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCintifico, tamanoColmillos, color);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public Integer getNumCamada() {
        return numCamada;
    }

    public void setNumCamada(Integer numCamada) {
        this.numCamada = numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    public void setEspecieLobo(String especieLobo) {
        this.especieLobo = especieLobo;
    }

    @Override
    public String comer() {
        return "como como un lobo";
    }

    @Override
    public String dormir() {
        return "duermo como un lobo";
    }

    @Override
    public String correr() {
        return "corro como un lobo";
    }

    @Override
    public String comunicarse() {
        return "aullido de lobo";
    }
}
