package commandPattern;

import commandPattern.Command;
import java.awt.Point;

/**
 * position, drawable이라는 두개의 필드를 가진다.
 * drawable = 그리기 실행
 * position = 그리기가 실행된 위치를 나타냄
 * 
 * @author SMLEE
 *
 */

public class DrawCommand implements Command{

	//그림을 그리는 대상의 객체 생성
	protected Drawable drawable;
	
	//그림을 그리는 위치
	private Point position;
	
	//셍성자
	public DrawCommand(Drawable drawable, Point position) {
		
		this.drawable = drawable;
		this.position = position;
		
	}
	
	//실행
	public void execute() {
		
		drawable.draw(position.x, position.y);
		
	}
}
