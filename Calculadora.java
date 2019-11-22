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
        int x = ler.nextInt();
        int y = ler.nextInt();
        int resultado = 0;
        
        
        switch (resultado){
            case 1:
                System.out.println("DIgite o numero 1 "+ x);
                System.out.println("Digite o número 2 "+ y);
                System.out.println("O resultado da soma é "+ x+y);
                break;
            
        } 
                
    }

}
