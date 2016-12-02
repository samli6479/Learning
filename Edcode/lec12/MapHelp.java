public class MapHelp{
	public static <K, V> V get(ArrayMap<K,V> am, K k){
		if (am.containsKey(k)){
			return am.get(k);
		}
		return null;
	}

	public static void main(String[] args){
		ArrayMap<Integer, String> ismap = new ArrayMap<Integer, String>();
		ismap.put(5, "hello");
		ismap.put(10,"Ketch");

		System.out.println(MapHelp.get(ismap ,5));
		System.out.println(MapHelp.get(ismap, 1));
	}
}