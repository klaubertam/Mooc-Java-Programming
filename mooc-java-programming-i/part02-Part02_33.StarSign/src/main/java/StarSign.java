
public class StarSign {

    public static void main(String[] args) {

        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        int i = 0;
        while (i < number) {
            System.out.println("*");
            i++;
        }
    }

    public static void printSquare(int size) {
        int i=0;
       while(i<size){
           System.out.println("****");
       i++;}
    }

    public static void printRectangle(int width, int height) {
        for(int i=0;i<width;i++){
        for(int j=0;i<height;j++){System.out.println("*");}}
    }

    public static void printTriangle(int size) {
         for(int i=0;i<size;i++){
        for(int j=0;j<i+1;j++){System.out.println("*");}}
        
    }
}
