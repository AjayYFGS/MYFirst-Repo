import java.util.Scanner;

public class MatrixAdd {
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter how many rows do you want:-- ");
		int row=s.nextInt();
		System.out.print("Enter how many cols do you want:-- ");
		int col=s.nextInt();
		int[][] matx1=new int[row][col];
		for (int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
			 System.out.printf("Enter the Matrix1 element[%d],[%d]:--",i,j);
			 matx1[i][j]=s.nextInt();
			}
		}
		int[][] matx2=new int[row][col];
		for (int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
			 System.out.printf("Enter the Matrix2 element[%d],[%d]:--",i,j);
			 matx2[i][j]=s.nextInt();
			}
		}
		
		
		System.out.println("matrix1-----");
		for (int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {	 
				System.out.print(matx1[i][j]+" ");
	}System.out.println();
}
		
		System.out.println("matrix2-----");
		for (int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {	 
				System.out.print(matx2[i][j]+" ");
	}System.out.println();
}
		System.out.println("here adding of two matrix m1,m2");
		int[][] matx3=new int[row][col];
		for (int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				matx3[i][j]=matx1[i][j]+matx2[i][j];
			}
		}
		System.out.println("adding matrix3:----");
		
		for (int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {	 
				System.out.print(matx3[i][j]+" ");
	}System.out.println();
}
}}