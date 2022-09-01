import java.util.Scanner;

public class MatrixMul {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Matrix1 rows:--");
		int row=s.nextInt();
		System.out.println("Enter the Matrix1 cols Matrix rows:--");
		int r_c=s.nextInt();
		System.out.println("Enter the Matrix2 rows:--");
		int col=s.nextInt();
		
		int[][] mtx1=new int[row][r_c];
		System.out.println("Enter first Matrix1:");
		for (int i=0;i<row;i++) {
			for (int j=0;j<r_c;j++) {
				System.out.printf("Enter the matrix1 element[%d][%d]:-",i,j);
				mtx1[i][j]=s.nextInt();
			}
		}
		int[][] mtx2=new int[r_c][col];
		System.out.println("Enter 2nd Matrix2:");
		for (int i=0;i<r_c;i++) {
			for (int j=0;j<col;j++) {
			System.out.printf("Enter the matrix2 element[%d][%d]:-",i,j);
			mtx2[i][j]=s.nextInt();
			}
		}
		System.out.println("MATRIX1-------------------");
		for (int i=0;i<row;i++) {
			for (int j=0;j<col;j++) {
				System.out.print(mtx1[i][j]+" ");
				
			}System.out.println();
	}

		System.out.println("MATRIX2-------------------");
		for (int i=0;i<r_c;i++) {
			for (int j=0;j<col;j++) {
				System.out.print(mtx2[i][j]+" ");
				
			}System.out.println();
	}
		System.out.println("multipling----------");
		int[][] mtx3=new int[row][col];
		for (int i=0;i<row;i++) {
			for (int j=0;j<r_c;j++) {
				for(int k=0;k<col;k++) {
					mtx3[i][j]=mtx1[i][j]*mtx2[j][k];
			}
		}
		}
			System.out.println("MATRIX3-------------------");
			for (int i1=0;i1<row;i1++) {
				for (int j=0;j<col;j++) {
					System.out.print(mtx3[i1][j]+" ");
					
				}System.out.println();
		}	
		
		
		
		
		
		
}}