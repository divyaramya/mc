public class Vowels {
public static void main(String[] args) {
String l = "MANIkandan";
      String reverse = new StringBuffer(l).reverse().toString();
String k = reverse.replaceAll("[aeiouAEIOU]", "");
System.out.println(k);
}
}
