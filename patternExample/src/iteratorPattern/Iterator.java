package iteratorPattern;


//요소를 하나씩 나열하면서 루프되는 변수와 같은 역할을 한다.
public interface Iterator {
	//다음요소 검사
	public abstract boolean hasNext();
	//다음 요소를 얻는다.
	public abstract Object next();
}
