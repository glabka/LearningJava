package functional_programming;

public class AcceptLambda {

    private int a, b, c;

    public AcceptLambda(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void doSomething(TwoArgIntOperator op) {
        System.out.println(op.op(a, b));
    }

    public void doSomething(ThreeArgIntOperator op) {
        System.out.println(op.op(a, b, c));
    }
}
