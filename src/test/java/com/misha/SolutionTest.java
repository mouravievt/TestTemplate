package com.misha;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SolutionTest {
    private Solution victim = new Solution();

    @DataProvider(name = "dataprovider")
    public Object[][] provideData(){
        return new Object[][] {
                {1, 1, 2},
                {-1, 2, 1},
                {4, 5, 9}
        };
    }

    @Test(dataProvider = "dataprovider")
    public void testSolution(int aa, int bb, int expected){
        int actual = victim.solve(aa, bb);

        Assert.assertEquals(actual, expected);
    }
}
