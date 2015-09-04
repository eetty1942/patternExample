package commandPattern;

public interface Command {
	
	
	// cammand는 명령을 표현하기 위한 인터페이스이다. command 인터페이스는 단 하나의 메소드(execute)를 가진다.
	//실행하다 라는 뜻을 가지는 메소드
	public abstract void execute();
}
