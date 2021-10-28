package Dictionnaire;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class DictionaryTest {

    private Dictionary dict;
    private List<String> liste;

    @BeforeEach
    public void initialize()
    {
        dict = new Dictionary("Example");
        liste = new ArrayList<>();
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

    @Test
    public void testMultipleTranslation() {
        liste.add("");
        dict.addMultipleTranslation("contre", liste);
        assertThat(dict.getMultipleTranslation("contre"), equalTo(liste));
    }

    @After
    public void fin() {
        dict = null;
    }

}
