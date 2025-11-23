public class arrayCreation{
  public static void main(String[] args){
    // Method 1: Using new keyword
    int[] arr1 = new int[5];
    arr1[0] = 10;
    arr1[1] = 20;

    // Method 2: Using array literal
    int[] arr2 = {1, 2, 3, 4, 5};

    // Method 3: Using Arrays.fill() method
    int[] arr3 = new int[5];
    java.util.Arrays.fill(arr3, 7);

    System.out.println("Array 1: " + java.util.Arrays.toString(arr1));
    System.out.println("Array 2: " + java.util.Arrays.toString(arr2));
    System.out.println("Array 3: " + java.util.Arrays.toString(arr3));
  }
}