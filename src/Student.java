// interface comparable<T> 의 자식으로 학생을 만들면 학생도 비교 정렬 할 수 있을것. 
// interface comparable<T> T는 타입. 타입 넣으면 비교해주겠다는거 아까썼던 string 도 comparable(상위인터페이스)의 하위클래스
public class Student implements Comparable<Student>{ // 스튜던트를 자식으로 만들어서 아래 compare에서 재정의를 해서 오류 없애줌 
	private String name; 			// 기능을 덧붙이는것. comparable 을 붙임으로써 인터페이스는 다중상속이 되기때문에.  객체를 정렬하기위해서 compare 을 상속받게함. 다중상속 : 여러 기능을 추가하기위해서 하는것. 
	private int total;
	
	
	public Student(String name, int total) {
		this.name = name;
		this.total = total;
	}
//주소 찍지말고 tostring 호출하게 만들어준다 
@Override
	public String toString() {
		return String.format("Student [name=%s, total=%s]", name, total);
	}

	//implements Comparable 넣어주면 오류뜬다 오류 해결책의 첫번쨰꺼 누르면 아래 삽입됨 
	@Override
	public int compareTo(Student o) {
		//나는 total 기준으로 정렬할꺼야 
	//	return this.total-o.total;
		//나는 이름 기준으로 정렬할꺼야
		return this.name.compareTo(o.name);
	}

}
