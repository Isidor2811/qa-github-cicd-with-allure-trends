package tests;

import framework.PropertyLoader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdditionTests2 {

    @Test
    public void firstAdditionTest4() {
        Assert.assertEquals(5 + 5, 10, "Expected 5+5 to be equals to 10");
        System.out.println(PropertyLoader.getProperty("BASE_URL"));
    }

    @Test
    public void secondAdditionTest5() {
        Assert.assertEquals(5 + 1, 7, "Expected 5+1 to be equals to 7");
    }

    @Test
    public void thirdAdditionTest6() {
        Assert.assertEquals(5 + 2, 7, "Expected 5+2 to be equals to 7");
    }

}
