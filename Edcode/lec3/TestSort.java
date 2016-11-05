public class TestSort {
	/** Tests the Sort.sort method. */
	public static void testSort(){
		String [] input = {"a","huge", "tiny","score"};
		Sort.sort(input);
		String[] expected = {"a","huge","score","tiny"};

		// Test to see if input is the same thing as expected.
		// If not, print something useful to the programmer.
		org.junit.Assert.assertArrayEquals(expected, input);
	}

	/** Tests the indexofSmallest method. */
	public static void testindexOfSmallest(){
		String[] input = {"a","huge","tiny","score"};
		int actual = Sort.indexOfSmallest(input, 0);
		int expected = 0;
		//During the test, you may need to change from priviate class to public class

		org.junit.Assert.assertEquals(expected, actual);

		actual = Sort.indexOfSmallest(input, 2);
		expected = 3;

		org.junit.Assert.assertEquals(expected,actual);

	}

	/** Tests the Sort class's methods. */
	public static void main(String[] args){
		testSort();
		testindexOfSmallest();
	}
}