/**
 * Created by edward on 8/4/16.
 */
public class Dog implements Compare{
    private int size;  /* Instance variable*/
    private String name;

    public Dog(String dogname,int startSize){    /*Same as def __init__(self, StartSize) how to create a 
                                  initialize the the new object of the class*/
          this.size = startSize;
          this.name = dogname;
    }


    /* More restricted than API demanded */
    public int compareTo(Compare o){
        Dog other = (Dog) o;
        return this.size - other.size;
    }

    public void bark(){   /*If the object is going to be invoked by given instance
                                 then choose Non-static*/
        if (size<10){
           System.out.println(name + " Horrific yapping!");
        
        } else if (size < 30){
           System.out.println(name + " Woo!");
        } else {
          System.out.println(name + " Bark!");
        }
    }

    /* Returns larger dog. */
    public static Dog maxDog(Dog d1, Dog d2){
        if (d1.size > d2.size){
           return d1;
        }
        return d2;
    }
}
