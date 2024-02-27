package org.example;

public class HighSeverityIssues {

    ProblemsFactory factory;

    public void usingDeprecatedApi() {
        factory.method3();
    }

    void unreachableCode() {
        System.exit(0);
        System.out.println("Application is terminated");
    }
}
