package application;

public class SomMethod {
	public static void reversDisplay(int n) {
		if (n < 10) {
			System.out.println(n);
		} else {
			System.out.print(n % 10 + " ");
			reversDisplay(n / 10);
		}
	}

	public static long sumDigits(long n) {
		if (n == 0) {
			return 0;
		} else {
			return n % 10 + sumDigits(n / 10);
		}
	}

	public static double ser(int i) {
		if (i == 0) {
			return 0;
		} else {
			return ser(i - 1) + 1.0 / i;
		}
	}

	public static int gcd(int m, int n) {
		if (n == 0) {
			return m;
		} else {
			return gcd(n, m % n);
		}
	}

	public static boolean isPalindrome(String s) {
		if (s.length() <= 1)
			return true;
		else if (s.charAt(0) != s.charAt(s.length() - 1))
			return false;
		else
			return isPalindrome(s.substring(1, s.length() - 1));
	}

	public static boolean isPalindrome1(String s, int low, int max) {
		if (low >= max)
			return true;
		else if (s.charAt(low) != s.charAt(max))
			return false;
		else
			return isPalindrome1(s, low + 1, max - 1);
	}

	public static void nPrintln(String message, int times) {
		if (times >= 1) {
			System.out.println(message);
			nPrintln(message, times - 1);
		}
	}

	public static String reverseString(String s) {
		if (s.isEmpty()) {
			return s;
		} else {
			return reverseString(s.substring(1)) + s.charAt(0);
		}
	}

	public static int findMax(int[] arr, int index) {
		if (index == arr.length - 1) {
			return arr[index];
		} else {
			return Math.max(arr[index], findMax(arr, index + 1));
		}
	}

	public static int sumArray(int[] arr, int index) {
		if (index == arr.length) {
			return 0;
		} else {
			return arr[index] + sumArray(arr, index + 1);
		}
	}

	public static String decimalToBinary(int n) {
		if (n == 0) {
			return "0";
		}
		return decimalToBinary(n / 2) + (n % 2);
	}

	public static int countDigits(int n) {
		if (n == 0) {
			return 0;
		} else {
			return 1 + countDigits(n / 10);
		}
	}

	public static int computePowerOfX(int x, int n) {
		if (n == 0) {
			return 1;
		} else {
			return x * computePowerOfX(x, n - 1);
		}
	}

	public static void xMethod(int n) {
		if (n > 0) {
			System.out.print(n + " ");
			xMethod(n - 1);
		}
		System.out.println();
	}

	public static void xMethod1(int n) {
		if (n > 0) {
			xMethod1(n - 1);
			System.out.print(n + " ");
		}
		System.out.println();
	}

	public static void xMethod2(double n) {
		if (n != 0) {
			System.out.print(n);
			xMethod2(n / 10);
		}
	}

	public static int fib(int index) {
		if (index <= 1) {
			return index;
		} else {
			return fib(index - 1) + fib(index - 2);
		}
	}

	public static int computeSum(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n + computeSum(n - 1);
		}
	}

	public static int xm(int n) {
		if (n == 0) {
			return 0;
		} else {
			return xm(n - 1) + 2;
		}
	}

	public static int theVowelsletter(String s) {

		return theVowelsletter(s, 0, 0);
	}

	private static int theVowelsletter(String s, int count, int low) {
		if (low >= s.length()) {

			return count;
		} else if (s.charAt(low) == 'o' || s.charAt(low) == 'e' || s.charAt(low) == 'i' || s.charAt(low) == 'u'
				|| s.charAt(low) == 'a') {

			return theVowelsletter(s, ++count, ++low);
		}
		return count;

	}

	public static void main(String[] args) {
		System.out.println("Reverse Display:");
		SomMethod.reversDisplay(12345);
		System.out.println("the Vowels letter:");
		int m1 = SomMethod.theVowelsletter("ioeuagrdsffdg");
		System.out.println("" + m1);
		System.out.println("\nSum of Digits:");
		long number = 12345;
		System.out.println("Sum of digits in " + number + " is: " + SomMethod.sumDigits(number));

		System.out.println("\nSum of Series:");
		int seriesNumber = 5;
		System.out.println("Sum of series till " + seriesNumber + " is: " + SomMethod.ser(seriesNumber));

		System.out.println("\nGCD:");
		int m = 30, n = 20;
		System.out.println("GCD of " + m + " and " + n + " is: " + SomMethod.gcd(m, n));

		System.out.println("\nIs Palindrome:");
		String s = "radar";
		System.out.println("Is \"" + s + "\" a palindrome? " + SomMethod.isPalindrome(s));

		System.out.println("\nFind Max Element:");
		int[] arr = { 3, 7, 2, 8, 5 };
		System.out.println("Maximum element in the array is: " + SomMethod.findMax(arr, 0));

		System.out.println("\nSum of Array Elements:");
		System.out.println("Sum of array elements is: " + SomMethod.sumArray(arr, 0));

		System.out.println("\nDecimal to Binary:");
		int decimalNumber = 10;
		System.out.println(
				"Binary representation of " + decimalNumber + " is: " + SomMethod.decimalToBinary(decimalNumber));

		System.out.println("\nCount Digits:");
		int countNumber = 123456789;
		System.out.println("Number of digits in " + countNumber + " is: " + SomMethod.countDigits(countNumber));

		System.out.println("\nCompute Power of X:");
		int x = 2, pow = 5;
		System.out.println(x + " raised to the power of " + pow + " is: " + SomMethod.computePowerOfX(x, pow));

		System.out.println("\nFibonacci Series:");
		int fibIndex = 6;
		System.out.println("Fibonacci number at index " + fibIndex + " is: " + SomMethod.fib(fibIndex));

		System.out.println("\nCompute Sum:");
		int sumNumber = 5;
		System.out.println("Sum of numbers from 1 to " + sumNumber + " is: " + SomMethod.computeSum(sumNumber));
		System.out.println("" + xm(5));
	}
}
