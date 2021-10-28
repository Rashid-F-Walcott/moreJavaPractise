package Day_4_thurs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringReverserTest {

       private StringReverser stringReverser;

    @BeforeEach
    void setUp(){
        stringReverser = new StringReverser();
    }



    @Test
    void itCanreverseAString() {

        //given
        String input = "Yacine";
        String expected = "enicaY";

        //when
//        StringReverser stringReverser = new StringReverser();        THE @BeforeEach essentially adds this step before all test so this is not neccessary anymore
        String actual = stringReverser.reverse(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }


    @Test
    void itCanReverseAnEmptyString() {

        //given
        String input = " ";
        String expected = " ";

        //when
//        StringReverser stringReverser = new StringReverser();        THE @BeforeEach essentially adds this step before all test so this is not neccessary anymore
        String actual = stringReverser.reverse(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void itCanReverseANullString() {

        //given
        String input = null;
        String expected = " ";

        //when
//        StringReverser stringReverser = new StringReverser();        THE @BeforeEach essentially adds this step before all test so this is not neccessary anymore
        String actual = stringReverser.reverse(input);

        //then
        assertThat(actual).isEqualTo(expected);
    }
}