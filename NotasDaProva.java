/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notas.da.prova;

import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class NotasDaProva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        int x = scan.nextInt();
        
        for(int c = 1;c <= x && x <= 100; c++){
            int y = 0;
            y = scan.nextInt();
            
            if(y == 0){
                System.out.println("E");
            } if(y >= 1 && y <= 35) {
                System.out.println("D");
            } if(y >= 36 && y <= 60) {
                System.out.println("C");
            } if(y >= 61 && y <= 85) {
                System.out.println("B");
            } if(y >= 86 && y <= 100) {
                System.out.println("A");
            }
             
        }
    }
    
}
