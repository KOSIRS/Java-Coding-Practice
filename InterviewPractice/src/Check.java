
public class Check {

	public static void main(String[] args) {
		 int a=1;
	       int b=10;
	        numberPrinting(a, b);
	        // Recursive java
	}

	private static void numberPrinting(int a, int b) {
		 if (a <= b) {
	            System.out.print(a + " ");
	            numberPrinting(a + 1, b);  // ✅ recursive call with next 
	           }
	        }

}
