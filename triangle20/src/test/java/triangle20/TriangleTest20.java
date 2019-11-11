package triangle20;


import org.junit.Assert;
import org.junit.Test;

//import junit.framework.Assert;
import triangle20.TriangleType20.Type;

public class TriangleTest20 {

	@Test
	public void test()
	{
		Type t=TriangleType20.getTriangleType(1.0, 1.0, 1.0);
		Assert.assertEquals(t, Type.EQUILATERAL);
	}
	@Test
	public void test2()
	{
		Type t=TriangleType20.getTriangleType(3.0, 4.0, 5.0);
		Assert.assertEquals(t, Type.SCALENE);
	}
	
	@Test
	public void test3()
	{
		Type t=TriangleType20.getTriangleType(4.0, 4.0, 5.0);
		Assert.assertEquals(t, Type.ISOCELES);
	}
	
	@Test
	public void test4()
	{
		Type t=TriangleType20.getTriangleType(20.0, 10.0, 100.0);
		Assert.assertEquals(t, Type.NOTTRIANGLE);
	}
	@Test
	public void test5()
	{
		Type t=TriangleType20.getTriangleTypeCoordinates(0.0,0.0,1.0,1.0,2.0,2.0);
		Assert.assertEquals(t, Type.NOTTRIANGLE);
	}
	
	@Test
	public void test6()
	{
		Type t=TriangleType20.getTriangleTypeCoordinates(0.0,0.0,0.0,1.0,2.0,2.0);
		Assert.assertEquals(t, Type.SCALENE);
	}
	
	@Test
	public void test7()
	{
		Type t=TriangleType20.getTriangleTypeCoordinates(0.0,0.0,8.0,0.0,4.0,10.0);
		Assert.assertEquals(t, Type.ISOCELES);
	}

	
	

}
