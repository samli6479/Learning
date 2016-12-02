public class maxim {
	public static Object max(Compare [] items){
		int maxDex = 0;
		for (int i = 0; i < items.length; i += 1){
			int cmp = items[i].compareTo(items[maxDex]);
			if (cmp > 0){
				maxDex = i;
			}
		}
		return items[maxDex];
	}

	/* General Maximization Function Through Inheritance */

	public static void main(String[] args){
		Dog [] dogs = {new Dog("Elyse",10),new Dog("James", 35),
						new Dog("Brain",15)};
		Dog maxDog = (Dog) max(dogs);
		maxDog.bark();
	}
}