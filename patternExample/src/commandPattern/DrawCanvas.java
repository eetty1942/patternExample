package commandPattern;

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Drawable 인터페이스 구현 클래스
 * 그림을 그리는 명령의 집합은 history field에 저장이 된다.
 * 
 * @author SMLEE
 *
 */
public class DrawCanvas extends Canvas implements Drawable {
	
	//그림을 그리는 색
	private Color color = Color.red;
	
	//그림을 그리는 점의 반경
	private int radius = 6;
	
	//이력
	private MacroCommand history;
	
	//생성자
	public DrawCanvas (int width, int height, MacroCommand history) {
		setSize(width, height);
		setBackground(Color.white);
		this.history = history;
	}
	
	//이력 전체를 다시 그리기
	public void paint(Graphics g) {
		
		history.execute();
		
	}
	
	//그림 그리기
	public void draw(int x, int y) {
		Graphics g = getGraphics();
		g.setColor(color);
		g.fillOval(x-radius, y-radius, radius*2, radius*2);
	}

}
