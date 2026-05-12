public class CheckIfArraySorted {

    public static boolean checkArray(int[] arr) {
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                return flag;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] arr2 = { 1, 3, 3, 4, 5 };
        System.out.println(checkArray(arr1));
        System.out.println(checkArray(arr2));
    }
}
