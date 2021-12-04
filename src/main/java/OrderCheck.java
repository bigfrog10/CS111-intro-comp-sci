public class OrderCheck {
    public static void main(String[] args) {
        double w = Double.parseDouble(args[0]);
        double x = Double.parseDouble(args[1]);
        double y = Double.parseDouble(args[2]);
        double z = Double.parseDouble(args[3]);

        boolean answer = ((w < x) && (x < y) && (y < z) || (w > x) && (x > y) && (y > z));
        System.out.println(answer);
    }
}
