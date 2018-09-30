
public class ClimbingStairs {
	// when the number of steps they can cover is not mentioned ways(n, m) =
	// ways(n-1, m) + ways(n-2, m) + ... ways(n-m, m)
	public static int ways(int steps, int n) {
		return waysUtil(steps + 1, n);
	}

	public static int waysUtil(int m, int n) {
		if (m <= 1)
			return m;
		int result = 0;
		for (int i = 1; i <= m && i <= n; i++) {
			result += waysUtil(m - i, n);
		}
		return result;
	}

	// when they can cover 1 or 2 steps at a time (to reach top, either from n-1 or
	// n-2 step)
	public static int calculateWays(int n) {
		if (n <= 1)
			return n;
		else
			return calculateWays(n - 1) + calculateWays(n - 2);
	}

	public static int countWays(int totalsteps) {

		return calculateWays(totalsteps + 1);

	}

	public static void main(String args[]) {
		int s = 4;
		System.out.println("Number of ways = " + countWays(s));
		System.out.println("Number of ways=" + ways(4, 2));
	}

}