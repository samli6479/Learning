/**
 * Created by edward on 8/4/16.
 */
public class Dog {
    public int size;  /* Instance variable*/

    public Dog(int startSize){    /*Same as def __init__(self, StartSize) how to create a 
                                  initialize the the new object of the class*/
          this.size = startSize;
    }

    public void makeNoise(){   /*If the object is going to be invoked by given instance
                                 then choose Non-static*/
        if (size<10){
           System.out.println("Horrific yapping");
        
        } else if (size < 30){
           System.out.println("barl");
        } else {
          System.out.println("Bark!");
        }
    }
}
