package tests;

import framework.PropertyLoader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdditionTests {

    @Test
    public void firstAdditionTest() {
        Assert.assertEquals(5 + 5, 10, "Expected 5+5 to be equals to 10");
        System.out.println(PropertyLoader.getProperty("BASE_URL"));
    }

    @Test
    public void secondAdditionTest() {
        Assert.assertEquals(5 + 1, 7, "Expected 5+1 to be equals to 7");
    }

    @Test
    public void thirdAdditionTest() {
        Assert.assertEquals(5 + 2, 7, "Expected 5+2 to be equals to 7");
    }

}
