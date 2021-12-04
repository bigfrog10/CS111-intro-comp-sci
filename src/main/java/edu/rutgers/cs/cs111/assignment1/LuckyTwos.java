package edu.rutgers.cs.cs111.assignment1;

public class LuckyTwos {
    public static void main(String[] args) {
        LuckyTwos lt = new LuckyTwos();
        int res = lt.count(272521);
        System.out.println(res);
    }

    public int count(int number) {
        int res = 0;
        while (number > 0) {
            if (number % 10 == 2)
                res += 1;
            number = number / 10;
        }
        return res;
    }
}
