package Excepciones;

class ClientePreferencial implements Runnable {
    private String nombre;

    public ClientePreferencial(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        System.out.println("Cliente Preferencial " + nombre + " está siendo atendido.");
        try {
            Thread.sleep(2000); // Simula el tiempo de atención
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Cliente Preferencial " + nombre + " ha sido atendido.");
    }
}

class ClienteNormal implements Runnable {
    private String nombre;

    public ClienteNormal(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        System.out.println("Cliente Normal " + nombre + " está siendo atendido.");
        try {
            Thread.sleep(3000); // Simula el tiempo de atención
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Cliente Normal " + nombre + " ha sido atendido.");
    }
}

