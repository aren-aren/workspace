package Study2;

public class ArrayStudy3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {2,5,4,1,3};
		
		for(int i = 0 ; i < ar.length ; ++i) {
			
			int idx = i;
			for(int j = i+1 ; j < ar.length ; ++j) {
				if(ar[idx] > ar[j]) {
					idx = j;
				}
			}
			
			int num = ar[idx];
			ar[idx] = ar[i];
			ar[i] = num;
			
			ar[idx] = ar[idx] + ar[i];
			ar[i] = ar[idx] - ar[i];
			ar[idx] = ar[idx] - ar[i];
		}
		
		for(int i = 0 ; i < ar.length ; ++i) {
			System.out.println(ar[i]);
		}
	}

}
