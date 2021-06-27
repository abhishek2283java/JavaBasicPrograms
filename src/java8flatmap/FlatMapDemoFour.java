package java8flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMapDemoFour {

	public static void main(String[] args) {
		int[] arr1 = new int[] {1, 2};
		int[] arr2 = new int[] {3, 4};
		int[] arr3 = new int[] {5, 6};
		int[] arr4 = new int[] {7, 8};
		
		List<int[]> list = new ArrayList<int[]>();
		list.add(arr1);
		list.add(arr2);
		list.add(arr3);
		list.add(arr4);
		
		int sum = list.stream().flatMapToInt(row -> Arrays.stream(row)).sum();
		
		Stream<int[]> stream = list.stream();
		//stream.flatMap(Arrays::stream);
		
//		https://www.techiedelight.com/difference-stream-of-arrays-stream-java/
		//https://ramj2ee.blogspot.com/2017/09/how-to-filter-list-of-person-based-on.html
		
		
		
		//int[] array = { 1, 2, 3, 4, 5 };
		//Stream<int[]> of = Stream.of(array);
		// Creating a list of Strings
        List<String> list2 = Arrays.asList("1", "2", "3", "4", "5");
  
        // Using Stream flatMapToInt(Function mapper)
//        list2.stream().flatMapToInt(num -> IntStream.of(Integer.parseInt(num))).
//        forEach(System.out::println);
	}
}
