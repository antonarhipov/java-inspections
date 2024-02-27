package org.example;

import java.util.ArrayList;
import java.util.List;

public class JavaMigrationAids {

    void replaceWithObject_dot_equals(Object a, Object b) {
        boolean result = a != null && a.equals(b);
    }

    void diamondOperator() {
        List<String> s = new ArrayList<String>();
    }

    void replacedWithLambda() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                // run thread
            }
        });
    }

    void replacedWithMethodReference() {
        Runnable r = () -> System.out.println();
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
        for (int i = 0; i < strings.size(); i++) {
            String str = strings.get(i).toLowerCase();
            strings.set(i, str);
        }
    }

    double replaceWithSwithExpression(String fruit) {
        // Switch statement can be replaced with enhanced 'switch'
        switch (fruit) {
            case "Apple":
                return 1.0;
            case "Orange":
                return 1.5;
            case "Mango":
                return 2.0;
            default:
                throw new IllegalArgumentException();
        }
    }

    public void usePatternVariable(Object obj) {
        if (obj instanceof String) {
            String str = (String) obj;
            //noinspection UseOfSystemOutOrSystemErr
            System.out.println(str);
        }
    }
    

}
