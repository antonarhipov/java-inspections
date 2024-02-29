package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Calendar;
import java.util.Date;
import java.util.Optional;

public class CodeMaturityIssues {
    ProblemsFactory factory;

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.err.println(e.getLocalizedMessage());
        }
    }

    public void debugStackTrace(){
        Thread.dumpStack();
    }

    Optional<Integer> nullMisuse(boolean flag) {
        return flag ? Optional.of(42) : Optional.empty();
    }

    public void obsoleteDateTimeApi(){
        Date date = new Date(2024, Calendar.MARCH, 29);
    }


}

class Person {
    private final String name; // can be final

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
