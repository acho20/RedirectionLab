import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class PigLatin{
  public static String pigLatinSimple(String s){
    s = s.toLowerCase();
    if(s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u'){
      s += "hay";
    }else{
      s += s.charAt(0);
      s = s.substring(1);
    }
    return s;
  }

  public static String pigLatin(String s){
    s = s.toLowerCase();
    String[] dictionary = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    List<String> dic2 = Arrays.asList(dictionary);
    if(dic2.contains(s.substring(0,2))){
      s += s.substring(0,2);
      s = s.substring(2);
      s += "ay";
    }else if(s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u'){
      s += "hay";
    }else{
      s += s.charAt(0);
      s = s.substring(1);
    }
    return s;
  }

  public static String pigLatinBest(String s){
    if(Character.isLetter(s.charAt(0))){
      return s;
    }
    if(!(Character.isLetter(s.charAt( s.length() - 1)) || Character.isDigit(s.charAt(s.length() - 1)))){
      return pigLatin(s.substring(0, s.length() - 1)) + s.charAt(s.length() - 1);
    }else{
      return pigLatin(s);
    }
  }

  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Scanner scan2;
    int x = 0;
    while (scan.hasNext()){
      scan2 = new Scanner(scan.nextLine());
      while (scan2.hasNext()){
        System.out.print(pigLatinBest(scan2.next()));
      }
      System.out.println();
    }
  }

}
