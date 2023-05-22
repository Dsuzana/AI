public class Test {
	public static void main(String[] args)
	{
		int maxRestarts=-1;
		int n=12;
		long start = System.currentTimeMillis();
			new Langford(n,maxRestarts);
		long end = System.currentTimeMillis();
		System.out.println("Koha e cila i duhet algoritmit që të zgjidh problemin është "+(end-start)/1000.+"s.");
	}
}