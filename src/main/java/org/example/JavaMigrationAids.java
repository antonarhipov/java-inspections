package org.example;

import java.util.ArrayList;
import java.util.List;

public class JavaMigrationAids {

    void replaceWithObject_dot_equals(Object a, Object b) {
        boolean result = a != null && a.equals(b);
    }

    void diamondOperator() {
        List<String> s = new ArrayList<>();
    }

    void replacedWithLambda() {
        new Thread(() -> {
                // run thread
            });
    }

    void replacedWithMethodReference() {
        Runnable r = System.out::println;
    }

    boolean replaceWithStringAPI(List<String> data) {
        for (String e : data) {
            String trimmed = e.trim();
            if (!trimmed.startsWith("xyz")) {
                return false;
            }
        }
        return true;
    }

    void replaceWithList_replaceAll(List<String> strings){
        strings.replaceAll(String::toLowerCase);
    }

    double replaceWithSwithExpression(String fruit) {
        // Switch statement can be replaced with enhanced 'switch'
        return switch (fruit) {
            case "Apple" -> 1.0;
            case "Orange" -> 1.5;
            case "Mango" -> 2.0;
            default -> throw new IllegalArgumentException();
        };
    }

    public void usePatternVariable(Object obj) {
        if (obj instanceof String str) {
            //noinspection UseOfSystemOutOrSystemErr
            System.out.println(str);
        }
    }
    

}
