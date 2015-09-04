package commandPattern;

import commandPattern.Command;
import java.awt.Point;

/**
 * position, drawable�̶�� �ΰ��� �ʵ带 ������.
 * drawable = �׸��� ����
 * position = �׸��Ⱑ ����� ��ġ�� ��Ÿ��
 * 
 * @author SMLEE
 *
 */

public class DrawCommand implements Command{

	//�׸��� �׸��� ����� ��ü ����
	protected Drawable drawable;
	
	//�׸��� �׸��� ��ġ
	private Point position;
	
	//�ļ���
	public DrawCommand(Drawable drawable, Point position) {
		
		this.drawable = drawable;
		this.position = position;
		
	}
	
	//����
	public void execute() {
		
		drawable.draw(position.x, position.y);
		
	}
}
