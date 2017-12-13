/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loadmapelemts;

import java.io.*;
import java.util.Scanner;



/**
 *
 * @author 16007873
 */
public class Loadmapelemts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        

Scanner map = new Scanner(new File("B:\\HND Work\\Semester 1\\Object Orientated Programing\\Sokoban Assessment\\SokobanMaps\\level1.txt"));
while (map.hasNext()){
   String str = map.nextLine();
   System.out.println(str);
}        

        
        
    }
    
}
