package ua.it.simplefan.services;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SettingsFunServiceImplTest {
    SettingsFunServiceImpl subject;

    @Before
    public void  before () {
        subject = new SettingsFunServiceImpl();
    }

    @Test
    public void testSpeed() {
        Integer pullFirst = subject.pullSpeedCord().getSpeed();
        Integer pullSecond = subject.pullSpeedCord().getSpeed();
        Integer pullThird = subject.pullSpeedCord().getSpeed();
        Integer pullFourth = subject.pullSpeedCord().getSpeed();

        assertEquals(1, pullFirst);
        assertEquals(2, pullSecond);
        assertEquals(3, pullThird);
        assertEquals(0, pullFourth);
    }

    @Test
    public void testDirection() {
        Boolean pullFirst = subject.pullDirectionCord().getDirection();
        Boolean pullSecond = subject.pullDirectionCord().getDirection();
        Boolean pullThird = subject.pullDirectionCord().getDirection();

        assertEquals(false, pullFirst);
        assertEquals(true, pullSecond);
        assertEquals(false, pullThird);
    }

}