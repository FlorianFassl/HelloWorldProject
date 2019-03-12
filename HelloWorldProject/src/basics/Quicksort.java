package basics;

public class Quicksort {
	//
    static int[] zahlen = {4, 2, 9, 6, 10, 9, 2};
    //
	public static void main(String[] args) {
		int[] zahlen = {4, 2, 9, 6, 10, 9, 2};
		for (int i = 0; i < zahlen.length; i++) {
			System.out.println(zahlen[i]);
		}}
		static void quicksort(int links, int rechts) {
			if(links < rechts) {
				int teiler = teile(links,rechts);
				quicksort(links, teiler-1);
				quicksort(teiler+1, rechts);
			}
		}
		private static int teile(int links, int rechts) {
		  int  i= links;
		  int  j= rechts-1;
		 
		  
		  
		  return i;
		}

	

}

