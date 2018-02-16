package data_array;
import java.util.*;

public class dateArr {
	public static void main(String[] args) {
		String EntryData = "May 16, 1984 November 14, 1978 September 21, 1980 July 3, 1987 "; 
		String[] EntryDataArray = EntryData.split(" ");
		ArrayList<MyDate> dateArray = new ArrayList<MyDate>();
		for(int i = 0; i < 12; i = i + 3){
			//String bufferString = EntryDataArray[i] + EntryDataArray[i+1] + EntryDataArray[i+2];
			EntryDataArray[i+1] = EntryDataArray[i+1].substring(0, EntryDataArray[i+1].length()-1);
			MyDate newDate = new MyDate(EntryDataArray[i], Integer.parseInt(EntryDataArray[i+1]), Integer.parseInt(EntryDataArray[i+2]));
			dateArray.add(newDate);
		}
	
		//String a,b,c;
		/*Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 4; i++){
		System.out.println("Month?");
		a = scan.next();
		System.out.println("Day?");
		b = scan.next();
		System.out.println("Year?");
		c = scan.next();*/
		
		for(int i = dateArray.size()-1; i > -1; i--){
			System.out.println(dateArray.get(i));
		}
	}
}
