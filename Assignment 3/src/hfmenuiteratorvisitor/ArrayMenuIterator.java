package hfmenuiteratorvisitor;

import java.util.Iterator;

public class ArrayMenuIterator implements Iterator<MenuComponent> {
	MenuComponent[] items;
	int position = 0;

	public ArrayMenuIterator(MenuComponent[] itemsIn) {
		items = itemsIn;
	}

	public MenuComponent next() {
		return items[position++];
	}

	public boolean hasNext() {
		return items.length > position && items[position] != null;
	}
}
