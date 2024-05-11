import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    System.out.println("Ingresa el tamaño del cuadrado:");
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();

    for (int i = 0; i < num; i++) {
      for (int j = 0; j < num; j++) {
        System.out.printf("*");
      }
      System.out.printf("\n");
    }

  }



}