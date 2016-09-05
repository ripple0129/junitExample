package junit;

import static org.junit.Assert.assertEquals;




import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterTest {
	
	private int numberA;
    private int numberB;
    private int expected;

	
    public ParameterTest(int expected, int numberA, int numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.expected = expected;
    }
	
	@Parameters
	public static Collection<Object[]> t(){
		return Arrays.asList(new Object[][]{
				{5,2,3},
				{6,3,3},
				{8,4,4},
		});
	}
	
	@Test
	public void testAdd(){
		assertEquals(expected, new Calculator().add(numberA, numberB));
	}

}
