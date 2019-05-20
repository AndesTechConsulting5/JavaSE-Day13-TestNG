package org.andestech.learning.rfb19.g4;


import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

/**
 * TestNG Unit test for simple App.
 **/
public class App2Test
{

    public App2Test(){
        System.out.println("+++ ctor: " + this);
    }

    @Test(enabled = false)
    //@Ignore
    public void checker03Test()
    {
        // исключительно в учебных целях!!!
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        int a = 1 -2;
        int b = 1/(a+1);

        Assert.assertTrue( true );
    }

    @Test(groups = "fast", testName = "SuperMeth06")
    public void checker06Test()
    {
        // исключительно в учебных целях!!!
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        int a = 1 -2;
        int b = 1/(a+1);

        Assert.assertTrue( true );
    }


}
