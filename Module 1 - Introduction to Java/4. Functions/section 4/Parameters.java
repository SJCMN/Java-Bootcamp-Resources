public class Parameters {
    public static void main(String[] args) {

        measureRectangle(2.2, 4.3);
        measureRectangle(6.9, 5.5);
        measureRectangle(3.2, 4.1);
        measureRectangle(3.5, 1.2);
        measureRectangle(1.6, 5.6);
        measureRectangle(10.1, 5.6);
        measureRectangle(20.2, 5.6);
    }

    public static void measureRectangle(double length, double width){
        double area = length * width;
        System.out.println("\nLength: " + length + " Width: " + width + "\n");
        System.out.println("The area of rectangle is: " + area + "\n");
    }
}
