package tudelft.ghappy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class GHappyTest {
    @Test
    public void oneSingular()
    {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("xxgxx");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void oneDoubble()
    {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("xxggxx");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void oneDoubleOneSingular()
    {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("xxggyygxx");
        Assertions.assertEquals(false, result);
    }
    @Test
    public void shortdouble()
    {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("gg");
        Assertions.assertEquals(true, result);
    }
    @Test
    public void shortSingle()
    {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("g");
        Assertions.assertEquals(false, result);
    }


}
