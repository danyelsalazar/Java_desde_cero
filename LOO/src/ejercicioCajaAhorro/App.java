package ejercicioCajaAhorro;

public class App {
    public static void main(String[] args) throws Exception {
        CajaAhorro miBanelco = new CajaAhorro("Danyel");
        CajaAhorro tuNaranja = new CajaAhorro("Jose");

        System.out.println(miBanelco.consultarSaldo());

        miBanelco.depositar(120000);
        System.out.println(miBanelco.consultarSaldo());

        miBanelco.tranferir(tuNaranja, 53000);

        System.out.println(tuNaranja.consultarSaldo());

    }
}
