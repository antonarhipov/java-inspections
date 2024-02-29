package org.example;

import org.jetbrains.annotations.PropertyKey;

public class Critical {

    @PropertyKey(resourceBundle = "myBundle") String value = "somePropertyValueX";


    ProblemsFactory factory;

    public void usingDeprecatedApiMarkedForRemoval(){
        factory.method2();
    }

    public void example(){
        int x;
        x = 1;
        System.out.println("x = " + x);
    }

}


