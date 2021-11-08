import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] 请输入名字;
        System.out.print(请输入名字);
        String name = sc.nextLine();
        char[] 请输入年龄;
        System.out.print(请输入年龄);
        String age = sc.nextLine();


        System.out.println(name + 名字, 年龄 + age);
        

        Scanner cpdd = new Scanner(System.in);
        System.out.println("请输入需要进行阶乘的数");
        int i = cpdd.nextInt();
        int sum = 1;
        int j = 1;
        for (; j < i; j++) {
            sum *= j;
        }
        System.out.println("阶乘为" + sum);

    }
}