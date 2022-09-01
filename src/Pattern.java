
public class Pattern {
 public static void main(String []ar) {
	 
	 
	/* for(int i=0;i<=8;i++) {
		 for(int j=0;j<=6;j++) {
			 if (i==2 || j==3) { 
				 System.out.print("+ ");
			 }
			 else {
				 System.out.print("  ");
		 
			 }
		 }
			 
		 System.out.println(" ");
	 }*/
	 
	 
	 
	 
	/* for(int i=0;i<=4;i++) {
		 for(int j=0;j<=4;j++) {
			 if (i==j || i+j==4) {
				 System.out.print("*");
			 }
			 else {
				 System.out.print(" ");
			 }
		 }System.out.println();
	 }*/
	 
	 
	 
	/* for (int i=0;i<=8;i++) {
		 for(int j=0;j<=8;j++) {
			 if (i==j || i+j==8||i==0||j==0||i==8||j==8) {
				 System.out.print("* ");
			 }
			 else {
				 System.out.print("  ");
			 }
		 }System.out.println();
	 }*/
	 
	 
	 
	 
	 for (int i=0;i<=5;i++) {
		 for (int j=0;j<=(5-i-1);j++) {
			 System.out.print(" ");
		 }
		 for (int j=0;j<(i*2+1);j++) {
			 System.out.print("*");
		 }System.out.println();
	 }
	 
	 
	 for (int i=0;i<=5;i++) {
		 for (int j=0;j<=(5-i-1);j++) {
			 System.out.print(" ");
		 }
		 for (int j=0;j<(i*2+1);j++) {
			 System.out.print("*");
		 }System.out.println();
	 }
	 
	 for (int i=0;i<=5;i++) {
		 for (int j=0;j<=(5-i-1);j++) {
			 System.out.print(" ");
		 }
		 for (int j=0;j<(i*2+1);j++) {
			 System.out.print("*");
		 }System.out.println();
	 }
	 
	 for(int i=0;i<4;i++) {
		 for(int j=0;j<4;j++) {
            System.out.print(" ");
		 }
		 for(int j=0;j<3;j++) {
			 System.out.print("*");
		 }System.out.println();
	 }
	 
	 
 }
}
