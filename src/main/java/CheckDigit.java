public class CheckDigit {
    public static void main(String[] args) {
        long num = Long.parseLong(args[0]);
        long sum1 = 0;
        long sum2 = 0;
        int count = 0;

        while (num > 0){
            if ((count%2) == 0){
                sum1 += num % 10;
            }
            else{
                sum2 += num % 10;
            }
            count ++;
            num /= 10;
        }

        sum1 %= 10;
        sum2 %= 10;
        sum2 *= 3;
        sum2 %= 10;
        sum1 += sum2;
        sum1 %= 10;

        System.out.println(sum1);
    }
}
