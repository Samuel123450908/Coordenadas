import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.print("Digite a coordenada x: ");
      int x = scanner.nextInt();
      System.out.print("Digite a coordenada y: ");
      int y = scanner.nextInt();
      if (x == 0 || y == 0) {
        break; 
      }
      if (x > 0 && y > 0) {
        System.out.println("O ponto está no primeiro quadrante.");
      } else if (x < 0 && y > 0) {
        System.out.println("O ponto está no segundo quadrante.");
      } else if (x < 0 && y < 0) {
        System.out.println("O ponto está no terceiro quadrante.");
      } else {
        System.out.println("O ponto está no quarto quadrante.");
      }
    }
  }
}