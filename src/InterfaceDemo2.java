import java.util.Arrays;

public class InterfaceDemo2 { 
	public static void main(String[] args) {
		Student[] array = { new Student("한지민", 56), new Student("박지민", 100), new Student("홍지민", 77) };
		Arrays.sort(array);// object의 자식들은 전부 다형성으로 정렬할수있다.
		System.out.println(Arrays.toString(array));// 전에는 어떤 기준으로 소팅하는지 몰랐기 때문에 일일히 코딩했는데. 이제는 인터페이스 상속시켜서 어떤걸 기준으로 소팅하는지만 알려주면 바로한다. 
	}
}
