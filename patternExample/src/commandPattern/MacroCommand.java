package commandPattern;

import java.util.Iterator;
import java.util.Stack;


// 복수의 명령을 모은 명령이다. macro = 큰
public class MacroCommand implements Command{
	
	//명령의 집합을 의미한다. undo 명령을 자유롭게 수행하기 위함
	private Stack commands = new Stack();
	
	//실행
	public void execute() {

		//command field에 저장되어 있는 각각의 인스턴스의 execute 메소드 호출 
		Iterator it = commands.iterator();
		
		while (it.hasNext()) {
			((Command)it.next()).execute();
		}
	}
	
	//추가 - 스택에 쌓는다.
	public void append(Command cmd) {
		
		if(cmd != this) {
			commands.push(cmd);
		}
	}
	
	//마지막 명령 삭제
	public void undo() {
		
		if(!commands.empty()) {
			/**명령들의 집합인 스택에서 마지막 명령만을 제거하는 것이므로 
			 * 스택의 특징인 LIFO 구조를 사용하여 마지만에 들어간 명령만 pop 시킨다. 
			 */
			commands.pop();
		}
	}
	
	//전부 삭제
	public void clear() {
		
		//clear 명령을 사용하여 모두 삭제한다.
		commands.clear();
	}

}
