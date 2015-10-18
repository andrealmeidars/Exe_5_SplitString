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
    public void showStringWith2RepetitionsAndConcatWith2LastLetters(){
        assertThat(stringsRepetitions.returnStringsRepetitions("teste", 2), is("tete"));
    }

    @Test
    public void showStringWithZeroRepetitionsAndReturnEmpty(){
        assertThat(stringsRepetitions.returnStringsRepetitions("name", 0), is(""));
    }

    @Test
    public void showErrorIfNumberOfRepetitiosIsBiggerThanTextSize(){
        assertThat(stringsRepetitions.returnStringsRepetitions("name", 5), is("error"));
    }






}
