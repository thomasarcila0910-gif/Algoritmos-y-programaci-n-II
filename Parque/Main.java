public class Main {
    public static void main(String[] args) {
        Parque miParque = new Parque();

        Dragon miDragon = new Dragon("Ignis", 100, 80, 1500);
        Unicornio miUnicornio = new Unicornio("Starlight", 45, 90, "Curacion");
        Fenix miFenix = new Fenix("Pyre", 300, 40, "Rojo");

        Leprechaun miLeprechaun = new Leprechaun("Lucky", 120, 70, "Irlanda", 500);
        Pixie miPixie = new Pixie("Tink", 30, 85, "Bosque Encantado", "Dorado");
        Trasgo miTrasgo = new Trasgo("Grog", 60, 95, "Montanas", 80);

        miParque.agregarCriatura(miDragon);
        miParque.agregarCriatura(miUnicornio);
        miParque.agregarCriatura(miFenix);
        miParque.agregarCriatura(miLeprechaun);
        miParque.agregarCriatura(miPixie);
        miParque.agregarCriatura(miTrasgo);

        miParque.listarCriaturas();

        miDragon.lanzarFuego();
        miUnicornio.usarMagia();
        miFenix.volar();
        miLeprechaun.esconderOro();
        miPixie.lanzarPolvo();
        miTrasgo.hacerTravesura();

        miParque.listarCriaturas();
    }
}