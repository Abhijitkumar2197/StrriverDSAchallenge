import java.io.*;
import java.util.* ;

 class Solution {
    public static void setZeros(int matrix[][]) {
        int colZero = 1;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(j == 0){
                    if(matrix[i][j] == 0){
                        colZero = 0;
                    }
                    continue;
                }
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i  = matrix.length - 1; i >= 0; i--){
            for(int j = matrix[0].length - 1; j >= 0; j--){
                if(j == 0){
                    if(colZero == 0){
                        matrix[i][j] = 0;
                    }
                    continue;
                }
                if(matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }else if(matrix[i][0] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        
        
        
        return;
    }

}
