public class DocComments {
    public static void main(String[] args) {
        
    }

    /**
     * Function name: greet
     * 
     * Inside the function:
     * 1. prints: "Hi"
     */

    public static void greet() {
        System.out.println("Hello!");
    };

    /**
     * Function name: printText
     * @param name
     * @param age
     * 
     * 
     * 
     */

    public static void printText(String name, String age) {
        System.out.println("Hi");
    }

    /**
     * Function name: calculateArea
     * 
     * @param length
     * @param width
     * @return
     * 
     * Inside the function:
     * 1. calculates the area of a rectangle. 
     * 2. returns area 
     */

    public static double calculateArea(double length, double width) {
        double area = length * width;
        return area;
    }

}