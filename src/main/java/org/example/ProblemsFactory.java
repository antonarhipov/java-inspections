package org.example;

public class ProblemsFactory {

    /**
     * @deprecated Use {@link #method3()} instead
     */
    @Deprecated()
    public void method1() {

    }

    @Deprecated(forRemoval = true)
    public void method2() {

    }

    public void method3() {

    }




}
