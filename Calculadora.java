/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bruno_agoravai;
import java.util.Scanner;

/**
 *
 * @author BR40044529
 */
public class Calculadora {
    
    public void Calculadora_Bruno(){
        Scanner ler = new Scanner(System.in);
        int x = 0;
        int y= 0;
        int resultado = 0;
        int input = ler.nextInt();
        
        
        switch (input){
            case 1:
                System.out.println("DIgite o numero 1 ");
                x = ler.nextInt();
                System.out.println("Digite o número 2 ");
                y = ler.nextInt();
                System.out.println("O resultado da soma é "+ (x+y));
                
                break;
            
        } 
                
    }

}
