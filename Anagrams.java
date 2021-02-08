// 13707293
// robertjohnhill1@gmail.com

import java.io.*;
import java.util.*;

public class Anagrams {

	public static char anagrams( String a, String b )
	{


		String lowerA = a.toLowerCase(Locale.ROOT);

		//removes non alphanumeric characters from string
		lowerA.replace("/[^A-Za-z0-9]/", "");

		//splits string into an array and sorts it in alphabetical order
		String[] arrA = lowerA.split("");
		Arrays.sort(arrA);
		String newA = Arrays.toString(arrA);


		String lowerB = b.toLowerCase(Locale.ROOT);

		lowerB.replace("/[^A-Za-z0-9]/", "");

		String[] arrB = lowerB.split("");
		Arrays.sort(arrB);
		String newB = Arrays.toString(arrB);


		if ( Objects.equals(newA, newB)){
			return '!';
		}
		else {


			List<String> listA = new ArrayList<String>();
			for (String k : arrA){
				listA.add(k);
			}

			List<String> listB = new ArrayList<String>();
			for (String k : arrB){
				listB.add(k);
			}


			for( String j : arrB){
				for (int i = 0 ; i <= listA.size() -1; i++){
					if (Objects.equals(listA.get(i), j)) {
						listA.remove(i);

					}

				}
			}

			for (int i = 0 ; i <= listB.size() - 1; i++){
				for( String j : arrA){
					if (Objects.equals(listB.get(i), j)) {
						listB.remove(i);

					}
				}
			}
			ArrayList<String> lastArr = new ArrayList<String>();
			lastArr.addAll(listA);
			lastArr.addAll(listB);

			Collections.sort(lastArr);
			String ret_string = lastArr.toString();
			Character ret_char = ret_string.charAt(ret_string.length()-2);


			return ret_char;
		}


	}


	public static void main( String[] args )
	{

	}
}
