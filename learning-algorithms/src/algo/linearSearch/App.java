package algo.linearSearch;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//BIG O(N)-->N is the size of an array
	public static int linearSearch(int[] a, int x) {
		int answer = -1;
		for(int i =0; i<a.length;i++) {
			if(a[i]==x) {
				return i;
			}
			return -1;
		}
		return -1;
	}

}
