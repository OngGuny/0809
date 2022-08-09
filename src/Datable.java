//인터페이스는 이름을 형용사형으로 만듦 
/*1. public static final이 생략된 변수와 public abstract가 생략된 메소드만 가진다.
 * 
 * 
 */
public interface Datable { 
	//변수 안되고 final, 즉 상수만 가능 
	int SUN = 0,MON=1,TUE=2,WED=3,THU=4,FRI=5,SAT=6;
	
//int 앞에는 public이 생략되어 있는것. 그래서 자식메소드에서도 public 가져오는것. 	
	int get(); //월화수목금토의 값을 가져옴  중괄호 없는 메소드가 이것들임 
	void set(int date); // 이러고 데이터블의 자식들을 만듦 
}
