package org.andestech.learning.rfb19.g4;


import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * TestNG Unit test for simple App.
 **/
public class AppTest 
{

    public AppTest(){
        System.out.println("+++ ctor: " + this);
    }

    @Test(priority = -1000, groups = "fast")
    public void checker01Test()
    {
        // исключительно в учебных целях!!!
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertTrue( true );
    }

    @Test
    public void checker02Test()
    {
        // исключительно в учебных целях!!!
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertTrue( false );
    }

}
