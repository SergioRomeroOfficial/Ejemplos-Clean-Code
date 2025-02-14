public class Bloque2 {

    //1. Las funciones deben ser pequeñas

    public void saludar() { // ESTO ESTÁ MAL
        System.out.println("Hola");
        System.out.println("¿Cómo estás?");
        System.out.println("Que tengas un buen día");
        System.out.println("Espero verte pronto");
    }

    public void saludar() { // ESTO ESTÁ BIEN
        decirHola();
        preguntarEstado();
        despedirse();
    }
    
    private void decirHola() {
        System.out.println("Hola");
    }
    
    private void preguntarEstado() {
        System.out.println("¿Cómo estás?");
    }
    
    private void despedirse() {
        System.out.println("Que tengas un buen día");
    }

    //2. HAZ UNA UNICA COSA

    public void prepararComida(String tipo) { // ESTO ESTÁ MAL
        if (tipo.equals("pizza")) {
            System.out.println("Haciendo pizza...");
            System.out.println("Cocinando pizza...");
        } else {
            System.out.println("Haciendo ensalada...");
            System.out.println("Preparando ensalada...");
        }
    }

    public void hacerPizza() { // ESTO ESTÁ BIEN
        System.out.println("Haciendo pizza...");
        System.out.println("Cocinando pizza...");
    }
    
    public void hacerEnsalada() {
        System.out.println("Haciendo ensalada...");
        System.out.println("Preparando ensalada...");
    }
    
    //3. NO ABUSES DE LOS SWITCH/WHEN

    public void saludo(String idioma) { // ESTO ESTÁ MAL
        switch (idioma) {
            case "es": System.out.println("¡Hola!"); break;
            case "en": System.out.println("Hello!"); break;
            case "fr": System.out.println("Bonjour!"); break;
            default: System.out.println("¡Hola!");
        }
    }

    public void saludo(String idioma) { // ESTO ESTÁ BIEN
        if (idioma.equals("es")) {
            System.out.println("¡Hola!");
        } else if (idioma.equals("en")) {
            System.out.println("Hello!");
        } else if (idioma.equals("fr")) {
            System.out.println("Bonjour!");
        } else {
            System.out.println("¡Hola!");
        }
    }
    
    //4. ¿CUANTOS ARGUMENTOS DEBE TENER UNA FUNCIÓN?

    public void registrarUsuario(String nombre, String email, String telefono, String direccion) { // ESTO ESTÁ MAL 
        System.out.println("Usuario registrado: " + nombre);
    }

    public void registrarUsuario(Usuario usuario) { // ESTO ESTÁ BIEN
        System.out.println("Usuario registrado: " + usuario.getNombre());
    }
    
    //5. EVITA LOS FLAGS ARGUMENTS

    public void mostrarMensaje(String mensaje, boolean esUrgente) { // ESTO ESTÁ MAL
        if (esUrgente) {
            System.out.println("¡URGENTE! " + mensaje);
        } else {
            System.out.println(mensaje);
        }
    }

    public void mostrarMensaje(String mensaje) { // ESTO ESTÁ BIEN
        System.out.println(mensaje);
    }
    
    public void mostrarMensajeUrgente(String mensaje) {
        System.out.println("¡URGENTE! " + mensaje);
    }
    
    //6. NO GENERES SIDE EFFECTS O EFECTOS COLATERALES

    public void obtenerDatosYGuardar() { // ESTO ESTÁ MAL
        String datos = "Datos obtenidos";
        System.out.println(datos);
        guardarEnBaseDeDatos(datos);
    }
    
    public void guardarEnBaseDeDatos(String datos) {
        System.out.println("Guardando datos en base de datos...");
    }

    public String obtenerDatos() { // ESTO ESTÁ BIEN
        return "Datos obtenidos";
    }
    
    public void guardarEnBaseDeDatos(String datos) {
        System.out.println("Guardando datos en base de datos...");
    }
    
    //7. NO TE REPITAS

    public void enviarCorreo(String destinatario) { // ESTO ESTÁ MAL
        System.out.println("Enviando correo a " + destinatario);
    }
    
    public void enviarMensaje(String destinatario) {
        System.out.println("Enviando mensaje a " + destinatario);
    }

    public void enviarCorreo(String destinatario) { // ESTO ESTÁ BIEN
        enviarNotificacion(destinatario, "correo");
    }
    
    public void enviarMensaje(String destinatario) {
        enviarNotificacion(destinatario, "mensaje");
    }
    
    public void enviarNotificacion(String destinatario, String tipo) {
        System.out.println("Enviando " + tipo + " a " + destinatario);
    }
}
