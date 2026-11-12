public class Leprechaun extends Duende {
    private final int monedasOro;

    public Leprechaun(String nombre, int edad, int nivelEnergia, String regionOrigen, int monedasOro) {
        super(nombre, edad, nivelEnergia, regionOrigen);
        this.monedasOro = monedasOro;
    }

    public int getMonedasOro() {
        return monedasOro;
    }

    public void esconderOro() {
        int energiaNueva = getNivelEnergia() - 10;
        if (energiaNueva < 0) {
            energiaNueva = 0;
        }
        setNivelEnergia(energiaNueva);
    }
}