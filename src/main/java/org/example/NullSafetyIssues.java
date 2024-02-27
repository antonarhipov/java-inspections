package org.example;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

public class NullSafetyIssues {

    abstract class A {
        @NotNull
        abstract String m();
    }
    class B extends A {
        String m() { return "empty string"; }
    }

    class FieldIsNeverInitialized {
        private @NotNull String value;

        public void setValue(@NotNull String value) {
            this.value = value;
        }

        public @NotNull String getValue() {
            return value;
        }
    }

    //@Nullable // Nullable annotation disables the inspection
    public Object returnNull(){
        return null;
    }

}
