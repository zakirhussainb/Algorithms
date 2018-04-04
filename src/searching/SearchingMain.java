package searching;
import java.util.*;
public class SearchingMain 
{

	public static void main(String[] args) 
	{

//		int[] arrNum = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		int[] arrNum = {10, 12, 5, 16, 18, 19, 20, 26, 22, 23, 9, 33, 30, 42, 47, 3};//16
		int ser = 5;
		int indexOp = 0;
		
		String[] arrStr = { "fred" , "barney", "tom", "jerry", "larry", "moe", "curly",
				"betty" , "wilma", "bart", "homer", "marge", "maggie", "lisa",
				"pebbles" , "bambam", "smithers", "burns", "milhouse", "george", "astro",
				"dino" , "mickey", "minnie", "pluto", "goofy", "donald", "huey",
				"louie" , "dewey", "snowwhite", "happy", "doc", "grumpy", "sneezy",
				"dopey" , "sleepy", "bambi", "belle", "gaston", "tarzan", "jane",
				"simba" , "scar", "mufasa", "ariel", "flounder", "bugs", "daffy",
				"elmer" , "foghorn", "chickenhawk", "roger", "jessica", "hank", "bobby",
				"peggy" , "spot", "pongo", "perdy", "buzz", "potatohead", "woody",
				"chuckie" , "tommy", "phil", "lil", "angelica", "dill", "spike",
				"pepe" , "speedy", "yosemite", "sam", "tweety", "sylvester", "granny",
				"spiderman" , "batman", "superman", "supergirl", "robin", "jimmy", "olsen",
				"thing" , "flash", "silversurfer", "xmen", "pokemon", "joker", "wonderwoman"
				};
		String searchName = "superman";
		
		// LINEAR SEARCH:-
		
		indexOp = LinearSearch.linearSearchForNumber(arrNum,ser);
		System.out.println("The number you are searching is at index...." + indexOp);
		indexOp = LinearSearch.linearSearchForString(arrStr,searchName);
		System.out.println("The string you are searching is at index...." + indexOp);
		
		
		// BINARY SEARCH:-
		
		indexOp = BinarySearch.binarySearchForNumber(arrNum,ser);
		System.out.println("The number '" +ser+ "' you are searching is at index...." + indexOp);
		indexOp = BinarySearch.binarySearchForString(arrStr,searchName);
		System.out.println("The word '" +searchName+ "' you are searching is at index...." + indexOp);
		
		
		// JUMP SEARCH:-

		indexOp = JumpSearch.jumpSearchForNumber(arrNum,ser);
		System.out.println("The number '" +ser+ "' you are searching is at index...." + indexOp);
		indexOp = JumpSearch.jumpSearchForString(arrStr,searchName);
		System.out.println("The word '" +searchName+ "' you are searching is at index...." + indexOp);
		
		
		// INTERPOLATION SEARCH:-
		
		indexOp = InterpolationSearch.interpolationSearchForNumber(arrNum,ser);
		System.out.println("The number '" +ser+ "' you are searching is at index...." + indexOp);
		indexOp = InterpolationSearch.interpolationSearchForString(arrStr,searchName);
		System.out.println("The word '" +searchName+ "' you are searching is at index...." + indexOp);
		

// 		EXPONENTIAL SEARCH:-
		
		indexOp = ExponentialSearch.expoSearchForNumber(arrNum,ser);
		System.out.println("The number '" +ser+ "' you are searching is at index...." + indexOp);
		indexOp = ExponentialSearch.expoSearchForString(arrStr,searchName);
		System.out.println("The word '" +searchName+ "' you are searching is at index...." + indexOp);
		
		
//		Arrays.sort(arrStr);
//		System.out.println(Arrays.binarySearch(arrStr,searchName));

	}

}
