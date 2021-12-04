public class LargestOfFive {
    public static void main(String[] args) {
        int max = Integer.parseInt(args[0]);
        int num1 = Integer.parseInt(args[1]);
        int num2 = Integer.parseInt(args[2]);
        int num3 = Integer.parseInt(args[3]);
        int num4 = Integer.parseInt(args[4]);

        if (num1 >= max){
            max = num1;
        }

        if (num2 >= max){
            max = num2;
        }

        if (num3 >= max){
            max = num3;
        }

        if (num4 >= max){
            max = num4;
        }

        System.out.println(max);
    }
}
