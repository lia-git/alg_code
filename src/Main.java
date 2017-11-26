import alg.Triangle;

public class Main {

    public static void main(String[] args) {

        Triangle tri = new Triangle();
        int[][]  s = {{1},{2,4},{5,2,4},{6,3,1,4}};
        System.out.println(s);
        tri.minimalTotal(s);
        System.out.println("Hello World!");
    }
}
