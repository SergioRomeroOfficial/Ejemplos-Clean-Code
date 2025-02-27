//19
public int dividir(int a, int b) { // ESTO ESTÁ MAL
    if (b == 0) {
        return -1;  // Código de retorno que indica error
    }
    return a / b;
}

public int dividir(int a, int b) throws ArithmeticException { // ESTO ESTÁ BIEN
    if (b == 0) {
        throw new ArithmeticException("No se puede dividir por cero");
    }
    return a / b;
}
//20
public void leerArchivo() { // ESTO ESTÁ MAL
    BufferedReader reader = null;
    try {
        reader = new BufferedReader(new FileReader("archivo.txt"));
        // Código que puede lanzar una excepción
    } catch (IOException e) {
        e.printStackTrace();
    } 
}

public void leerArchivo() { // ESTO ESTÁ BIEN
    BufferedReader reader = null;
    try {
        reader = new BufferedReader(new FileReader("archivo.txt"));
        // Código que puede lanzar una excepción
    } catch (IOException e) {
        // Asegurar que se maneja correctamente el error
        e.printStackTrace();
    } finally {
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
//21
public void metodo() throws IOException { // ESTO ESTÁ MAL
    throw new IOException("Error al leer archivo");  // Checked exception
}

public void metodo() { // ESTO ESTÁ BIEN
    throw new RuntimeException("Error inesperado");  // Unchecked exception
}
//22
public String obtenerNombre() { // ESTO ESTÁ MAL
    return null;  // Devuelve null
}

public String obtenerNombre() { // ESTO ESTÁ BIEN
    return "";  // Devuelve un valor vacío
}


