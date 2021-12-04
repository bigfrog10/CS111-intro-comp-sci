public class FindDuplicate {
    public static void main(String[] args) {
        int n = args.length;
        int[] myArray = new int[n];
        boolean result = false;
        for(int i = 0; i < n; i ++){
            myArray[i] = Integer.parseInt(args[i]);
        }
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if (myArray[i] == myArray[j]) {
                    result = true;
                    break;
                }
            }
        }

        System.out.println(result);
    }
}
