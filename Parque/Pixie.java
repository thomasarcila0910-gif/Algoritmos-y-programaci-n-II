public class Pixie extends Duende {
    private final String colorBrillo;

    public Pixie(String nombre, int edad, int nivelEnergia, String regionOrigen, String colorBrillo) {
        super(nombre, edad, nivelEnergia, regionOrigen);
        this.colorBrillo = colorBrillo;
    }

    public String getColorBrillo() {
        return colorBrillo;
    }

    public void lanzarPolvo() {
        int energiaNueva = getNivelEnergia() - 15;
        if (energiaNueva < 0) {
            energiaNueva = 0;
        }
        setNivelEnergia(energiaNueva);
    }
}