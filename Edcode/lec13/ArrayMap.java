import java.util.List;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayMap<K, V> implements Iterable<K>{

	private K[] keys;
	private V[] values;
	private int size;

	public ArrayMap(){
		keys = (K[]) new Object[100];
		values = (V[]) new Object[100];
		size = 0;
	}

	/* Finds a given key and returns index 
		or -1 if not in list.*/
	private int findKey(K key){
		for (int i = 0; i < size; i +=1){
			if (keys[i].equals(key)){
				return i;
			}
		}
		return -1;
	}

	public void put(K key, V val){
		int loc = findKey(key);
		if (loc < 0){
			keys[size] = key;
			values[size] = val;
			size += 1;
		} else {
			values[loc] = val;
		}
	}

	public V get(K key) {
		return values[findKey(key)];
	}

	public boolean containsKey(K key){
		int i = findKey(key);
		return (i > -1);
	}

	public List<K> keys(){
		if (size == 0){
			return null;
		}
		return Arrays.asList(keys).subList(0,size);
	}


	/* Creates a iterator 
	1. Needs to know the location
	2. Needs to have the hasNext() method
	3. Needs to have the next() method
	*/
	public class MapIt implements Iterator<K>{
		private int loc;

		public MapIt(){
			loc = 0;
		}

		// Returns true if the iterator has next thing
		public boolean hasNext(){
			if (loc < size){
				return true;
			}
			return false;
			// return (Location < size);
		}

		// Returns current thing and moves to next
		public K next(){
			K current = keys[loc];
			loc += 1;
			return current;
		}
	}

	public Iterator<K> iterator(){
		return new MapIt();
	}

}