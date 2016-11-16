/** Provide the ability to print args in sorted order.*/


public class Sort {
	/** Puts A in sorted order. */
	public static void sort(String[] a){
		sort(a,0);
	}

	/** Returns the index of the smallest thing in A,
	Starting from Start*/

	public static int indexOfSmallest(String[] a, int start){
		int minDex = start;
		int i = start;
		while (i < a.length){
			int compareResult = a[i].compareTo(a[minDex]);

			if (compareResult<0){
				minDex = i;
			}
			i = i + 1;
		}
		return minDex;
	}

    /** Sort A starting from position Start. */
	private static void sort(String[] a, int start){
		if (start == a.length){
			return;
		}

		// Find the smallest thing.
		int mindex = indexOfSmallest(a, start);

		// Swap it to the front.
		swap(a , mindex, start);


		// Find the smallest thing. 
		// Swap it to the front
		// Recursively sort the rest.
		sort(a, start +1 );
	}

	/** Swap items in position ix and iy in A. */
	public static void swap(String [] a, int ix, int iy){
		String number = a[ix];
		a[ix] = a[iy];
		a[iy] = number;
	}

	/** print string */
	public static void print(String [] a){

	}

	/** Prints ARGS in sorted order .*/
	public static void main(String [] args){

	}
}


// Bad repository test stuff
// public class testsort {
// 	/** Tests the sort.Sort method. */
// 	public static void testSort(){
// 		String [] input = {"a","huge", "tiny","score"};
// 		sort.Sort(input);
// 		String[] expected = {"a","huge","score","tiny"};

// 		// Test to see if input is the same thing as expected.
// 		// If not, print something useful to the programmer.
// 		if (input.length != expected.length){
// 			System.out.println("Length did not match");
// 			System.out.println("input length: "+ input.length);
// 			System.out.println("expected length: "+ expected.length);
// 		}

// 		int i = 0;
// 		while (i < input.length){
// 			if (input[i] != ...)
// 		}
// 	}