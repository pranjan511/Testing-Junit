/**
 * Prabhat RANJAN
 * Software Testing and Metrics
 * Telecom SudParis
 * 
 * */

package test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import tower.TowerOfHanoi;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestTowerOfHanoi extends TowerOfHanoi 
{
	String expected; 
	boolean status;
	//Constructor
	public TestTowerOfHanoi(String str, String expected, boolean status ){
		this.expected=expected;
		this.status=status;
	}
		
	@Parameters
	public static Collection<Object[]> params() {
	return Arrays.asList(
	new Object[] {TowerOfHanoi.str,"| A -> C| A -> B| C -> B| A -> C| B -> A| B -> C| A -> C", true},
			new Object[] {TowerOfHanoi.solve(4,"A","B","C"), "| A -> B| A -> C| B -> C| A -> B| C -> A| C -> B| A -> B| A -> C| B -> C| B -> A| C -> A| B -> C| A -> B| A -> C| B -> C", true}
	);
	}
	
	@Test
	public void test_solve(){

		assertEquals(TowerOfHanoi.solve(3, "A", "B", "C"), TowerOfHanoi.str);
		assertEquals(TowerOfHanoi.solve(4, "A", "B", "C"), TowerOfHanoi.str);
	}
}