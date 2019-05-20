package org.andestech.learning.rfb19.g4;


import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * TestNG Unit test for simple App.
 **/
public class App3Test
{

    public App3Test(){
        System.out.println("+++ ctor: " + this);
    }

    @Test(dependsOnMethods = "checker05Test")
    public void checker04Test()
    {
        // исключительно в учебных целях!!!
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

      // Assert.assertEquals(12,11,"Wrong data!!!");
        Assert.assertEquals(1.002, 1.001, 0.01);
    }


    @Test(timeOut = 450)
    public void checker05Test() throws InterruptedException
    {
        // исключительно в учебных целях!!!
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

        // Assert.assertEquals(12,11,"Wrong data!!!");
       // Thread.sleep(500);
        Assert.assertEquals(1.002, 1.001, 0.01);


    }

}
