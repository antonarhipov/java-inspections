package org.example;

public class HighSeverityIssues {

    private ProblemsFactory factory;

    public void usingDeprecatedApi() {
        factory.method1();
    }

    void unreachableCode() {
        System.exit(0);
        System.out.println("Application is terminated");
    }
}
