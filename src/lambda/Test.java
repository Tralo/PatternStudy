package lambda;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		test2();
	}

	public static void test4() {

	}

	public static void test3() {

	}

	public static void test2() {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x)
				.summaryStatistics();

		System.out.println("List中最大的数字 : " + stats.getMax());
		System.out.println("List中最小的数字 : " + stats.getMin());
		System.out.println("所有数字的总和   : " + stats.getSum());
		System.out.println("所有数字的平均值 : " + stats.getAverage());
	}

	public static void test1() {
		String[] atp = { "Rafael Nadal", "Novak Djokovic",
				"Stanislas Wawrinka", "David Ferrer", "Roger Federer",
				"Andy Murray", "Tomas Berdych", "Juan Martin Del Potro" };
		List<String> players = Arrays.asList(atp);

		// 以前的循环方式
		for (String player : players) {
			System.out.print(player + "; ");
		}
		players.forEach((player) -> System.out.println(player + ";"));

	}
}
