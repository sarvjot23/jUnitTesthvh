package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	

	@Test
	public void test() {
		jUnitFunctions jUnit= new jUnitFunctions();
		 String result = jUnitFunctions.AddString("Raja","Babu");
		 assertEquals("RajaBabu",result);
	}

}
