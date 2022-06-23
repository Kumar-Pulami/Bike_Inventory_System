
import java.awt.List;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kumar
 */
public class SelectionSorting {    
    
    public static void sorting(String dataArray[][]){
        for (int i=0; i<dataArray.length-1; i++){
            int minPos= minPos(dataArray, i);
            swapping(dataArray, minPos, i);
        }
    }
    
    public static int minPos(String dataArray[][], int from){
        int minPos=from;
        for (int j=from+1; j<dataArray.length; j++){
            if (Integer.parseInt(dataArray[j][5])<Integer.parseInt(dataArray[minPos][5])){
                minPos=j;
            }
        }
        return minPos;
    }
   
    public static void swapping(String dataArray[][], int minPos,int i){
        String array[]= dataArray[minPos];
        dataArray[minPos]=dataArray[i];
        dataArray[i]=array;                
    }
}
