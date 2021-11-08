public class length {
    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 4, 5 };
        System.out.println(a.length);// Output array length
        int sum = arrSum(a);
        System.out.println("Sum of array elements:" + sum);// The sum of all elements in the output array
        System.out.println("The average of this array is:" + average(a));
    }

    public static int arrSum(int arr[]) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            temp += arr[i];
        }
        return temp;
    }

    private static double average(int[] array) {
        int sum = 0;
        for (int x : array) {
            sum += x;
        }
        return (double) sum / (double) array.length;
    }

}
