package functional_programming;

public class ArgOperatorsImplementation {
    // name of the following two methods has to be different in order for them to be passed by reference
    // otherwise the compiler will say that method reference is ambiguous

    public static int opArg2Impl(int a, int b) {
        return a + b;
    }

    public static int opArg3Impl(int a, int b, int c) {
        return a * b + c;
    }
}
