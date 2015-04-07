// Contoh Ilustrasi Method Overloading
public class TestMethodOverloading {
   public static int average(int n1, int n2) {          // A
      return (n1+n2)/2;
   }
 
   public static double average(double n1, double n2) { // B
      return (n1+n2)/2;
   }
 
   public static int average(int n1, int n2, int n3) {  // C
      return (n1+n2+n3)/3;
   }

   public static void main(String[] args) {
      System.out.println(average(1, 2));     // jalankan yang A
      System.out.println(average(1.0, 2.0)); // jalankan yang B
      System.out.println(average(1, 2, 3));  // jalankan yang C
      System.out.println(average(1.0, 2));   // jalankan yang B - int 2 diimplementasikan double 2.0
      // rata-rata (1, 2, 3, 4);
}