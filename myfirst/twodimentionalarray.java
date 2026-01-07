package myfirst;

public class twodimentionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int array[][]=new int[2][3];
        array[0][0]=56;
        array[0][1]=77;
        array[0][2]=888;
        array[1][0]=23;
        array[1][1]=32;
        array[1][2]=43;
        
        for(int i=0; i<array.length; i++) {
        	for(int j=0; j<3; j++)
        	{
        		System.out.print("\t"+array[i][j]);
        	}
        	System.out.println();
        }
	}
 
}
