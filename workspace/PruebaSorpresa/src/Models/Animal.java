package Models;

public class Animal {
	private int edad;
	private String name;

	public Animal(int edad, String name) {
		super();
		this.edad = edad;
		this.name = name;
	}




	public int getEdad() {
		return edad;
	}




	public void setEdad(int edad) {
		this.edad = edad;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String toString(){
		
		
		return "edad: "+getEdad()+" nombre: "+getName();
	}
}
