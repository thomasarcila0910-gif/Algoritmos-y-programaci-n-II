public class Unicornio extends Criatura {
    private final String poderMagico;

    public Unicornio(String nombre, int edad, int nivelEnergia, String poderMagico) {
        super(nombre, edad, nivelEnergia);
        this.poderMagico = poderMagico;
    }

    public void usarMagia() {
        int gastoEnergia = (poderMagico != null && !poderMagico.isEmpty()) ? 10 : 20;
        int energiaNueva = getNivelEnergia() - gastoEnergia;
        if (energiaNueva < 0) {
            energiaNueva = 0;
        }
        setNivelEnergia(energiaNueva);
    }
}