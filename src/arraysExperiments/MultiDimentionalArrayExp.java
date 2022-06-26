package arraysExperiments;

public class MultiDimentionalArrayExp {

	public static void main(String[] args) {
		
		int[][] a = {{6,4,5},{1,2,3}};
		
//		System.out.println(a.length);
//		System.out.println(a[0].length);
		
		//****************using for loop ************
//		for(int i=0; i<a.length-1; i++)
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + " ");
				
			}
			System.out.println();
			
		}
		System.out.println("**********************");

		for(int r[]:a) {
			for(int value:r) {
				System.out.print(value+" ");
			}
			System.out.println();
		}
}

}
