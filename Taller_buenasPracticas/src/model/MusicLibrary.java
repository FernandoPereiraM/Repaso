package model;

import java.util.ArrayList;
import java.util.Collections;

public class MusicLibrary {
	
	ArrayList<Song> songLibrary;

	public MusicLibrary() 
	{
		songLibrary =  new ArrayList<Song>();
	}

	public Song findSong(String nameFind) {
		Song songTemp = null;
		for (Song i : songLibrary)
            if(i.getSongName().equals(nameFind)) {
            	System.out.println(i.toString());
		        songTemp = i;
            }    	
		return songTemp;
	}
	
	public ArrayList<Song> sortByGenre(String genre){
		ArrayList<Song> sortedLibrary = new ArrayList<Song>();
		for (Song i : songLibrary)
            if(i.getSongGenre().equals(genre)) {
            	System.out.println(i.toString());
            	sortedLibrary.add(i);
            }    	
		return sortedLibrary;
	}
	
	public ArrayList<Song> sortByYear(int year){
		ArrayList<Song> sortedLibrary = new ArrayList<Song>();
		for (Song i : songLibrary)
            if(i.getSongDate() == year) {
            	System.out.println(i.toString());
            	sortedLibrary.add(i);
            }    	
		return sortedLibrary;
	}
	
	public void orderByDuration(){
		Collections.sort(songLibrary, (o1, o2) -> Integer.compare(o1.getSongDuration(), o2.getSongDuration()));
	}
	
	public void orderByYear(){
		Collections.sort(songLibrary, (o1, o2) -> Integer.compare(o1.getSongDate(), o2.getSongDate()));
	}
	
	public void addSong(Song newSong) {
		songLibrary.add(newSong);
	}
	
	public void printLibrary() {
		for (Song i : songLibrary) {
			System.out.println(i.toString());
		}           	
	}
	
	public void songDataTest(){
		songLibrary.add(new Song("Farewell", "White lies", 2009, "indie", "imgWh.jpg", "3 minutes long", 180, 1));
		songLibrary.add(new Song("Lose", "White lies", 2009, "indie", "imgWh.jpg", "2 minutes long", 120,2));
		songLibrary.add(new Song("Religion", "R.E.M", 2011, "rock", "imgdWh.jpg", "5 minutes long", 600,3));
		songLibrary.add(new Song("Matters", "Metallica", 2004, "metal", "imgWh.jpg", "3 minutes long", 180,4));
		songLibrary.add(new Song("You", "Dido", 2005, "pop", "imgWh.jpg", "2 minutes long", 120,5));
	}
	
}
