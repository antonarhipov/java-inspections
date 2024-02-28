package org.example;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

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
        var s = fetchX();

    }

    private Optional<String> fetchX() {
        return Optional.of("String");
    }




}
