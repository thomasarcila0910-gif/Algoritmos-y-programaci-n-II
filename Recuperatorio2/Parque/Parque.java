import java.util.ArrayList;

public class Parque {
    private final ArrayList<Criatura> listaCriaturas;

    public Parque() {
        listaCriaturas = new ArrayList<>();
    }

    public void agregarCriatura(Criatura c) {
        listaCriaturas.add(c);
    }

    public void listarCriaturas() {
        System.out.println("\n--- LISTA DE CRIATURAS ---");
        for (int i = 0; i < listaCriaturas.size(); i++) {
            Criatura c = listaCriaturas.get(i);
            System.out.println("Nombre: " + c.getNombre() + " | Edad: " + c.getEdad() + " | Energia: " + c.getNivelEnergia());
        }
    }
}