public class bubbleSort {
/*
  Bubble sort is pairs of adjacent elements of an array compared and swapped if they are not in order.
  Since it has a time complexity of O(n^2), it is not recommended to sort large set of data.
 */
    public static void main(String[] args) {
        int[] array = {4, 2, 8, 20, 10, 3};
        bubble(array);
        for (int i : array) {
            System.out.println(i);
        }
    }
    public static void bubble(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length-i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j + 1] = temp;

                }
            }
        }
    }


}


