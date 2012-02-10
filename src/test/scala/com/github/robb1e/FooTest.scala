package com.github.robb1e

import org.scalatest.FunSuite

class FooTest extends FunSuite {
    
    test("hit foo.foo"){
        val foo = new Foo()
        assert(foo.foo == "foo")
    }
    
    test("hit foo.bar"){
        val foo = new Foo()
        assert(foo.bar == "bar")
    }
    
}