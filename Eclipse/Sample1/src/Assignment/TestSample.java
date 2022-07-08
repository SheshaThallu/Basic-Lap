package Assignment;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class TestSample 
{
	@Test
	public void testRevStr()
	{
		assertEquals("!dlroW olleH", Sample.revStr("Hello World!"));
	}
	
	@Test
	public void testRevNum()
	{
		assertEquals(123, Sample.revNum(321));
	}
	
	@Test
	public void testCaseChange()
	{
		assertEquals("AsDFgHJkL",Sample.caseChange("aSd fGh jKl "));
	}
	
	@Test
	public void testRevArray()
	{
		assertEquals(Arrays.asList(4,3,2,1), Sample.revArray(Arrays.asList(1,2,3,4)));
	}
}