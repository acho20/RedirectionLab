import java.util.Scanner;

public class MakeStars{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Scanner scan2;
    int x = 0;
    while (scan.hasNext()){
      scan2 = new Scanner(scan.nextLine());
      while (scan2.hasNext()){
        x = scan2.next().length();
        for(int i =0; i < x; i++){
          System.out.printf("*");
        }
        System.out.printf(" ");
      }
      System.out.println();
    }
  }

}
