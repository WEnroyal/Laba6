package ua.models;

public class Dish {

	private int id;
	private String name;
	private int price;
	private double weigth;
	
	public Dish(String name, int price, double weigth) {
		this.name = name;
		this.price = price;
		this.weigth = weigth;
	}
	
	public Dish() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getWeigth() {
		return weigth;
	}
	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		long temp;
		temp = Double.doubleToLongBits(weigth);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dish other = (Dish) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		if (Double.doubleToLongBits(weigth) != Double.doubleToLongBits(other.weigth))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dish [name=" + name + ", price=" + price + ", weigth=" + weigth + "]";
	}
	
	
}
