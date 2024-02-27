package org.example;

import org.jetbrains.annotations.PropertyKey;

public class Criticals {

    @PropertyKey(resourceBundle = "myBundle") String value = "somePropertyValueX";


    ProblemsFactory factory;

    public void usingDeprecatedApiMarkedForRemoval(){
        factory.method2();
    }

}


