package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {

	public int verify(String candidateSolution) {
		
		String strArray = new String(candidateSolution);
		int result = 0;

		//String[] strArray ;
		if(strArray.length() != 81){
			result = -5;
		}else{
			int row = setColumns(strArray);
			if(row!=0){
				result = row;
			}
		}
		
		return result;
		
	}
	
	public int setCell(String candidateSolution){
		String strArray = new String(candidateSolution);
		String strRow = "";
		int result = 0;
		for(int i=0; i<=strArray.length();i++){
			
			if(i%3==0 && i<=6){
				strRow = strArray.substring(i,(i+3)) + strArray.substring((i+9),(i+12)) + strArray.substring((i+18),(i+21));
				checkDuplication(strRow);
				if(checkDuplication(strRow)==false){
					result = -2;
				}
			}
			
		}
		return result;
	}
	
	public int setRows(String candidateSolution){
		String strArray = new String(candidateSolution);
		String strRow = "";
		int result = 0;
		for(int i=0; i<=(strArray.length()-9);i++){
			
			if(i%9==0){
				strRow = strArray.substring(i,(i+9));
				System.out.println(strRow);
				/*checkDuplication(strRow);
				if(checkDuplication(strRow)==false){
					result = -3;
				}*/
			}
		}
		return result;
	}
	
	public int setColumns(String candidateSolution){
		String strArray = new String(candidateSolution);
		String strRow = "";
		int result = 0;
		for(int i=0; i<=8;i++){
			
			if(i%9==0){
				strRow = strArray.substring(i,(i+9));
				System.out.println(strRow);
				checkDuplication(strRow);
				if(checkDuplication(strRow)==false){
					result = -4;
				}
			}
		}
		return result;
	}
	
	public boolean checkDuplication(String nineNums){
		boolean result = false;
		for(int i=0; i<nineNums.length(); i++){
			char str = nineNums.charAt(i);
			int num = (int)str;
			for(int j=i+1; j<=nineNums.length(); j++){
				char str2 = nineNums.charAt(i);
				int num2 = (int)str2;
				
				if(num==num2){
					result = false;
				}else{
					result = true;
				}
			}
		}
		return result;
	}
}
