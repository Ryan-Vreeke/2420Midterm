package midterm1;

import java.util.Arrays;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

public class CityApp {
	public static void main(String[] agrs) {
		City[] cities = { new City("Chicago", 2715000, 5498), new City("Denver", 634000, 1292),
				new City("New York", 8337000, 8683), new City("San Francisco", 826000, 1365),
				new City("Seattle", 635000, 2470) };

		// Part 1
		StdOut.println("Cities: ");
		for (City c : cities) {
			StdOut.println(c);
		}

		Arrays.sort(cities);

		StdOut.println("\nCities sorted population density:");
		for (City c : cities) {
			StdOut.println(c);
		}
		// Part 2
		Stack<City> cityStack = new Stack<City>();
		Stack<Integer> l = new Stack<Integer>();
		l.push(1);
		l.push(2);

		for (int i = cities.length - 1; i >= 0; i--) {
			cityStack.push(cities[i]);
		}

		StdOut.println("\nPart 2\n-------");
		for (City c : cityStack) {
			StdOut.println(c);
		}

		Stack<City> temp = new Stack<City>();
		System.out.println("\n");
		for (City c : cityStack) {
			if (c.getPopulation() > 1000000) {

				temp.push(c);
			}
		}

		System.out.println("Large cities listed in reverse order:");
		for (City c : temp) {
			StdOut.println(c);
		}
	}
}
