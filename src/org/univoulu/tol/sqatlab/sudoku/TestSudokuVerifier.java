package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {

	@Test
	public void testCorrectSeries() {
		String testStr = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		SudokuVerifier candidate = new SudokuVerifier();
		int result = candidate.verify(testStr);
		assertEquals(0,result);
	}
	
	@Test
	public void testWrongSeries() {
		String testStrIncorrect = "123456789912345678891234567789123456678912345567891234456789123345678912234567891";
		SudokuVerifier candidate = new SudokuVerifier();
		int result = candidate.verify(testStrIncorrect);
		assertEquals(-2,result);
	}

}
