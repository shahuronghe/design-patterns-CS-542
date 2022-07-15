package hfmenuiteratorvisitor;

import java.util.Iterator;

public class Server {
	MenuComponent allMenus;

	public Server(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}

	public void processVisitor(Visitor visitor, String name) {
		boolean flag = false;
		allMenus.clearIterator();
		Iterator<MenuComponent> iterator = allMenus.createIterator();
		while (iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			String newName = menuComponent.getName() + menuComponent.getDescription();
			if (menuComponent instanceof MenuItem)
				newName = menuComponent.getName() + menuComponent.getDescription() + menuComponent.getActors()
						+ menuComponent.getDirector() + menuComponent.getYear();
			if (newName.toLowerCase().contains(name.toLowerCase())) {
				menuComponent.accept(visitor);
				flag = true;
			}
		}
		if (!flag) {
			System.out.println("Movie not found!!!!!");
		}
	}

	public void printMenu() {
		processVisitor(new PrintMenuVisitor(), "");
	}

	public void search(String s) {
		processVisitor(new VegetarianVisitor(), s);
	}
}
