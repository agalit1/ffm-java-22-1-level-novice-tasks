import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LevelNoviceTest {

    @Test
    public void numbersBiggerThanZero_positive(){
        //given
        int number = 15;

        //when
        boolean actual = Main.numbersBiggerThanZero(number);

        //then
        assertTrue(actual);
    }

    @Test
    public void numbersBiggerThanZero_negative(){
        //given
        int number = -6;

        //when
        boolean actual = Main.numbersBiggerThanZero(number);

        //then
        assertFalse(actual);
    }

    @Test
    public void numbersBiggerThanZero_zero(){
        //given
        int number = 0;

        //when
        boolean actual = Main.numbersBiggerThanZero(number);

        //then
        assertFalse(actual);
    }

    @Test
    public void squareOfANumber_positive() {
        //given
        int number = 5;

        //when
        int actual = Main.squareOfANumber(number);

        //then
        assertEquals(25, actual);
    }

    @Test
    public void squareOfANumber_negative() {
        //given
        int number = -6;

        //when
        int actual = Main.squareOfANumber(number);

        //then
        assertEquals(36, actual);
    }

    @Test
    public void squareOfANumber_zero() {
        //given
        int number = 0;

        //when
        int actual = Main.squareOfANumber(number);

        //then
        assertEquals(0, actual);
    }
}
