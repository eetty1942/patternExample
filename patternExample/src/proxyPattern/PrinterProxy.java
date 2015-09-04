package proxyPattern;

public class PrinterProxy implements Printable{
	
	private String name;
	private Printer real;
	
	public PrinterProxy() {
		
	}
	public PrinterProxy(String name) {
		this.name = name;
	}
	
	//'본인'에게도 설정
	public synchronized void setPrinterName(String name) {
		if(real != null) {
			real.setPrinterName(name);
		}
		this.name = name;
	}
	
	//이름 설정
	public String getPrinterName() {
		return name;
	}
	
	
	public void print(String string) {
		realize();
		real.print(string);
	}
	
	//본인 생성
	private synchronized void realize() {
		if(real == null) {
			real = new Printer(name);
		}
	}
}
