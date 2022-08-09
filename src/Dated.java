// 인터페이스의 자식클래스 
// 즉, 이종상속 implements 는 상속을 구현하는것. 
/* 
 * 이종상속 (자식은 class, 부모는 interface)의 경우에는 implements를 사용한다. 3인칭단수동사라 s붙음 
 *상속은 제너럴 구현은 리얼상속  
 */
public class Dated implements Datable{
//부모가 만든 겟셋을 재정의한 것. 오류에 커서 올리면 2가지 방법뜸.
	private int date;
	
	@Override
	public int get() {
		// TODO Auto-generated method stub
		return date;
	}

	@Override
	public void set(int date) {
		// TODO Auto-generated method stub
		this.date=date;
	}// 부모가 추상메소드 갖고있어서 에러남 
	// 하나라도 재정의 안하면 오류남 
}
