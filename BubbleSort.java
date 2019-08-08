package sorts;

public class BubbleSort {
  /** Bubble sort method */
  public static void bubbleSort(int[] list) {
    boolean needNextPass = true;
    
    for (int outer = 1; outer < list.length && needNextPass; outer++) {
      // Array may be sorted and next pass not needed
      needNextPass = false;
      for (int inner = 0; inner < list.length - outer; inner++) {
        if (list[inner] > list[inner + 1]) {
          // Swap list[i] with list[i + 1]
          int temp = list[inner];
          list[inner] = list[inner + 1];
          list[inner + 1] = temp;
          
          needNextPass = true; // Next pass still needed
        }
      }
    }
  }

  /** A test method */
  public static void main(String[] args) {
    int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    bubbleSort(list);
    for (int i = 0; i < list.length; i++)
      System.out.print(list[i] + " ");
  }
}
