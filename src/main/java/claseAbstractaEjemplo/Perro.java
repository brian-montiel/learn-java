package claseAbstractaEjemplo;

public class Perro extends Canino{
    private Integer fuerzaMordida;

    public Perro(String habitat, Float altura, Float largo, Float peso, String nombreCintifico, Float tamanoColmillos, String color, Integer fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCintifico, tamanoColmillos, color);
        this.fuerzaMordida = fuerzaMordida;
    }

    public Integer getFuerzaMordida() {
        return fuerzaMordida;
    }

    public void setFuerzaMordida(Integer fuerzaMordida) {
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    public String comer() {
        return "como como un perro";
    }

    @Override
    public String dormir() {
        return "duermo como un perro";
    }

    @Override
    public String correr() {
        return "corro como un perro";
    }

    @Override
    public String comunicarse() {
        return "ladrido de perro";
    }
}
