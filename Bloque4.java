//17
public class Persona {  // ESTO ESTÁ MAL
    public String nombre;
    public String direccion;
    public String telefono;
    
    // Sin lógica, solo datos
}

public class Persona { //ESTO ESTÁ BIEN
    private String nombre;
    private String direccion;
    private String telefono;

    public Persona(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void actualizarDireccion(String nuevaDireccion) {
        this.direccion = nuevaDireccion;
    }
}
//18
public class Pedido { //ESTO ESTÁ MAL
    private Cliente cliente;

    public void cambiarDireccionDeCliente(String nuevaDireccion) {
        cliente.getDireccion().setCalle(nuevaDireccion); // No cumple la Ley de Demeter
    }
}

public class Pedido { //ESTO ESTÁ BIEN
    private Cliente cliente;

    public void cambiarDireccionDeCliente(String nuevaDireccion) {
        cliente.actualizarDireccion(nuevaDireccion);  // Cumple la Ley de Demeter
    }
}


