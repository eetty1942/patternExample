package iteratorPattern;

import iteratorPattern.Iterator;;

// 요소들이 나열되어 있는 집합체 - 인터페이스를 구현하는 클래스들을 배열과 같이 모아둔다
public interface Aggregate {
	public abstract Iterator iterator();
}
