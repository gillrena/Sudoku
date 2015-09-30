package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {

	public int verify(String candidateSolution) {
		
		String strArray = new String(candidateSolution);
		

		//String[] strArray ;
		if(strArray.length() != 81){
			return -5;
		}else{
			for(int i=0; i<=strArray.length(); i++){
				char str = 0;
				str = strArray.charAt(i);
				int num = (int)str;
				int repeatNum = 0;
				
				if(num < 1){
					return -1;
				}else{
					
					for(int j=i+1; j<=(strArray.length()-1); j++){
						char str2 = 0;
						str2 = strArray.charAt(j);
						int num2 = (int)str2;
						
						if(num2 == num){
							repeatNum++;
						}
						
						if(i==10 && repeatNum>0){
							return -2;
						}else{
							if(i==19 && repeatNum>0){
								return -2;
							}else{
								if(i==28 && repeatNum>0){
									return -2;
								}else{
									if(i==37 && repeatNum>0){
										return -2;
									}else{
										if(i==46 && repeatNum>0){
											return -2;
										}else{
											if(i==55 && repeatNum>0){
												return -2;
											}else{
												if(i==64 && repeatNum>0){
													return -2;
												}else{
													if(i==73 && repeatNum>0){
														return -2;
													}else{
														if(i==82 && repeatNum>0){
															return -2;
														}else{
															return 0;
														}
													}
												}
											}
										}
									}
								}
							}
						}
						
						
						
					}
				}
			}
		}
		
		
		
		
		
		
		// returns 1 if the candidate solution is correct
		//return 0;
	}
}
