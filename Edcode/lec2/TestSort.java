/** Annoances
1. Output is too verbose
2. Have to manually commet out tests we don't really care about
3. Have to manually invole tests */

/** Fixes
1. Annotate each test with @org.junit.Test
2. Make our methods non-static.
3. jh61b.junit.textui.runClasses */

/** More Annoyances:
1. Typing out org.junit.Test and org.junit.Assert is annoying.
*/

/* Fixes
1. Start Java files with:
import org.junit.Test;
import static org.junit.Asser.*;
*/
import org.junit.Test;
import static org.junit.Assert.*;

public class TestSort {
	/** Tests the Sort.sort method. */

	@Test
	public void testSort(){
		String [] input = {"a","huge", "tiny","score"};
		Sort.sort(input);
		String[] expected = {"a","huge","score","tiny"};

		// Test to see if input is the same thing as expected.
		// If not, print something useful to the programmer.
		assertArrayEquals(expected, input);
	}

	/** Tests the indexofSmallest method. */
	@Test
	public void testindexOfSmallest(){
		String[] input = {"a","huge","tiny","score"};
		int actual = Sort.indexOfSmallest(input, 0);
		int expected = 0;
		//During the test, you may need to change from priviate class to public class

		assertEquals(expected, actual);

		actual = Sort.indexOfSmallest(input, 2);
		expected = 3;

		assertEquals(expected,actual);

	}

	@Test
	public void testSwap(){
		String[] input = {"huge","a","tiny","score"};
		Sort.swap(input,0,1);
		String[] expected = {"a","huge","tiny","score"};

		assertArrayEquals(expected,input);
	}

	/** Tests the Sort class's methods. */
	public static void main(String[] args){
		jh61b.junit.textui.runClasses(TestSort.class);
	}
}