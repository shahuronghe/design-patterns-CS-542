package hfmenuiteratorvisitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListMenu extends MenuComponent {
	Iterator<MenuComponent> iterator = null;
	List<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	String name;
	String description;

	public ListMenu(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}

	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}

	public MenuComponent getChild(int i) {
		return menuComponents.get(i);
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public Iterator<MenuComponent> createIterator() {
		if (iterator == null) {
			iterator = new CompositeIterator(menuComponents.iterator());
		}
		return iterator;
	}

	@Override
	public void clearIterator() {
		iterator = null;
		for(var mc : menuComponents) mc.clearIterator();
	}

	public String toString() {
		return "\n" + getName() + ", " + getDescription() + "\n" +
				"---------------------";

	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}
}
