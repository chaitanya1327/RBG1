
public class Demo {

	public static void main(String[] args) {
		int arr[] = {23,346,56,356,86,456,846,987};
		int smallest=arr[0];
     for(int i=0;i<arr.length;i++) {
    	 if(smallest<arr[i])smallest=arr[i];
     }
     System.out.println(smallest);
	}

}
