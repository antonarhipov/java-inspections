package org.example;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;
import java.util.Random;

public class NullSafetyIssues {

    abstract static class A {
        @NotNull
        abstract String method();
    }
    class B extends A {
        @NotNull String method() { return "empty string"; }
    }

    static class FieldIsNeverInitialized {
        private String value;

        public void setValue(@NotNull String value) {
            this.value = value;
        }

        public @NotNull String getValue() {
            return value;
        }
    }

    @Nullable // Nullable annotation disables the inspection
    public Object returnNull(){
        return null;
    }

    void redundantChecks(){
        var optional = fetchX();
        String value = optional.get(); //calling get without isPresent check
        if (value != null) { //always true
            //noinspection UseOfSystemOutOrSystemErr
            System.out.println("value = " + value);
        }

    }

    private @NotNull Optional<String> fetchX() {
        return Optional.of(String.valueOf(new Random(100L).nextLong()));
    }




}
