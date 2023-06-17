package com.devyani;
//Content: Name of album
//Artist-which artist has created this album
//array list of song-an array with more functionality,dynamic array(add or remove element)



import java.util.ArrayList;
import java.util.LinkedList;

//CONSTRUCTOR
public class Album {
	  private String name;
	    private String artist;
	    private ArrayList<Song> songs;



	    public Album(String name, String artist) {
	        this.name = name;
	        this.artist = artist;
	        this.songs = new ArrayList<Song>();
	    
        }
//Empty Constructor	    
	     public Album() {
	    	
	    }
//Find song method-It will return the song which we have entered as a title and return null if there is no such song
//Iterate through for loop to check if the song exist or not(enhanced for loop)
	     
	     public Song findSong(String title){

	         for(Song checkedSong : songs){
	             if(checkedSong.getTitle().equals(title)) return checkedSong;
	         }
	         return null;
	   }
	     
//define some functions/methods for functionality
//Add song	- It will first check if the song already exist in our list,or if it doesn't exist then add this song to our album
	     
	     
	     public boolean addSong(String title, double duration){
	         if(findSong(title) == null){
	           songs.add(new Song(title,duration));
	           System.out.println(title + "successfully added to the list");
               return true;
            }
             else {
    	           System.out.println("Song with name "+ title + " already exist in the list");
                   return false;
             }
       }
//Add to playList method-adds the song which is already present in album to the playList so that we can create playlist
//First= Check for track number(valid or not)
//Second = LinkedList of playList= In what playList we are going to add the song
// Third = Index number (To check past tracked number is valid or not)

       public boolean addToPlayList(int trackNumber, LinkedList<Song> PlayList){
             int index = trackNumber - 1;
             if(index > 0 && index <= this.songs.size()){
                PlayList.add(this.songs.get(index)); //It will add the song which is present to our created playList
                 return true;
             }
              System.out.println("this album does not have song with trackNumber "+trackNumber);
               return false;
         }

//Method to create add to playList

         public boolean addToPlayList(String title, LinkedList<Song> PlayList){
        	 for(Song checkedSong : this.songs){
        		 if (checkedSong.getTitle().equals(title)){
        			 PlayList.add(checkedSong);
        			 return true;
        		 }	     
        	 }
        	 System.out.println(title + "there is no such song in album");
             return false;
         }
}
        	 
