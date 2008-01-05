package net.loveruby.cflat.ast;
import net.loveruby.cflat.type.Type;

public class UnaryOpNode extends ExprNode {
    protected String operator;
    protected ExprNode expr;

    public UnaryOpNode(String op, ExprNode expr) {
        this.operator = op;
        this.expr = expr;
    }

    public String operator() {
        return operator;
    }

    public Type type() {
        return expr.type();
    }

    public ExprNode expr() {
        return expr;
    }

    public Location location() {
        return expr.location();
    }

    protected void _dump(Dumper d) {
        d.printMember("expr", expr);
    }

    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
