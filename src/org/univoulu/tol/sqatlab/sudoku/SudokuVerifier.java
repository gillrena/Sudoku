package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {

	public int verify(String candidateSolution) {
		
		String strArray = new String(candidateSolution);
		

		//String[] strArray ;
		if(strArray.length() != 81){
			return -5;
		}else{
			return 0;
		}
		
		
		
		
		
		
		// returns 1 if the candidate solution is correct
		//return 0;
	}
}
