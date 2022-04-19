package view;

import java.util.Scanner;

import control.MusicLibraryControl;
import control.PlaylistControl;

public class play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlaylistControl p = new PlaylistControl();
		MusicLibraryControl m = new MusicLibraryControl();
		int op = 0;
		
		do {
			Scanner myObj = new Scanner(System.in);
			System.out.println("Music for You =) " + "\n" 
			                       + "1. Playlist!" + "\n"
					               + "2. Music Library" + "\n"
					               + "3. Exit" + "\n");
			op = myObj.nextInt();
			switch (op) {
			case 1:
				p.createPlaylist();
				break;
			case 2:
				m.manageLibrary();
				break;
			case 3:
				System.out.println("Bye" + "\n");
				break;
			default:
				System.out.println("Type a valid option!");
				break;
			}
		} while (op != 3);

	}

}
