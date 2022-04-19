package model;

public class Song {
	
	String songName;
	String albumName;
	int songDate;
	String songGenre;
	String imageSongUrl;
	String songDescription;
	int songDuration;
	int songId;

	public Song() {
	}


	public Song(
			String songName, 
			String albumName, 
			int songDate, 
			String songGenre, 
			String imageSongUrl,
			String songDescription, 
			int songDuration, 
			int songId) 
	{
		super();
		this.songName = songName;
		this.albumName = albumName;
		this.songDate = songDate;
		this.songGenre = songGenre;
		this.imageSongUrl = imageSongUrl;
		this.songDescription = songDescription;
		this.songDuration = songDuration;
		this.songId = songId;
	}
	
	
	public String getSongName() {
		return songName;
	}


	public void setSongName(String songName) {
		this.songName = songName;
	}


	public String getAlbumName() {
		return albumName;
	}


	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}


	public int getSongDate() {
		return songDate;
	}


	public void setSongDate(int songDate) {
		this.songDate = songDate;
	}


	public String getSongGenre() {
		return songGenre;
	}


	public void setSongGenre(String songGenre) {
		this.songGenre = songGenre;
	}


	public String getImageSongUrl() {
		return imageSongUrl;
	}


	public void setImageSongUrl(String imageSongUrl) {
		this.imageSongUrl = imageSongUrl;
	}


	public String getSongDescription() {
		return songDescription;
	}


	public void setSongDescription(String songDescription) {
		this.songDescription = songDescription;
	}


	public int getSongDuration() {
		return songDuration;
	}


	public void setSongDuration(int songDuration) {
		this.songDuration = songDuration;
	}


	public int getSongId() {
		return songId;
	}


	public void setSongId(int songId) {
		this.songId = songId;
	}


	@Override
	public String toString() {
		return "[songName=" + songName + ", albumName=" + albumName + ", songDate=" + songDate + ", songGenre="
				+ songGenre + ", imageSongUrl=" + imageSongUrl + ", songDescription=" + songDescription
				+ ", songDuration=" + songDuration + ", songId=" + songId + "]";
	}
	
	
	
}
