public class Duende extends Criatura {
    private final String regionOrigen;

    public Duende(String nombre, int edad, int nivelEnergia, String regionOrigen) {
        super(nombre, edad, nivelEnergia);
        this.regionOrigen = regionOrigen;
    }

    public String getRegionOrigen() {
        return regionOrigen;
    }
}