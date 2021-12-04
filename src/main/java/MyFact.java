public class MyFact {
    public static void main(String[] args) {
         double count = Double.parseDouble(args[0]);
         int fact = 1;
         while (count > 0) {
             fact *= count;
             count -= 1;
         }

         System.out.println(fact);
    }
}
