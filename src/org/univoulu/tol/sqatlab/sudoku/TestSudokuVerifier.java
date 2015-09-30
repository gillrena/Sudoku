package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {

	@Test
	public void test() {
		
		String testStr = "012345678";
		SudokuVerifier candidate = new SudokuVerifier();
		candidate.verify(testStr);
		
	}

}
