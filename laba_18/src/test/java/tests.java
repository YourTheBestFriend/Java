import org.junit.Assert;
import org.junit.Test;


public class tests {
    @Test
    public void TestNotNullCreate()
    {
        var array = laba_18.newArray(5);
        Assert.assertNotNull(array);
    }
    @Test
    public void TestOnExistCreate()
    {
        var array = laba_18.newArray(0);
        Assert.assertNull(array);
    }
    @Test
    public void TestOnExistWhenReplace()
    {
        int[][] arr = new int[0][0];
        var array = laba_18.replaceDiag(arr);
        Assert.assertEquals(null,array);
    }
    @Test
    public void TestValues()
    {
        int[][] arr = {
                {1,0,0,2},
                {0,1,2,0},
                {0,2,1,0},
                {2,0,0,1}};

        var array = laba_18.replaceDiag(arr);

        // Итог
        int[][] arr_2 = {
                {2,0,0,1},
                {0,2,1,0},
                {0,1,2,0},
                {1,0,0,2}};

        Boolean f = true;
        // via flag
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                if (array[i][j] != arr_2[i][j])
                {
                    f = false;
                    break;
                }
            }
        }
        Assert.assertEquals(true,f);
    }
    @Test
    public void TestValuesInvalid()
    {
        int[][] arr = {
                {1,0,0,2},
                {0,1,2,0},
                {0,2,1,0},
                {2,0,0,1}};

        var array = laba_18.replaceDiag(arr);

        // Итог
        int[][] arr_2 = {
                {-2,0,0,1},
                {0,2,1,0},
                {0,1,2,0},
                {1,0,0,2}};

        Boolean f = true;
        // via flag
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                if (array[i][j] != arr_2[i][j])
                {
                    f = false;
                    break;
                }
            }
        }
        Assert.assertNotEquals(true,f);
    }

}
