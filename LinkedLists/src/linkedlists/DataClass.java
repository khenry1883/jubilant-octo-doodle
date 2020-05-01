package linkedlists;

public class DataClass {
	private String name;
	private float value;

	public DataClass(String name, float value) {
		this.name = name;
		this.value = value;
	}

	@Override
	public String toString() {
		return "Name: " + this.name + " Value: " + this.value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

}
