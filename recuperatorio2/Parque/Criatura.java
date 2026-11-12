public class Criatura {
    private final String nombre;
    private final int edad;
    private int nivelEnergia;

    public Criatura(String nombre, int edad, int nivelEnergia) {
        this.nombre = nombre;
        this.edad = edad;
        this.nivelEnergia = nivelEnergia;
    }

    public void alimentarse() {
        this.nivelEnergia = this.nivelEnergia + 15;
        if (this.nivelEnergia > 100) {
            this.nivelEnergia = 100;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public void setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
    }
}