package myfirst;

public class arrayexample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int array[][]= {{2,3,4},{7,9,56},{10,11,12}};
		int sum=0;
		
		for (int i=0;i<array.length; i++) {
			for(int j=0; j<array[i].length; j++)
			{
			 System.out.print("\t"+array[i][j]);
			 sum+=array[i][j];
			}
			System.out.println();
		}
		System.out.println(sum); 
	}

}
