
import java.util.Arrays;

public class MainProgram {
    
    public static void main(String[] args) {
        int[] array = {3, 1, 5, 99, 3, 12};
        
        System.out.println(Arrays.toString(array));
        MainProgram.sort(array);
        System.out.println(Arrays.toString(array));
    }
    
    public static int smallest(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
            }
        }
        return min;
    }
    
    public static int indexOfSmallest(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (MainProgram.smallest(array) == array[i]) {
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
         int min = array[startIndex];
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
            }
        }
        int index = startIndex;
        
        for (int i = startIndex; i < array.length; i++) {
            if (min == array[i]) {
                index = i;
            }
        }
        return index;
        
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        
    }
    
    public static void sort(int[] array) {
        
        for (int i = 0; i < array.length; i++) {
            MainProgram.swap(array, i, MainProgram.indexOfSmallestFrom(array, i));
        }
        
    }
    
}
