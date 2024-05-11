import java.util.Scanner;

public class ULI {


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingresa N y M:");
    int n = sc.nextInt();
    int m = sc.nextInt();

    System.out.printf("<ul>\n");

    for (int i = 1; i <= n; i++) {
      System.out.printf("\t<li>\n \t\t<ul>\n");
      for (int j = 1; j <= m; j++) {
        System.out.printf("\t\t\t<li>%d.%d</li>\n", i, j);
      }
      System.out.printf("\t\t</ul>\n");
      System.out.printf("\t</li>\n");

    }

    System.out.printf("</ul>\n");


  }



}
