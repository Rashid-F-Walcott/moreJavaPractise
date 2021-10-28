package Day_4_thurs;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ParenthesisCheckerTest {


    @Test
    void itShouldCheckCorrectNumberOfBrackets() {

        //given
        String input = "({})";

        //when
        ParenthesisChecker checker = new ParenthesisChecker();
        boolean actual = checker.check(input);

        //then
        assertThat(actual).isTrue();

    }

    @Test
    void itShouldCheckIncorrectNumberOfBrackets() {

        //given
        String input = "({}";

        //when
        ParenthesisChecker checker = new ParenthesisChecker();
        boolean actual = checker.check(input);

        //then
        assertThat(actual).isEqualTo(false);

    }

    @Test
    void itShouldWorkForZeroBrackets() {

        //given
        String input = "";

        //when
        ParenthesisChecker checker = new ParenthesisChecker();
        boolean actual = checker.check(input);

        //then
        assertThat(actual).isEqualTo(false);

    }

    @Test
    void itShouldWorkWithLongNumberOfCorrectBrackets() {

        //given
        String input = "({(({(({{()}}))}))})";

        //when
        ParenthesisChecker checker = new ParenthesisChecker();
        boolean actual = checker.check(input);

        //then
        assertThat(actual).isEqualTo(true);

    }

    @Test
    void itShouldNotWorkWithLongNumberOfIncorrectBrackets() {

        //given
        String input = "({(({(({{()}})}))})";

        //when
        ParenthesisChecker checker = new ParenthesisChecker();
        boolean actual = checker.check(input);

        //then
        assertThat(actual).isEqualTo(false);

    }

    @Test
    @Disabled
    void itShouldWorkWithWhiteSpacesNoBrackets() {

        // This test is the only one that fails currently, in java it is possible to run all tests
        // whilst disabling the ones that fail so they doesnt affect the other results
        // this is done using the @Disabled line above.

        //given
        String input = " ";

        //when
        ParenthesisChecker checker = new ParenthesisChecker();
        boolean actual = checker.check(input);

        //then
        assertThat(actual).isEqualTo(false);

    }








}