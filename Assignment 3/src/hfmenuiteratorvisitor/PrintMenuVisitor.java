package hfmenuiteratorvisitor;

public class PrintMenuVisitor implements Visitor {
	public void visit(ArrayMenu mc) {
		System.out.println(mc);
	}
	public void visit(ListMenu mc) {
		System.out.println(mc);
	}
	public void visit(MenuItem mc) {
		System.out.println(mc);
	}
}
