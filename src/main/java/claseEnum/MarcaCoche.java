package claseEnum;

public enum MarcaCoche {
    TOYOTA("Toyota"),
    FERRARI("Ferrari"),
    PEUGEOT("Peugeot");

    private final String marca;

    MarcaCoche(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }
}
