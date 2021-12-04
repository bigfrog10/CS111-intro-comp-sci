public class PolygonTransform {
    //Returns a new array object that is an exact copy of the given array.
    //The given array is not mutated.
    public static double[] copy(double[] array){
        double[] copyArray = new double[array.length];
        for(int i = 0; i < array.length; i++){
            copyArray[i] = array[i];
        }
        return copyArray;
    }

    //Scales the polygon by the factor alpha.
    public static void scale(double[] x, double[] y, double alpha){
        for (int i = 0; i < x.length; i++) {
            x[i] = alpha * x[i];
            y[i] = alpha * y[i];
        }
    }

    //Translates the given polygon by (dx, dy).
    public static void translate(double[] x, double[] y, double dx, double dy){
        for (int i = 0; i < x.length; i++){
            x[i] = dx + x[i];
            y[i] = dy + y[i];
        }
    }

    //Rotates the given polygon theta degrees counterclockwise, about the origin.
    public static void rotate(double[] x, double[] y, double theta){
        double[] copyX = copy(x);
        double[] copyY = copy(y);

        double radi = Math.toRadians(theta);

        for (int i = 0; i < x.length; i++){
            x[i] = copyX[i] * Math.cos(radi) - copyY[i] * Math.sin(radi);
            y[i] = copyY[i] * Math.cos(radi) + copyX[i] * Math.sin(radi);
        }
    }
}
