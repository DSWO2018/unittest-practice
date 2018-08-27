package mx.iteso.ut;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Alan on 8/27/18.
 */
public class TortillaHarinaTest {
    TortillaHarina tortillaHarina;

    @Before
    public void setUp(){ tortillaHarina = new TortillaHarina();
    }

    @Test
    public void testCurrentTemperature(){
        tortillaHarina.setCurrentTemperature(21);
        assertEquals(21,tortillaHarina.getCurrentTemperature());
    }
    @Test
    public void testFalseToast(){
        tortillaHarina.toast(false);
        assertFalse(tortillaHarina.isToasted());
    }
    @Test
    public void testTrueToast(){
        tortillaHarina.toast(true);
        assertTrue(tortillaHarina.isToasted());
    }
    @Test
    public void testToasting(){
        assertEquals(20,tortillaHarina.getToastTemperature());
    }
}

