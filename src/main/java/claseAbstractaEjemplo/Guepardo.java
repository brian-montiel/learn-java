package claseAbstractaEjemplo;

public class Guepardo extends Felino{
    public Guepardo(String habitat, Float altura, Float largo, Float peso, String nombreCintifico, Float tamanoGarras, Integer velocidad) {
        super(habitat, altura, largo, peso, nombreCintifico, tamanoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "como como un guepardo";
    }

    @Override
    public String dormir() {
        return "duermo como un guepardo";
    }

    @Override
    public String correr() {
        return "corro como un guepardo";
    }

    @Override
    public String comunicarse() {
        return "rugido de guepardo";
    }
}
