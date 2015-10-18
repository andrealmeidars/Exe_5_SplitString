import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StringTest {

    private StringsRepetitions stringsRepetitions;

    @Before
    public void setUp() throws Exception {
        this.stringsRepetitions = new StringsRepetitions();

    }


    @Test
    public void returnStringWithRepetitions(){
        assertThat(stringsRepetitions.returnStringsRepetitions("name", 2), is("namename"));

    }



}
