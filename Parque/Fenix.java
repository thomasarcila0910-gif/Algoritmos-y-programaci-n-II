public class Fenix extends Criatura {
    private final String colorPlumas;

    public Fenix(String nombre, int edad, int nivelEnergia, String colorPlumas) {
        super(nombre, edad, nivelEnergia);
        this.colorPlumas = colorPlumas;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void volar() {
        int energiaNueva = getNivelEnergia() - 30;
        if (energiaNueva <= 0) {
            energiaNueva = 50; // Resucita automaticamente
        }
        setNivelEnergia(energiaNueva);
    }
}