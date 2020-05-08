import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;
import java.text.*;

interface Operation {
	int check(int n);
}

class Op {
	public static int tester(Operation p, int n) {
		return p.check(n);
	}

	Operation Even() {
		Operation p = (a)-> {return a & 1;};
		return p;
	}

	Operation Prime() {
		Operation p = (a)-> {
			if (a == 1)
				return 0;
			boolean ok = true;

			for (int i = 2; i <= a / 2; i++) {
				if (a % i == 0) {
					ok = false;
					break;
				}
			}
			return (ok ? 1 : 0);
		};

		return p;
	}

	Operation Pdrome() {
		Operation p = (a)-> {
			String num = "" + a;
			boolean ok = true;
			int n = num.length();

			for (int i = 0; i < n / 2; i++) {
				if (num.charAt(i) != num.charAt(n - i - 1)) {
					ok = false;
					break;
				}
			}
			return (ok ? 1 : 0);
		};

		return p;
	}
}

public class Program8 {
	public static void main(String args[]) throws IOException {
		Op obj = new Op();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the number of testcases: ");
		int tc = Integer.parseInt(br.readLine());

		Operation p;

		int retval = 0;
		String ans = null;

		System.out.println("1. Even/Odd Parity \t 2. Prime or not \t 3. Palindrome or not");

		while (tc-- > 0) {
			System.out.println("Input the choice and the operand separated by spaces: ");

			String inp = br.readLine().trim();

			StringTokenizer str = new StringTokenizer(inp);

			int choice = Integer.parseInt(str.nextToken());
			int number = Integer.parseInt(str.nextToken());

			switch (choice) {
				case 1:
					p = obj.Even();
					retval = obj.tester(p, number);
					ans = (retval == 1 ? "Number is Odd..." : "Number is Even...");
					break;
				case 2:
					p = obj.Prime();
					retval = obj.tester(p, number);
					ans = (retval == 1 ? "Number is prime..." : "Number is not prime!!!");
					break;
				case 3:
					p = obj.Pdrome();
					retval = obj.tester(p, number);
					ans = (retval == 1 ? "Number is a palindrome..." : "Number is not a palindrome!!!");
			}

			System.out.println(ans);
		}
	}
}