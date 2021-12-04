public class RandomWalker {
    public static void main(String[] args) {
        int step = Integer.parseInt(args[0]);
        int random = 0;
        int x = 0;
        int y = 0;
        double squareDistance = 0;

        System.out.println("(" + x + ", " + y + ")");
        while (step > 0){
            random = (int)(Math.random() * 4);

            if(random == 0){
                y += 1;
            }
            else if(random == 1){
                x += 1;
            }
            else if(random == 2){
                y -= 1;
            }
            else if(random == 3){
                x -= 1;
            }

            System.out.println("(" + x + ", " + y + ")");
            step--;
        }

        squareDistance = Math.pow(x, 2) + Math.pow(y, 2);
        System.out.println("Squared distance = " + squareDistance);
    }
}
