//29
public class Persona { //ESTO ESTÁ MAL
    public static final String TIPOS = "Cliente, Proveedor";
    private String nombre;
    public String telefono;
    private String direccion;

    public Persona(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

public class Persona { //ESTO ESTÁ BIEN
    private static final String TIPO = "Cliente";
    private String nombre;
    private String telefono;
    private String direccion;

    public Persona(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
//30
public class Persona { //ESTO ESTÁ MAL
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private String fechaNacimiento;

    public void actualizarTelefono() { /* ... */ }
    public void cambiarDireccion() { /* ... */ }
    public void cambiarEmail() { /* ... */ }
    public void cambiarFechaNacimiento() { /* ... */ }
}

public class Persona { //ESTO ESTÁ BIEN
    private String nombre;
    private String telefono;

    public void actualizarTelefono() { /* ... */ }
}
//31
public class Persona { //ESTO ESTÁ MAL
    private String nombre;
    private String direccion;

    public void cambiarDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void enviarCorreo(String mensaje) {
        // Lógica para enviar el correo
    }
}

public class Persona { //ESTO ESTÁ BIEN
    private String nombre;
    private String direccion;

    public void cambiarDireccion(String direccion) {
        this.direccion = direccion;
    }
}

public class EnviadorCorreo {
    public void enviarCorreo(String mensaje) {
        // Lógica para enviar el correo
    }
}
//32
public class Persona { //ESTO ESTÁ MAL
    private String nombre;
    private String direccion;
    private int edad;

    public void cambiarDireccion(String direccion) { this.direccion = direccion; }
    public void celebrarCumpleaños() { this.edad++; }
    public void cambiarTelefono(String telefono) { /* ... */ }
    public void realizarPago(int cantidad) { /* ... */ }  // No tiene que ver con la persona
}

public class Persona { //ESTO ESTÁ BIEN
    private String nombre;
    private String direccion;
    private int edad;

    public void cambiarDireccion(String direccion) { this.direccion = direccion; }
    public void celebrarCumpleaños() { this.edad++; }
}
//33
public class OrdenCompra { //ESTO ESTÁ MAL
    private double total;
    private String estado;
    
    public void actualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        // Lógica complicada que depende de detalles específicos
    }
}

public class OrdenCompra { //ESTO ESTÁ BIEN
    private double total;
    private EstadoOrden estado;

    public void actualizarEstado(EstadoOrden nuevoEstado) {
        this.estado = nuevoEstado;
    }
}

public enum EstadoOrden {
    PENDIENTE, COMPLETADA, CANCELADA
}
//34
public class Pedido { //ESTO ESTÁ MAL
    private Producto producto;
    
    public Pedido() {
        this.producto = new Producto();  // Depende directamente de la implementación
    }

    public void procesarPedido() {
        // Código de procesamiento del pedido
    }
}

public class Pedido { //ESTO ESTÁ BIEN
    private Producto producto;

    public Pedido(Producto producto) {
        this.producto = producto;  // Se inyecta la dependencia
    }

    public void procesarPedido() {
        // Código de procesamiento del pedido
    }
}
//35
public class Banco { //ESTO ESTÁ MAL
    private Cuenta cuenta;

    public void realizarTransaccion(double monto) {
        cuenta.retirar(monto);  // Cambia el estado de la cuenta directamente
    }
}

public class Banco { //ESTO ESTÁ BIEN
    private Cuenta cuenta;

    public void realizarTransaccion(double monto) {
        Cuenta cuentaNueva = new Cuenta(cuenta.getSaldo() - monto);  // Copia inmutable
        cuenta = cuentaNueva;  // Cambia el estado con una copia
    }
}
