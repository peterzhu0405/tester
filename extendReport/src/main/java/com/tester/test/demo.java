package com.tester.test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo {
    @Test
    public void test1(){
        Assert.assertEquals(1,2);
    }


    @Test
    public void logDemo(){
        Reporter.log("这是我们自己的日志");
        throw new RuntimeException("这是我们自己的运行时异常");
    }
}
