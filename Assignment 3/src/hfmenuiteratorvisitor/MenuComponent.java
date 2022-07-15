package hfmenuiteratorvisitor;

import java.util.Iterator;
import java.util.function.Consumer;

public abstract class MenuComponent implements Consumer<Visitor>  {
   
	public void add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	public void remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	public MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}
  
	public String getName() {
		throw new UnsupportedOperationException();
	}
	public String getDescription() {
		throw new UnsupportedOperationException();
	}
	public String getActors() {
		throw new UnsupportedOperationException();
	}
	public String getDirector() {
		throw new UnsupportedOperationException();
	}
	
	public int getYear() {
		throw new UnsupportedOperationException();
	}

	public abstract Iterator<MenuComponent> createIterator();
 
	public void clearIterator() {
	}
}
