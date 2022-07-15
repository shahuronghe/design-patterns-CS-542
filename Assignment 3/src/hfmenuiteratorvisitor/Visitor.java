package hfmenuiteratorvisitor;
public interface Visitor {
	default void visit(ArrayMenu f) {
	}
	default void visit(ListMenu b) {
	}
	default void visit(MenuItem p) {
	}
}
