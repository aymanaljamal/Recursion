package application;

public class somMethodk {
	public class Hanoi {
	    public static void towersOfHanoi(int n, char source, char target, char auxiliary) {
	        if (n == 1) {
	            System.out.println("نقل القرص 1 من " + source + " إلى " + target);
	            return;
	        }
	        towersOfHanoi(n - 1, source, auxiliary, target);
	        System.out.println("نقل القرص " + n + " من " + source + " إلى " + target);
	        towersOfHanoi(n - 1, auxiliary, target, source);
	    }

	    public static void main(String[] args) {
	        int n = 3; // عدد الأقراص
	        towersOfHanoi(n, 'A', 'C', 'B'); // A, B و C هي أسماء الأعمدة
	    }
	}

}
