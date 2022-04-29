package org.example.annotation;

@Deprecated
public class NeMyClass {
    private String msg;

    NeMyClass(String m){
        msg = m;
    }

    @Deprecated
    String getMsg(){
        return msg;
    }
}
