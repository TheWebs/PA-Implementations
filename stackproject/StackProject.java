/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackproject;

/**
 *
 * @author Francisco
 */
public class StackProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StackImpl<Integer> teste = new StackImpl<Integer>();
        teste.push(1);
        teste.push(2);
        teste.push(3);
        teste.push(4);
        
        System.out.println(teste);
        
        System.out.println("Numero espreitado: " + teste.peek() + "\n");
        
        System.out.println("Numero retirado: " + teste.pop() + "\n");
        System.out.println("Numero retirado: " + teste.pop() + "\n");
        
        System.out.println(teste);
    }
    
}
