public class ReturnValues {
    public static void main(String[] args) {
        
        double measure1 = measureRectangle(4.3, 2.2);
        double measure2 = measureRectangle(3.2, 4.1);
        double measure3 = measureRectangle(3.5, 1.2);
        double measure4 = measureRectangle(1.6, 5.6);
        double measure5 = measureRectangle(2.2, 4.3);

        stringPrinter(4.3, 2.2, measure1);

    }

    public static double measureRectangle(double length, double width) {
        double area = length * width;
        return area;  
    }

    public static void stringPrinter(double length, double width, double area){
        System.out.println("The area of a rectangle with the width of: " + width + " and a length of " + length + " comes to: " + area );
    }

}