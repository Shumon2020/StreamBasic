import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GFG {

	// Driver code
	public static void main(String[] args) {

		// Creating a Stream of Strings
		//Stream<String> stream = Stream.of("Geeks", "fOr", "GEEKSQUIZ", "GeeksforGeeks");

		// Using Stream filter(Predicate predicate)
		// to get a stream consisting of the
		// elements having UpperCase Character
		// at index 1
	//	stream.filter(str -> Character.isUpperCase(str.charAt(1))).forEach(System.out::println);
		
		//stream.filter(str-> Character.isL)
		 //stream.filter(str -> str.endsWith("s")) 
        // .forEach(System.out::println);
	//Interview question: List of strings, remove strings ( after meeting certain conditions), and find the strings with stream methods by using filter
		//(interviewer not going to mention Filter), and the String is less than < 5.
		
		List<String> words = Arrays.asList ("yellow", "green","teal",
                "red", "yellow", "red", "blue", "pink", "gold", "blue", "wh");
		
		//Interview question: List of strings, remove strings ( after meeting certain conditions), and find the strings with stream methods by using filter
				//(interviewer not going to mention Filter), and the String is less than < 5.
		
		// List<String> result = words.stream().filter(word -> word.length() < 5)
	               // .collect(Collectors.toList());
	       // result.forEach(word -> System.out.println(word));
		
	
//remove all 4 letters words
		//use: != mean remove
       // ans:  List<String> result = words.stream().filter(word -> word.length() !=4)
               // .collect(Collectors.toList());
		 // result.forEach(word -> System.out.println(word));
		
		
		// print out all words that contains 4 letters
		// use : = =
       // List<String> result = words.stream().filter(word -> word.length() ==4)
             //   .collect(Collectors.toList());
      //  result.forEach(word -> System.out.println(word));
        
        // print out anything match 4 and below
		// or higher use <= and >=
		
	//	List<String> words = Arrays.asList ("yellow", "green","teal",
              //  "red", "yellow", "red", "blue", "pink", "gold", "blue");
		
      //  List<String> result = words.stream().filter(word -> word.length() <= 4)
          //      .collect(Collectors.toList());
        //result.forEach(word -> System.out.println(word));
        
		//or
       
	//	List<String> result = words.stream().filter(word -> word.length() >= 4)
      //          .collect(Collectors.toList());
        //result.forEach(word -> System.out.println(word));
        
       // ques: print anything contains 3 and 4 letter
		
		//List<String> words = Arrays.asList ("yellow", "green","teal",
                //"red", "yellow", "red", "blue", "pink", "gold", "blue", "wh");
        
        List<String> result = words.stream().filter(word -> word.length() >= 3 &word.length() <=4)
                .collect(Collectors.toList());
        result.forEach(word -> System.out.println(word));
        
        
        
        
	}
}
