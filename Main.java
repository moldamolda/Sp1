import java.util.Scanner;
import java.util.ArrayList;
class Main {
	
public static void main(String[] args){

ArrayList<String> options = new ArrayList<>();

options.add("1. Joyful");
options.add("2. Energetic");
options.add("3. Sad");
options.add("4. Angry");


MoodMenu mM = new MoodMenu(options);
	mM.displayMenu();

Scanner scanner = new Scanner(System.in);

System.out.println("Please type your first name to start"); 

}

}