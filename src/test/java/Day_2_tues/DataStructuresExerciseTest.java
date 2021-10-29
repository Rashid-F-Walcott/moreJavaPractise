package Day_2_tues;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;


class DataStructuresExerciseTest {

    @Test
    void correctStringLength() {

        //Given
        String randomString = "a,a,b";


        //When
        Map<Character, Integer> actual = DataStructuresExercise.StringCount(randomString);


        //Then
        Map<Character, Integer> expected = Map.of('a', 2, 'b', 1, ',',2);

        assertThat(actual).isEqualTo(expected);

    }

}