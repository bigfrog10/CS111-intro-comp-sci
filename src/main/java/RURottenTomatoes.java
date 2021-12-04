public class RURottenTomatoes {
    public static void main(String[] args) {
        int[][] Arr = new int[Integer.parseInt(args[0])][Integer.parseInt(args[1])];
        int a = 2;
        int col = 0;
        int sum = 0;
        int index = 0;
        int[] temporary = new int[Arr[index].length];

        for (int i = 0; i < Arr.length; i++){
            for (int j = 0; j < Arr[i].length; j++){
                Arr[i][j] = Integer.parseInt(args[a]);
                a++;
            }
        }

        for (int i = 0; i < Arr[0].length; i++){
            sum = 0;
            for (int j = 0; j < Arr.length; j++) {
                sum += Arr[j][i];
            }
            temporary[index] = sum;
            index++;
        }

        for (int i = 0; i <= temporary.length-1; i++){
            if(temporary[i] > temporary[col]){
                col = i;
            }
        }

        System.out.println(col);
    }
}
