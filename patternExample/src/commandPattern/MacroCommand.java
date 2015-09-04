package commandPattern;

import java.util.Iterator;
import java.util.Stack;


// ������ ����� ���� ����̴�. macro = ū
public class MacroCommand implements Command{
	
	//����� ������ �ǹ��Ѵ�. undo ����� �����Ӱ� �����ϱ� ����
	private Stack commands = new Stack();
	
	//����
	public void execute() {

		//command field�� ����Ǿ� �ִ� ������ �ν��Ͻ��� execute �޼ҵ� ȣ�� 
		Iterator it = commands.iterator();
		
		while (it.hasNext()) {
			((Command)it.next()).execute();
		}
	}
	
	//�߰� - ���ÿ� �״´�.
	public void append(Command cmd) {
		
		if(cmd != this) {
			commands.push(cmd);
		}
	}
	
	//������ ��� ����
	public void undo() {
		
		if(!commands.empty()) {
			/**��ɵ��� ������ ���ÿ��� ������ ��ɸ��� �����ϴ� ���̹Ƿ� 
			 * ������ Ư¡�� LIFO ������ ����Ͽ� �������� �� ��ɸ� pop ��Ų��. 
			 */
			commands.pop();
		}
	}
	
	//���� ����
	public void clear() {
		
		//clear ����� ����Ͽ� ��� �����Ѵ�.
		commands.clear();
	}

}
