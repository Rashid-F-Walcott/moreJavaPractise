package Day_5_Fri;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class MainTest {

    @Test
    void myFirstMock (){

//        List<String> mock = new ArrayList<>();
        List<String> mock = mock(List.class);
        verifyNoInteractions(mock);

        mock.add("hello");
        mock.add("ciao");

        verify(mock).add("hello");
        verify(mock).add("ciao");


        when(mock.get(0)).thenReturn("Message to be displayed here");
        String hello = mock.get(0);



        assertThat(hello).isEqualTo("Message to be displayed here");

//        verifyNoMoreInteractions(mock);
       // This line is not valid anymore since there are interactions due to the addition of mock.get(0)

    }

}