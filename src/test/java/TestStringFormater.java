import com.hampus.StringFormater;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStringFormater
{
    private StringFormater stringFormater;

    @BeforeEach
    void init(){
        stringFormater = new StringFormater();
    }

    @Test
    void testStringFormating(){
        assertEquals("Test", stringFormater.toNameFormat("TEST"));
    }

    @Test
    void testWrongFormating(){
        assertEquals("TeSt", stringFormater.toNameFormat("TEST"));
    }

    @Test
    void failedTest(){
        assertEquals(11,5);
    }
}
