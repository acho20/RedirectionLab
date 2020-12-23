import java.util.Scanner;

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

}
