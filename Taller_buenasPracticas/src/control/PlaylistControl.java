package control;

import java.util.Scanner;

import model.MusicLibrary;
import model.Playlist;
import model.Song;

public class PlaylistControl {
	
	public void createPlaylist() {
		MusicLibrary m = new MusicLibrary();
		Playlist s = new Playlist();
		m.songDataTest();
		int op = 0;
		String songFind = "";

		do {
			Scanner myObj = new Scanner(System.in);
			System.out.println("Playlist Builder =) " + "\n" 
			                       + "1. add a song!" + "\n" 
					               + "2. my playlist" + "\n"
					               + "3. Music Library" + "\n"
					               + "4. Exit" + "\n");
			op = myObj.nextInt();
			switch (op) {
			case 1:
				System.out.println("add a song to the playlist......");
				System.out.print("Name of the Song = ");
				songFind = myObj.next();
				Song tmp = m.findSong(songFind);
				tmp.toString();
				if (tmp != null) {
					s.addSong(tmp);
				}
				System.out.println("");
				break;
			case 2:
				System.out.println("My playlist....");
				s.printPlaylist();
				System.out.println("");
				break;
			case 3:
				System.out.println("Music Library");
				m.printLibrary();
				System.out.println("");
				break;
			case 4:
				System.out.println("Bye" + "\n");
				break;
			default:
				System.out.println("Type a valid option!");
				break;
			}
		} while (op != 4);

	}

}
