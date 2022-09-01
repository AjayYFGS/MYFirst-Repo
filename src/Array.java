
public class Array {

	public static void main(String[] args) {
		int value=7;
		int[] values = new int[5];
		//System.out.println(values[0]);
		values[0]=24;
		values[1]=35;
		values[3]=67;
		values[4]=435;
		System.out.println(values[1]);
		for(int i=0;i<values.length;i++) {
			System.out.print(values[i]+" ");
		}
		
		int[] val= {6,7,3,7,5,2};
		for (int j = 0;j<val.length;j++) {
			System.out.print(val[j]+" ");
		
		}
		int[][]  a= {
				{3,6,26,97,90,7},
				{89,9,3,2},
				{78,8,90,5,87},
		};
		
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}System.out.println();
		}
	

}
}