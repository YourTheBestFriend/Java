package Classes;

public class Product<T> {
	private T id;
	public Product(T id)
	{
		this.setId(id);
	}

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}
}
