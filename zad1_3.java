import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int x;
    int y;
    double wynik;
    Scanner s = new Scanner(System.in);
    System.out.println("Podaj podstawe: ");
    x = s.nextInt();
    System.out.println("Podaj wykładnik: ");
    y = s.nextInt();
    wynik = Math.pow(x,y);
    System.out.println(wynik);
    
  }
}