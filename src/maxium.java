//求最大值
public class maxium {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6};//定义一个数组存放指定元素

        int sum = arr[0];//假设第一个元素是最大值
        //for循环遍历数组中元素，每次循环跟数组索引为0的元素比较大小
        for (int i = 0; i < arr.length; i++){
            if (sum < arr[i]){//数组中的元素跟sum比较，比sum大就把它赋值给sum作为新的比较值
                sum = arr[i];
            }
        }
        System.out.println(sum);//输出数组中的最大值
    }
}