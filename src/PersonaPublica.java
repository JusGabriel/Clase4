public class personaPublica {

    private String direccion;
    private String telefono;
    private String email;
    private String nombre;

    public personaPublica(String nombre, String direccion, String telefono, String email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    private void cambiarDatos(String nuevoNombre, String nuevaDireccion, String nuevoTelefono, String nuevoEmail) {
        this.nombre = nuevoNombre;
        this.direccion = nuevaDireccion;
        this.telefono = nuevoTelefono;
        this.email = nuevoEmail;
    }

    private void mostrarTelefono() {
        System.out.println("El teléfono de " + nombre + " es: " + telefono);
    }

    private void verDireccion() {
        System.out.println("La dirección de " + nombre + " es: " + direccion);
    }

    public void actualizarInformacion(String nuevoNombre, String nuevaDireccion, String nuevoTelefono, String nuevoEmail) {
        cambiarDatos(nuevoNombre, nuevaDireccion, nuevoTelefono, nuevoEmail);
    }

    public static void main(String[] args) {
        personaPublica persona1 = new personaPublica("Carlos", "Mi casa y la tuya", "0978851254", "algo@ejemplo.com");

        persona1.verDireccion();

        persona1.actualizarInformacion("Carlos", "Madrid y Toledo", "09788551254", "algo@ejemplo.com");

        persona1.mostrarTelefono();

        persona1.verDireccion();
    }
}