
public class TheorieProg1_2 {
	public static void TheoTest() {
		float f = .0f;
		System.out.println(f);
		
		int array1[] = {1,2,3};
		int array2[] = new int[]{1,2,3};
		int array3[] = new int[3];
	
		
		System.out.println(array1.equals(array2));
		System.out.println(array1== array2);

		
		array1 = array2;
		
		System.out.println(array1.equals(array2));
		System.out.println(array1 == array2);
	}
}
