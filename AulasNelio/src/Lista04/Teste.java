package Lista04;

import java.util.Collection;
import java.util.List;

public class Teste {
	public static void main(String[] args) {
		var fruits = List.of(List.of("orange", "strawberry", "lemon"), List.of("blueberry", "raspberry", "strawberry"));
		var flatStream = fruits.stream().flatMap(Collection::stream);
		long distinctFruits = flatStream.distinct().count();
		System.out.println(distinctFruits);
	}

}
