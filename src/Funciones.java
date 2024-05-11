import java.util.Scanner;

public class Funciones {

  public static void main(String[] args) {

    int op;
    do {
      mostrarMenu();
      op = leerValorInt("Selecciona una opción:\n");

      if (op == 1){
        float valor = toCelsius(leerValorInt("Ingresa una temperatura en F°\n"));
        mostrar(String.format("La temperatura en C° es %f\n", valor));
      } else if (op == 2){
        float valor = toFahrenheit(leerValorInt("Ingresa una temperatura en C°\n"));
        mostrar(String.format("La temperatura en F° es %f\n", valor));

      }
    } while (op != 0);


  }

  static void mostrarMenu() {
    System.out.println("1. Convertir de fahrenheit a celsius");
    System.out.println("2. Convertir de celsius a fahrenheit");
    System.out.println("3. Convertir de celsius a kelvin");
    System.out.println("0. Salir ");
  }

  // firma: mostrar(String)
  static void mostrar(String mensaje){
    System.out.printf(mensaje);
  }

  // firma: leerValorInt(String)
  static int leerValorInt(String mensaje) {
    mostrar(mensaje);
    Scanner sc = new Scanner(System.in);
    return sc.nextInt();
  }

  // firma: leerValorInt()
  static int leerValorInt() {
    Scanner sc = new Scanner(System.in);
    return sc.nextInt();
  }

  // firma: leerValorString(String)
  static String leerValorString(String mensaje) {
    mostrar(mensaje);
    Scanner sc = new Scanner(System.in);
    return sc.nextLine();
  }

  static float toCelsius (float fahrenheit){
    return (fahrenheit-32f)*5/9;
  }

  static float toFahrenheit (float celsius) {
      return 9f/5*(celsius+32);
  }
}
