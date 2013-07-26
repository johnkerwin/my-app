package com.johnkerwin.app;

import static junit.framework.Assert.assertTrue;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class FooTest 
extends TestCase {
    
    
    public void testFoo()
    {
        Foo foo = new Foo();
        Integer bar;
        bar = 1;
        foo.setBar(bar);
        assert(bar == foo.getBar());
        
    }
    
    
}
