public class Perimetr {
    public static void main(String[] args) {
        PerimetrTriangle perimetrofTriangle = new PerimetrTriangle ();
        System.out.println(PerimetrTriangle.triangle(2));
        System.out.println(PerimetrTriangle.square(2));
        System.out.println(PerimetrTriangle.circle(4,5));
    }
}

class PerimetrTriangle {
    int a;
    int R;
    public static int triangle (int a){
        a = a*3;
        return a;
    }
    public static int square (int a){
        a = 4*a;
        return a;
    }
    public static double circle (double a, int R){
        a = a*R*3.14;
        return a;
    }
}
