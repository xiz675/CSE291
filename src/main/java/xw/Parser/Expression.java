package xw.Parser;

public class Expression {
    public String name = null;
    public String property = null;
    public String rightExp = null;

    public Expression(String name, String property, String rightExp) {
        this.name = name;
        this.property = property;
        this.rightExp = rightExp;
    }

    public Expression() {
    }
}
