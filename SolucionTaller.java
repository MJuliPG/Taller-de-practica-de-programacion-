import java.util.Scanner;

public class SolucionTaller {

    // ==========================================
    // EJERCICIOS DE RECURSIVIDAD
    // ==========================================

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int suma(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + suma(n - 1);
        }
    }

    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }

    public static int contarDigitos(int n) {
        if (Math.abs(n) < 10) {
            return 1;
        } else {
            return 1 + contarDigitos(Math.abs(n) / 10);
        }
    }

    public static String invertirRecursivo(String cadena) {
        if (cadena.isEmpty()) {
            return cadena;
        } else {
            return cadena.charAt(cadena.length() - 1) + invertirRecursivo(cadena.substring(0, cadena.length() - 1));
        }
    }

    // ==========================================
    // TALLER DE REPASO
    // ==========================================

    public static void ej1_concatenar(String t1, String t2) {
        System.out.println(t1 + " " + t2);
    }

    public static void ej2_holaNombre(String nombre) {
        System.out.println("Hola " + nombre);
    }

    public static void ej3_cuadrado(double n) {
        System.out.println(n * n);
    }

    public static void ej4_suma(double a, double b) {
        System.out.println(a + b);
    }

    public static void ej5_operaciones(double a, double b) {
        System.out.println("Suma: " + (a + b) + " | Resta: " + (a - b) + " | Mult: " + (a * b) + " | Div: " + (a / b) + " | Mod: " + (a % b));
    }

    public static void ej6_enteroDecimal(double n) {
        int parteEntera = (int) n;
        double parteDecimal = n - parteEntera;
        System.out.println("Entero: " + parteEntera + ", Decimal: " + parteDecimal);
    }

    public static double calcularPromedio(double n1, double n2, double n3, double n4, double n5) {
        return (n1 * 0.15) + (n2 * 0.20) + (n3 * 0.15) + (n4 * 0.30) + (n5 * 0.20);
    }

    public static double calcularIVA(double precioBruto) {
        return precioBruto * 1.19;
    }

    public static void ej9_circulo(double radio) {
        double area = Math.PI * radio * radio;
        double perimetro = 2 * Math.PI * radio;
        System.out.println("Área: " + area + " | Perímetro: " + perimetro);
    }

    public static void ej10_hexagono(double lado) {
        double area = (3 * Math.sqrt(3) * lado * lado) / 2;
        System.out.println("Área del hexágono: " + area);
    }

    public static void ej11_promedioN(double[] numeros) {
        double suma = 0;
        for (double n : numeros) {
            suma += n;
        }
        System.out.println("Promedio: " + (suma / numeros.length));
    }

    public static void ej12_distancia(double x1, double y1, double x2, double y2) {
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Distancia: " + distancia);
    }

    public static void ej13_nnn(int n) {
        int nn = n * 11;
        int nnn = n * 111;
        System.out.println(n + ", " + nn + ", " + nnn + " | Suma total: " + (n + nn + nnn));
    }

    public static void ej14_tiempo(int segundosTotales) {
        int horas = segundosTotales / 3600;
        int minutos = (segundosTotales % 3600) / 60;
        int segundos = segundosTotales % 60;
        System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
    }

    public static void ej15_parImpar(int n) {
        if (n % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }

    public static void ej16_posNeg(int n) {
        if (n >= 0) {
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo");
        }
    }

    public static double calcularIVADescuento(double precio) {
        double total = precio * 1.19;
        if (total > 150000) {
            return total * 0.95;
        } else {
            return total;
        }
    }

    public static void ej18_estadoEstudiante(double promedio) {
        if (promedio < 2.0) {
            System.out.println("No puede habilitar");
        } else if (promedio < 3.0) {
            System.out.println("Reprobó");
        } else if (promedio <= 4.5) {
            System.out.println("Aprobó");
        } else {
            System.out.println("¡Felicidades, excelente nota!");
        }
    }

    public static void ej19_cuadratica(double a, double b, double c) {
        double discriminante = b * b - 4 * a * c;
        if (discriminante >= 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("x1 = " + x1 + " | x2 = " + x2);
        } else {
            System.out.println("La ecuación no tiene solución real");
        }
    }

    public static void ej20_login(String usuario, String contrasena) {
        if (usuario.equals("carlos") && contrasena.equals("1234")) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Credenciales denegadas");
        }
    }

    public static void ej21_numeroNombre(int n) {
        String[] nombres = {"Cero", "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez"};
        if (n >= 0 && n <= 10) {
            System.out.println(nombres[n]);
        }
    }

    public static void ej22_cantidadDigitos(int n) {
        int longitud = String.valueOf(Math.abs(n)).length();
        System.out.println("Cantidad de dígitos: " + longitud);
    }

    public static void ej23_tendencia(int a, int b, int c) {
        if (a < b && b < c) {
            System.out.println("Incrementando");
        } else if (a > b && b > c) {
            System.out.println("Disminuyendo");
        } else {
            System.out.println("Ninguno de los anteriores");
        }
    }

    public static void ej24_diaSemana(int n) {
        String[] dias = {"", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        if (n >= 1 && n <= 7) {
            System.out.println(dias[n]);
        }
    }

    public static String invertirTexto(String texto) {
        StringBuilder sb = new StringBuilder(texto);
        return sb.reverse().toString();
    }

    public static void ej26_capitalizar(String texto) {
        String[] palabras = texto.split(" ");
        for (String p : palabras) {
            if (!p.isEmpty()) {
                System.out.print(Character.toUpperCase(p.charAt(0)) + p.substring(1) + " ");
            }
        }
        System.out.println();
    }

    public static void ej27_penultima(String texto) {
        String[] palabras = texto.trim().split("\\s+");
        if (palabras.length >= 2) {
            System.out.println("Penúltima palabra: " + palabras[palabras.length - 2]);
        }
    }

    public static void ej28_contiene(String texto1, String texto2) {
        if (texto2.contains(texto1)) {
            System.out.println("El segundo texto sí contiene el primero");
        } else {
            System.out.println("El segundo texto no contiene el primero");
        }
    }

    public static boolean esPalindromo(String palabra) {
        String limpia = palabra.replaceAll("\\s+", "").toLowerCase();
        String invertida = new StringBuilder(limpia).reverse().toString();

        if (limpia.equals(invertida)) {
            return true;
        } else {
            return false;
        }
    }

    public static void ej31_naturales() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void ej32_impares() {
        int contador = 0;
        for (int i = 1; contador < 10; i += 2) {
            System.out.print(i + " ");
            contador++;
        }
        System.out.println();
    }

    public static void ej33_pares() {
        int contador = 0;
        for (int i = 2; contador < 10; i += 2) {
            System.out.print(i + " ");
            contador++;
        }
        System.out.println();
    }

    public static void ej35_aBinario(int n) {
        System.out.println("Binario: " + Integer.toBinaryString(n));
    }

    public static void ej36_aDecimal(String binario) {
        System.out.println("Decimal: " + Integer.parseInt(binario, 2));
    }

    public static void ej37_patron() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void ej38_patronArroba() {
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }

    public static void ej39_patronAsterisco() {
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // ==========================================
    //  PROBLEMA FINAL
    // ==========================================
    public static void problemaFinalAvion() {
        Scanner scanner = new Scanner(System.in);
        double pesoTotal = 0;
        int totalBultos = 0;

        System.out.println("=== SISTEMA DE EQUIPAJE BOING 747 ===");

        while (true) {
            System.out.print("Ingrese el peso del bulto en kg (0 para salir): ");
            double pesoBulto = scanner.nextDouble();

            if (pesoBulto == 0) {
                break;
            }

            if (pesoBulto > 500) {
                System.out.println("Error: Un bulto no puede exceder los 500 kg.");
                continue;
            }

            if (pesoTotal + pesoBulto > 18000) {
                System.out.println("Error: Capacidad máxima del avión alcanzada.");
                break;
            }

            pesoTotal += pesoBulto;
            totalBultos++;
            System.out.println("Bulto aceptado.");
        }

        System.out.println("\n--- REPORTE FINAL ---");
        System.out.println("Total de bultos ingresados: " + totalBultos);
        System.out.println("Peso total cargado: " + pesoTotal + " kg");

        scanner.close();
    }
}
