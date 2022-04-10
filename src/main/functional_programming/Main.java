package functional_programming;

public class Main {
    public static void main(String[] args) {
        AcceptLambda acceptLambda = new AcceptLambda(2, 3, 4);
        acceptLambda.doSomething(ArgOperatorsImplementation::opArg2Impl);
        acceptLambda.doSomething(ArgOperatorsImplementation::opArg3Impl);
    }
}
