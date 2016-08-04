public class Main {

    public static void main(String[] args) {
           Dog smallDog; /*Declaration of a dog variable*/
           new Dog(20);  /*Instantiation of the Dog class as a Dog Object*/
           smallDog = new Dog(5); /*Instantiation and Assignment*/
           Dog hugeDog = new Dog(50); /*Declaration,Instantiation and Assignment*/
           smallDog.makeNoise(); /*Invokation of the small dog's makeNoise method*/
           hugeDog.makeNoise();  /*The dot here means we want to use a method of member of 
                                 hugeDog*/
    }
}
