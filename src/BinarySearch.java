
import javax.swing.JOptionPane;
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
public class BinarySearch {
    
    public static void search(String arr[][],int price){
        // this method search the bike based on given price.
        
        int first=0, last=arr.length; // first and last index of array.
        int mid = (first + last)/2; 
        while( first <= last ){
            if ( Integer.parseInt(arr[mid][5]) < price ){
                first = mid + 1;
            }else if ( Integer.parseInt(arr[mid][5]) == price ){
                JOptionPane.showMessageDialog(null," Bike ID: " + arr[mid][0] + "\n Manufacturer: " + arr[mid][1]  + "\n Model: " + arr[mid][2] + "\n Category: " + arr[mid][3] +"\n Colour: " + arr[mid][4] +"\n Price: " + arr[mid][5] );
                break;
            }else if (Integer.parseInt(arr[mid][5]) > price ){
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        
        if ( first> last){
            JOptionPane.showMessageDialog(null,"None of the bike is available at this price.");
        } 

    }
}
