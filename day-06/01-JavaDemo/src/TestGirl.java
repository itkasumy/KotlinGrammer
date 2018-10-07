import org.junit.Assert;
import org.junit.Test;

public class TestGirl {
	@Test
	public void testGreeting() {
		Girl girl = new Girl();
		String actual = girl.greeting();
		Assert.assertEquals("hello", actual);
	}
}
