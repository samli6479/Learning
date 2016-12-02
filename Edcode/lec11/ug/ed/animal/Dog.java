package ug.ed.animal;

public class Dog {
	private String name;
	private String breed;
	private double size;

	public Dog(String n, String b, double s){
		name = n;
		breed = b;
		size = s;
	}

	public String toString (){
		return name + " is a " + breed + " weight " + size + " kgs";
	}
}