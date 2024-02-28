package org.example;

import org.jetbrains.annotations.PropertyKey;

public class Critical {

    @PropertyKey(resourceBundle = "myBundle") String value = "somePropertyValueX";


    ProblemsFactory factory;

    public void usingDeprecatedApiMarkedForRemoval(){
        factory.method2();
    }

}


