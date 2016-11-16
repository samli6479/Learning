public class HOF {


	public static int do_twice(IntUnaryFunction f, int x){
		return f.apply(f.apply(x));
	}


	public static void main(String[] args){
		System.out.println(do_twice(new Edf() ,2));
		System.out.println(do_twice(new Square(), 2));
	}
}