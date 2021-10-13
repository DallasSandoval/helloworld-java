import java.util.*;

public class Ch74 {
	private static int i;

	public static void main(String[] args) {
		int k = 0, n, j;
		int[] num = new int[16];
		System.out.println("输入要转换的十进制数:");
		n = new Scanner(System.in).nextInt();
		System.out.println(n + "转换为二进制数为:");
		do {
			num[k] = n % 2;
			n = n / 2;
			i = k++;
		} while (n != 0);
		for (k = 15; k >= 0; k--)
			System.out.print(num[k]);
		System.out.print("\n");
	}
}
