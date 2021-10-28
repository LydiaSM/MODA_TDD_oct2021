package Dictionnaire;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class DictionaryTest {

    private Dictionary dict;

    @BeforeEach
    public void setUp()
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

    @Test
    public void testOneTranslation() {
        dict.addTranslation("contre", "against");
        assertThat(dict.getTranslation("contre"), equalTo("against"));
    }

}
