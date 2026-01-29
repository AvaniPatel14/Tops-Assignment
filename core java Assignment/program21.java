package myfirst;

//Copy one array into another

public class program21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    int[] source = {10, 20, 30, 40, 50};
        int[] dest = new int[source.length];

        System.arraycopy(source, 0, dest, 0, source.length);

        // Display copied array
        for (int i : dest) {
            System.out.print(i + " ");
        }

	}

}
