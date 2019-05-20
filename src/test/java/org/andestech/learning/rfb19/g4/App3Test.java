package org.andestech.learning.rfb19.g4;


import org.testng.Assert;
import org.testng.annotations.*;

/**
 * TestNG Unit test for simple App.
 **/
public class App3Test
{

    @BeforeSuite
    public static void globalInit()
    {
        //
        System.out.println("@BeforeSuite");
    }

    @AfterSuite
    public static void globalTeardown()
    {
        //
        System.out.println("@AfterSuite");
    }

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


    @Parameters({"data", "dataName"})
    @Test(timeOut = 450)
    public void checker05Test(@Optional("0.0") double mydata, @Optional("notSet") String dataName) throws InterruptedException
    {
       // if(dataName == null) dataName="notSet";

        // исключительно в учебных целях!!!
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println("data: " + mydata + ", dataData: " + dataName);
        // Assert.assertEquals(12,11,"Wrong data!!!");
       // Thread.sleep(500);
        Assert.assertEquals(1.002, 1.001, 0.01);


    }

}
