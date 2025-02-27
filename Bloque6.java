//23
public class Calculadora { // ESTO ESTÁ MAL
    public int sumar(int a, int b) {
        return a + b;
    }
}

@Test // ESTO ESTÁ BIEN
public void testSuma() {
    Calculadora calc = new Calculadora();
    assertEquals(5, calc.sumar(2, 3));  // Test que falla inicialmente
}
//24
@Test
public void testSuma() { // ESTO ESTÁ MAL
    Calculadora calc = new Calculadora();
    assertEquals(5, calc.sumar(2, 3));
    assertEquals(10, calc.sumar(7, 3));
    assertEquals(20, calc.sumar(15, 5));  // El test cubre varias operaciones, lo que lo hace confuso.
}

@Test // ESTO ESTÁ BIEN
public void testSumaDeDosNumeros() {
    Calculadora calc = new Calculadora();
    assertEquals(5, calc.sumar(2, 3));  // Test limpio y único
}

@Test
public void testSumaDeOtrosNumeros() {
    Calculadora calc = new Calculadora();
    assertEquals(10, calc.sumar(7, 3));  // Test limpio y único
}
//25
@Test // ESTO ESTÁ MAL
public void testSuma() { 
    Calculadora calc = new Calculadora();
    assertEquals(5, calc.sumar(2, 3));
    assertEquals(15, calc.sumar(7, 8)); // No es claro por qué estamos probando estos valores juntos
}

@Test // ESTO ESTÁ BIEN
public void testSumaPositiva() {
    Calculadora calc = new Calculadora();
    assertEquals(5, calc.sumar(2, 3));
}

@Test
public void testSumaDeNumerosGrandes() {
    Calculadora calc = new Calculadora();
    assertEquals(15, calc.sumar(7, 8));
}
//26
@Test // ESTO ESTÁ MAL
public void testSumaYResta() {
    Calculadora calc = new Calculadora();
    assertEquals(5, calc.sumar(2, 3));  // Suma
    assertEquals(1, calc.restar(3, 2)); // Resta, dos conceptos en un solo test
}

@Test // ESTO ESTÁ BIEN
public void testSuma() {
    Calculadora calc = new Calculadora();
    assertEquals(5, calc.sumar(2, 3));  // Un solo Assert
}

@Test
public void testResta() {
    Calculadora calc = new Calculadora();
    assertEquals(1, calc.restar(3, 2));  // Un solo Assert
}
//27
@Test // ESTO ESTÁ MAL
public void testOperaciones() {
    Calculadora calc = new Calculadora();
    assertEquals(5, calc.sumar(2, 3));  // Suma
    assertEquals(1, calc.restar(3, 2)); // Resta
}

@Test // ESTO ESTÁ BIEN
public void testSuma() {
    Calculadora calc = new Calculadora();
    assertEquals(5, calc.sumar(2, 3));  // Un solo concepto
}

@Test
public void testResta() {
    Calculadora calc = new Calculadora();
    assertEquals(1, calc.restar(3, 2));  // Un solo concepto
}
//28
@Test // ESTO ESTÁ MAL
public void test() {
    // Test lento, con muchas dependencias
    // Toma mucho tiempo
    // Y puede fallar en algunos entornos
}

@Test // ESTO ESTÁ BIEN
public void testSuma() {
    Calculadora calc = new Calculadora();
    assertEquals(5, calc.sumar(2, 3));  // Rápido y repetible
}

