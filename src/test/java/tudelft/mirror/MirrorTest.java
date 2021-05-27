package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MirrorTest {
    @Test
    public void evenMirror() {
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds("abcdba");
        Assertions.assertEquals("ab", result);
    }
    @Test
    public void oddMirror() {
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds("abcdeba");
        Assertions.assertEquals("ab", result);
    }
    @Test
    public void oddString() {
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds("abcba");
        Assertions.assertEquals("abcba", result);
    }

    @Test
    public void evenString() {
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds("abccba");
        Assertions.assertEquals("abccba", result);
    }



}
