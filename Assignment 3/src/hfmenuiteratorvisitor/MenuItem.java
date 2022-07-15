package hfmenuiteratorvisitor;

import java.util.Iterator;

public class MenuItem extends MenuComponent {
 
	private String name;
	private String description;
	private String actors;
	private String director;
	private int year;
    
	public MenuItem(String nameIn, 
	                String descriptionIn, 
	                String actorsIn, 
	                String directorIn, 
	                int yearIn) { 
		name = nameIn;
		description = descriptionIn;
		actors = actorsIn;
		director = directorIn;
		year = yearIn;
	}
  
	public String getName() {
		return name;
	}
  
	public String getDescription() {
		return description;
	}
  
	public String getActors() {
		return actors;
	}
  
	public String getDirector() {
		return director;
	}
	
	public int getYear() {
		return year;
	}

	public Iterator<MenuComponent> createIterator() {
		return new NullIterator();
	}
 
	public String toString() {
		return "Name: " + getName() + " (" + getYear() + ")\nDescription: " + getDescription() + 
				"\nActors: " + getActors() + "\nDirector: " + getDirector();
	}

	public void accept(Visitor v) {
		v.visit(this);
	}
}

