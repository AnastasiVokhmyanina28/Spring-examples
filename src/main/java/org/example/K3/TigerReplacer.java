package org.example.K3;

import org.springframework.beans.factory.support.MethodReplacer;
import java.lang.reflect.Method;

public class TigerReplacer implements MethodReplacer {

    public Object reimplement(Object target, Method method,Object[] args ) throws Throwable{
        return "A ferocious tiger";
    }
}
