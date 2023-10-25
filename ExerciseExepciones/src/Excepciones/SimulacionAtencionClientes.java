package Excepciones;

public class SimulacionAtencionClientes {
    public static void main(String[] args) {
        Thread hiloClientePreferencial1 = new Thread(new ClientePreferencial("P1"));
        Thread hiloClientePreferencial2 = new Thread(new ClientePreferencial("P2"));
        Thread hiloClienteNormal1 = new Thread(new ClienteNormal("N1"));
        Thread hiloClienteNormal2 = new Thread(new ClienteNormal("N2"));

        hiloClientePreferencial1.start();
        hiloClientePreferencial2.start();
        hiloClienteNormal1.start();
        hiloClienteNormal2.start();
    }
}
