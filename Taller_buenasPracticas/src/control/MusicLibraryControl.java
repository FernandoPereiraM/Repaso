package control;

import java.util.Scanner;

import model.MusicLibrary;
public class MusicLibraryControl {

	public void manageLibrary() {
		MusicLibrary m = new MusicLibrary();
		m.songDataTest();
		int op = 0;
		int year = 0;
		int duration = 0;
		String songGender = "";

		do {
			Scanner myObj = new Scanner(System.in);
			System.out.println("Music Library Sort or Order =) " + "\n" + "1. sort by gender" + "\n" + "2. sort by year"
					+ "\n" + "3. order by duration" + "\n" + "4. order by release date" + "\n" + "5. exit" + "\n");
			op = myObj.nextInt();
			switch (op) {
			case 1:
				System.out.println("sort the library by Music gender......");
				System.out.print("Name of the music gender = ");
				songGender = myObj.next();
				m.sortByGenre(songGender);
				System.out.println("");
				break;
			case 2:
				System.out.println("sort the library by Music release date......");
				System.out.print("Release date = ");
				year = myObj.nextInt();
				m.sortByYear(year);
				System.out.println("");
				break;
			case 3:
				System.out.println("Order the library by Music Duration......");
				m.orderByDuration();
				m.printLibrary();
				System.out.println("");
				break;
			case 4:
				System.out.println("Order the library by by release date......");
				m.orderByYear();
				m.printLibrary();
				System.out.println("");
				break;
			case 5:
				System.out.println("Bye" + "\n");
				break;
			default:
				System.out.println("Type a valid option!");
				break;
			}
		} while (op != 5);
	}
}
