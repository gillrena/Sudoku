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
	
	public void setRows(String candidateSolution){
		String strArray = new String(candidateSolution);
		String strRow = "";
		for(int i=0; i<=strArray.length();i++){
			
			if(i%8==0){
				strRow = strArray.substring(i);
			}
		}
	}
	
	public int checkDuplication(String nineNums){
		boolean result = false;
		for(int i=0; i<=8; i++){
			char str = nineNums.charAt(i);
			int num = (int)str;
			for(int j=i+1; j<=7; j++){
				char str2 = nineNums.charAt(i);
				int num2 = (int)str2;
				
				if(num==num2){
					result = false;
				}else{
					result = true;
				}
			}
		}
		if(result==true){
			return 0;
		}else{
			return -1;
		}
	}
}
