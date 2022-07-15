package hfmenuiteratorvisitor;

public class VegetarianVisitor extends PrintMenuVisitor {
	
	public void visit(MenuItem mc) {
			System.out.println(mc);
	}
}
