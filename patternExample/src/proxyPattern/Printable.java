package proxyPattern;

public interface Printable {
	
	public abstract void setPrinterName(String name);	//이름의 설정
	public abstract String getPrinterName();			//이름 출력
	public abstract void print(String string);			// 문자열 출력

}
