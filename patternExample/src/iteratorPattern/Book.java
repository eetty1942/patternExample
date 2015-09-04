package iteratorPattern;


//일반적인 책을 나타내는 클래스. 책이름을 얻는 기능만을 수행한다.
public class Book {
	
	private String name;
	public Book(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
