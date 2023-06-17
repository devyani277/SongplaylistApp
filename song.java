package com.devyani;

//It will give song name and its duration
public class Song {
	private String title;
private double duration;

//Empty Constructors
public Song(String title, double duration) {
    this.title = title;
    this.duration = duration;
}
public Song(){

}

//Getter    

public String getTitle() {
    return title;
}

public double getDuration() {
    return duration;
}
//To string method-It will return whatever the property of class is.
//It will return whatever we have in this class;title and duration
@Override
public String toString() {
    return "Song{" +
            "title='" + title + '\'' +
            ", duration=" + duration +
            '}';
}
}


