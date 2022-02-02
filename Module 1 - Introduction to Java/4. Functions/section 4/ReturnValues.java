public class ReturnValues {
    public static void main(String[] args) {

        double measure1 = measureRectangle(2.2, 4.3);
        double measure2 = measureRectangle(6.9, 5.5);
        double measure3 = measureRectangle(3.2, 4.1);
        double measure4 = measureRectangle(3.5, 1.2);
        double measure5 = measureRectangle(1.6, 5.6);
        double measure6 = measureRectangle(10.1, 5.6);
        double measure7 = measureRectangle(20.2, 5.6);

        stringPrinter(2.2, 4.3, measure1);
        stringPrinter(6.9, 5.5, measure2);
        stringPrinter(3.2, 4.1, measure3);
        stringPrinter(3.5, 1.2, measure4);
        stringPrinter(1.6, 5.6, measure5);
        stringPrinter(10.1, 5.6, measure6);
        stringPrinter(20.2, 5.6, measure7);

    }

    public static double measureRectangle(double length, double width){
        double area = length * width;
        return area;
  
    }

    public static void stringPrinter(double length, double width, double area){
        System.out.println("The area of a rectangle with length of " + length + " and width of "  + width + " is: " + area);
    }
}
