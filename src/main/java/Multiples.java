public class Multiples {
    public static void main(String[] args) {
        int n = 200000;
        int sum = 0;
        int count = 0;

        for(int i = 0; i <= n; i++){
            if (i % 17 ==0){
                count++;
                sum = i + sum;
            }
        }
        double average = (double)sum/count;
        System.out.println(average);
    }
}
