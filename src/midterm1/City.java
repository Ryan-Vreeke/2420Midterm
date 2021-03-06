package midterm1;

public class City implements Comparable<City> {
	private final String name;
	private final int population;
	private final int area;
	private final double density;

	public City(String name, int population, int area) {
		this.name = name;
		this.population = population;
		this.area = area;
		this.density = (double) population / (double) area;
	}

	public String getName() {
		return name;
	}

	public int getPopulation() {
		return population;
	}

	public int getArea() {
		return area;
	}

	@Override
	public String toString() {
		return String.format("%-15s area: %.1f", name, density);
	}

	@Override
	public int compareTo(City o) {
		if (this.density > o.density) {
			return 1;
		} else
			return -1;
	}
}
