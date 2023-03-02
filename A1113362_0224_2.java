import java.util.*;

public class A1113362_0224_2
{
	public static void main(String[] argv)
	{
		System.out.println("請輸入攝氏溫度：");
		Scanner sc = new Scanner(System.in);
		double celsius = sc.nextDouble();
		double fahrenheit = (celsius / 5) * 9 + 32;
		System.out.println(celsius + "celsius = " + fahrenheit + "fahrenheit");
	}
}