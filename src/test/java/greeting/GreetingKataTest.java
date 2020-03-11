package greeting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreetingKataTest {
    GreetingKata greetingKata = new GreetingKata();

    @Test
    public void shouldReturnHelloName() {
        assertEquals("Hello, Bob.", greetingKata.greet("Bob"));
    }

    @Test
    public void shouldReturnHelloMyFriendForNull() {
        assertEquals("Hello, my friend", greetingKata.greet(null));
    }

    @Test
    public void shouldReturnHelloNameForShoutingCase() {
        assertEquals("HELLO JERRY!", greetingKata.greet("JERRY"));
    }

    @Test
    public void shouldReturnHelloNamesForTwoCase() {
        assertEquals("Hello, Jill and Jane.", greetingKata.greet("Jill", "Jane"));
    }

    @Test
    public void shouldReturnHelloNamesForMultipleCase() {
        assertEquals("Hello, Amy, Brian, and Charlotte.", greetingKata.greet("Amy", "Brian", "Charlotte"));
    }

    @Test
    public void shouldReturnAndHelloNamesForShoutingOnMultipleCase() {
        assertEquals("Hello, Amy and Charlotte. AND HELLO BRIAN!", greetingKata.greet("Amy", "BRIAN", "Charlotte"));
    }

    @Test
    public void shouldReturnAndForLastCommaInNameString() {
        assertEquals("Hello, Bob, Charlie, and Dianne.", greetingKata.greet("Bob", "Charlie, Dianne"));
    }

    @Test
    public void shouldAllowEscapeCharacters() {
        assertEquals("Hello, Bob and Charlie, Dianne.", greetingKata.greet("Bob", "\"Charlie, Dianne\""));
    }
}
