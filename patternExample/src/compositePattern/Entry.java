package compositePattern;

public abstract class Entry {
	public abstract String getName();
	public abstract int getSize();
	public Entry add(Entry entry) throws FileTreatmentException {
		//엔트리 추가
		throw new FileTreatmentException();
	}
	
	public void printList() {
		//알람 표시
		printList("");
	}

	//앞에 붙여 종류를 표시?
	protected abstract void printList(String prefix);
	
	public String toString() {
		return getName() + " (" + getSize() + ")";
	}
}
 