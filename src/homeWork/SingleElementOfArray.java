package homeWork;

public class SingleElementOfArray {
    public static int findSingleElement(int[] arr) {

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            index = index ^ arr[i];
        }

        return index;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5, 5};
        System.out.println(findSingleElement(arr));
    }

}
