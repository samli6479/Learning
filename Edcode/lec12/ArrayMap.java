public class ArrayMap<K, V>{

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

	public K[] keys(){
		return keys;
	}

}