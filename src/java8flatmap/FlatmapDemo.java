package java8flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatmapDemo {

	public static void main(String[] args) {
		 
        List<String> houseGryffindor = Arrays.asList("Albus", "Harry", "Ron", "Hermione");
        List<String> houseHufflepuff = Arrays.asList("Bridget", "Cedric", "Nymphadora");
        List<String> houseRavenclaw = Arrays.asList("Luna", "Garrick", "Filius");
        List<String> houseSlytherin = Arrays.asList("Severus", "Tom", "Phineas");
 
        List<List<String>> hogwarts = new ArrayList<List<String>>(); 
        hogwarts.add(houseGryffindor);
        hogwarts.add(houseHufflepuff);
        hogwarts.add(houseRavenclaw);
        hogwarts.add(houseSlytherin);
 
        // Printing All Hogwarts Houses In Pre-Java8 World
        List<String> listOfAllHouses = new ArrayList<String>();
        for(List<String> house : hogwarts) {
            for(String hName : house) {
                listOfAllHouses.add(hName);
            }
        }
 
        System.out.println("<!---------------Hogwarts Houses---------------!>");
        System.out.println(listOfAllHouses);
 
        System.out.println();
 
        // Now let's Achieve This By Using 'flatMap()' Method In Java8 
        /*List<String> flatMapList = hogwarts.stream().flatMap(hList -> hList.stream()).collect(Collectors.toList()); 
        System.out.println("<!---------------Hogwarts Houses Using Java8---------------!>"); 
        System.out.println(flatMapList);*/
        
        List<String> collect = hogwarts.stream().flatMap(hlist -> hlist.stream()).collect(Collectors.toList());
        //hogwarts.stream() -->This produces a Stream of List<String>
    }

}
