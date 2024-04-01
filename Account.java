package object_class;
//은행계좌 클래스(신한은행)
public class Account {
	//멤버 변수(field)
	static final String BANKNAME="신한은행";//정적 멤버 변수,getter 변수 선언
	String accountNo; //계좌번호	- 인스턴스 멤버 변수
	String ownerName;//			- 인스턴스 멤버 변수
	int balance ;//잔액			- 인스턴스 멤버 변수
	
	//생성자
	public Account(String accNo, String owName, int bal) {
	this.accountNo= accNo;
	this.ownerName = owName;
	this.balance = bal;
	}
	
	//예금을한다 메소드 (기능) / void는 리턴값 X
	void deposit (int amount) {
		balance += amount;
	}
	
	public Account () {
		
		
		
	}
	
	
	//인출한다 메소드 / 타입이 나오면 리턴값 O
	int withraw (int amount) throws Exception {// 인위적 예외처리
		if(balance < amount) {
			throw new Exception("잔액이 부족합니다.");
		}
		balance -=amount;
		return amount;
		
	}
}
