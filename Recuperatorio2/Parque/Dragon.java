public class Dragon extends Criatura {
    private final int temperaturaFuego;

    public Dragon(String nombre, int edad, int nivelEnergia, int temperaturaFuego) {
        super(nombre, edad, nivelEnergia);
        this.temperaturaFuego = temperaturaFuego;
    }

    public int getTemperaturaFuego() {
        return temperaturaFuego;
    }

    public void lanzarFuego() {
        int energiaNueva = getNivelEnergia() - 25;
        if (energiaNueva < 0) {
            energiaNueva = 0;
        }
        setNivelEnergia(energiaNueva);
    }
}