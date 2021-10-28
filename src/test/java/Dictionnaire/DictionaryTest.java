package Dictionnaire;

import org.testng.annotations.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@Test
public class DictionaryTest {

    private Dictionary dict;

    public DictionaryTest()
    {
        this.dict = new Dictionary();
    }

    @Test
    public void testDictionaryName() {
        assertThat(dict.getName(), equalTo("Example"));
    }

    @Test
    public void testIsEmpty() {
        assertThat(dict.isEmpty(), equalTo(true));
    }

}
