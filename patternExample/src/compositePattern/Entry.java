package compositePattern;

public abstract class Entry {
	public abstract String getName();
	public abstract int getSize();
	public Entry add(Entry entry) throws FileTreatmentException {
		//��Ʈ�� �߰�
		throw new FileTreatmentException();
	}
	
	public void printList() {
		//�˶� ǥ��
		printList("");
	}

	//�տ� �ٿ� ������ ǥ��?
	protected abstract void printList(String prefix);
	
	public String toString() {
		return getName() + " (" + getSize() + ")";
	}
}
 