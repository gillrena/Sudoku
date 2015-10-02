package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {

	public int verify(String candidateSolution) {
		
		String strArray = new String(candidateSolution);
		int result = 0;

		//String[] strArray ;
		if(strArray.length() != 81){
			result = -5;
		}else{
			int cell = setCells(strArray);
			int row = setRows(strArray);
			int col = setColumns(strArray);
			//int[] resultArray = new int [3];
			if(cell!=0){
				result = cell;
			}else{
				if(row!=0){
					result = row;
				}else{
					if(col!=0){
						result = col;
					}
				}
			}
			
			/*for (int i=0; i<resultArray.length; i++)
			{
			  System.out.println("Result: "+resultArray[i]+"\n");
			}*/
		}
		
		return result;
		
	}
	
	public int setCells(String candidateSolution){
		String strArray = new String(candidateSolution);
		String strCell = "";
		int result = 0;
		for(int i=0; i<=strArray.length();i++){
			
			if(i==0||i==3||i==6||i==27||i==30||i==33||i==54||i==57||i==60){
				strCell = strArray.substring(i,(i+3)) + strArray.substring((i+9),(i+12)) + strArray.substring((i+18),(i+21));
				checkDuplication(strCell);
				if(checkDuplication(strCell)==false){
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
				checkDuplication(strRow);
				if(checkDuplication(strRow)==false){
					result = -3;
					break;
				}
			}
		}
		return result;
	}
	
	public int setColumns(String candidateSolution){
		String strArray = new String(candidateSolution);
		String strCol = "";
		int result = 0;
		for(int i=0; i<= strArray.length();i++){
			
			if(i<=8){
				strCol = String.valueOf(strArray.charAt(i)+""+strArray.charAt(i+9)+""+strArray.charAt(i+18)+""+strArray.charAt(i+27)+""+strArray.charAt(i+36)+""+strArray.charAt(i+45)+""+strArray.charAt(i+54)+""+strArray.charAt(i+63)+""+strArray.charAt(i+72));
				checkDuplication(strCol);
				if(checkDuplication(strCol)==false){
					result = -4;
					break;
				}
			}
		}
		return result;
	}
	
	public boolean checkDuplication(String nineNums){
		boolean result = true;
		for(int i=0; i<(nineNums.length()-1); i++){
			char str = nineNums.charAt(i);
			for(int j=i+1; j<nineNums.length(); j++){
				char str2 = nineNums.charAt(j);
				//int num2 = (int)str2;
				
				if(str==str2){
					result = false;
				}
				
			}
		}
		return result;
	}
}
