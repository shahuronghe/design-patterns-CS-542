package hfmenuiteratorvisitor;

import java.util.Iterator;

public class ArrayMenu extends MenuComponent {
	private final int MAX_ITEMS;
	private int numberOfItems = 0;
	private MenuComponent[] menuComponents;

	private Iterator<MenuComponent> iterator = null;
	private String name;
	private String description;

	public ArrayMenu(int max, String name, String description) {
		MAX_ITEMS = max;
		menuComponents = new MenuComponent[MAX_ITEMS];
		this.name = name;
		this.description = description;
	}

	public void add(MenuComponent menuComponent) {
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full!  Can't add item to menu");
		} else {
			menuComponents[numberOfItems] = menuComponent;
			numberOfItems = numberOfItems + 1;
		}
	}

	public MenuComponent getChild(int i) {
		return menuComponents[i];
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public Iterator<MenuComponent> createIterator() {
		if (iterator == null) {
			iterator = new CompositeIterator(new  ArrayMenuIterator(menuComponents));
		}
		return iterator;
	}

	@Override
	public void clearIterator() {
		iterator = null;
		for(var mc : menuComponents) {
			if(mc != null) mc.clearIterator();
		}
	}

	public String toString() {
		return "\n" + getName() + ", " + getDescription() + "\n" +
				"---------------------";
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}
}
