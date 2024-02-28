package org.example.metrics;

public class MetricsIssues {

    //overly complex method in custom scope 'MyScope'
    public void receive(Object object) {
        if (object instanceof ObjectTypeA) {
            doSomethingA();
        }
        else {
            if (object instanceof ObjectTypeB) {
                doSomethingB();
            }
            else {
                if (object instanceof ObjectTypeC) {
                    doSomethingC();
                }
                else {
                    if (object instanceof ObjectTypeD) {
                        doSomethingD();
                    }
                    else {
                        // etc...
                        //noinspection UseOfSystemOutOrSystemErr
                        System.out.println();
                    }
                }
            }
        }
    }

    private void doSomethingA() {}
    private void doSomethingB() {}
    private void doSomethingC() {}
    private void doSomethingD() {}
}

class ObjectTypeA{}
class ObjectTypeB{}
class ObjectTypeC{}
class ObjectTypeD{}

