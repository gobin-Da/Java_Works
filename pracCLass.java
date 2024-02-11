class Circle{
    final double PI = 3.1416;
    double redius;

    public Circle(double r){
        redius = r;
    }

    public void setRedius(double r){
        redius = r;
    }

    public double getRedius(double r){
        return redius;
    }

    public double getArea(){
        return PI*redius*redius;
    }

    public double getPerimetre(){
        return 2*PI*redius;
    }

    void displayInfo(){
        System.out.println("The area of the cirlce-1 is: "+ getArea());
        System.out.println("The perimetre of the circle-1 is: "+ getPerimetre());
        System.out.println("\n");
    }
}


public class pracCLass {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(25);

        circle1.displayInfo();
        circle2.displayInfo();
        circle3.displayInfo();
    }
}
