package iteratorPattern;


//��Ҹ� �ϳ��� �����ϸ鼭 �����Ǵ� ������ ���� ������ �Ѵ�.
public interface Iterator {
	//������� �˻�
	public abstract boolean hasNext();
	//���� ��Ҹ� ��´�.
	public abstract Object next();
}
