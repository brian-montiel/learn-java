package claseAbstractaEjemplo;

public class Tigre extends Felino{

    private String especieTigre;

    public Tigre(String habitat, Float altura, Float largo, Float peso, String nombreCintifico, Float tamanoGarras, Integer velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCintifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    public void setEspecieTigre(String especieTigre) {
        this.especieTigre = especieTigre;
    }

    @Override
    public String comer() {
        return "Como carne como un tigre";
    }

    @Override
    public String dormir() {
        return "duermo como un tigre";
    }

    @Override
    public String correr() {
        return "corro como un tigre";
    }

    @Override
    public String comunicarse() {
        return "rugido tigre";
    }
}
