package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist {

	ArrayList<Song> songPlaylist;

	public Playlist() {
		songPlaylist = new ArrayList<Song>();
	}

	public void printPlaylist() {
		for (Song i : songPlaylist) {
			System.out.println(i.toString());
		}           	
	}
	
	public void addSong(Song newSong) {
		songPlaylist.add(newSong);
	}

}
