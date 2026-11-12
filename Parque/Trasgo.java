public class Trasgo extends Duende {
    private final int nivelFuerza;

    public Trasgo(String nombre, int edad, int nivelEnergia, String regionOrigen, int nivelFuerza) {
        super(nombre, edad, nivelEnergia, regionOrigen);
        this.nivelFuerza = nivelFuerza;
    }

    public int getNivelFuerza() {
        return nivelFuerza;
    }

    public void hacerTravesura() {
        int energiaNueva = getNivelEnergia() - 20;
        if (energiaNueva < 0) {
            energiaNueva = 0;
        }
        setNivelEnergia(energiaNueva);
    }
}