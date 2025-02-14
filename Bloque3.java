public class Bloque3 {
    //1. LOS COMENTARIOS MIENTEN

    // Sumar dos números
    public int sumar(int a, int b) { // ESTO ESTÁ MAL
        return a + b;
    }

    public int sumar(int a, int b) { // ESTO ESTÁ BIEN
        return a + b;
    }
    
    //2. USA CÓDIGO AUTOEXPLICATIVO

    // Multiplica dos números
    public int multiplicar(int a, int b) { // ESTO ESTÁ MAL
        return a * b;
    }

    public int multiplicarNumeros(int multiplicando, int multiplicador) { // ESTO ESTÁ BIEN
        return multiplicando * multiplicador;
    }
    
    //3. A VECES LOS COMENTARIOS NO SON NECESARIOS

    public void procesar() { // ESTO ESTÁ MAL
        // Hacer algo aquí
    }

    public void procesar() { // ESTO ESTÁ BIEN
        // Realiza el proceso de verificación antes de proceder
        verificarCondiciones();
    }
    
    //4. LOS COMENTARIOS DICEN QUÉ HACE EL CÓDIGO, NO CÓMO LO HACE

    // Calcula la suma de dos números
    public int sumar(int a, int b) { // ESTO ESTÁ MAL
        return a + b;
    }

    public int sumar(int a, int b) { // ESTO ESTÁ BIEN
        return a + b;
    }
    
}
