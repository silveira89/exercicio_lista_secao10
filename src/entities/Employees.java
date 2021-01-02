package entities;

import java.util.List;

public class Employees {
	
	int id;
	String name;
	double salary;
	
	public Employees() {
	}
	
	public Employees(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public void increaseSalary(double increase) {
		salary += salary * increase / 100.0; //Sem this porque não existe ambiguidade.
	}
	
	public static Integer position(List<Employees> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return id + ", "
				+  name + ", "
				+ String.format("%.2f", salary);
	}
	
	
	
	

}
