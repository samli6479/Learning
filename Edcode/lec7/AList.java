
/*
   size: 3
   [12 3 20 ----]
     0 1  2  3 

The next item always goes in the size's position */

public class AList<Item>{
	/* the stored integers */

	private Item[] items;
	private int size;

	private static int Rfac = 10;

	/*Creates an empty list.*/
	public AList(){
		size = 0;
		items = (Item[]) new Object[100];
	}

	/*Resize our supporting array so it is of given capacity */
	private void resize(int capacity){
		Item[] a = (Item[]) new Object[capacity];
		System.arraycopy(items,0,a,0,size);
		items = a;
	}

	/* Inserts X into the back of the list. */
	public void insertBack(Item x){
		if (size == items.length){
			resize(size*Rfac);
		}

		items[size] = x;
		size = size + 1;
	}

	/* Returns the item from the back of list */
	public Item getBack(){
		int last = size - 1;
		return items[last];
	}

	/* Gets the ith item in the list 0 is the base case*/
	public Item get(int i){
		return items[i];
	}

	/** Deletes item from back of list and return the deleted items */
	public Item deleteBack(){
		Item itemtoreturn = getBack();
		items[size-1] = null;
		size = size - 1;
		return itemtoreturn;
	}

	/* Returns the size of the list */
	public int size(){
		return size;
	}

	public static void main(String[] args){
		AList a1 = new AList();
		int i = 0;
		while (i < 10000000){
			a1.insertBack(i);
			i = i + 1;
		}
		System.out.println("Done!");
	}
}