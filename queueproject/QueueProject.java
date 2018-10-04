/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueproject;

/**
 *
 * @author Francisco
 */
public class QueueProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QueueImpl<Integer> teste = new QueueImpl();
        teste.enqueue(1);
        teste.enqueue(2);
        teste.enqueue(3);
        teste.enqueue(4);
        
        System.out.println(teste.toString());
        
        System.out.println("Numero retirado: " + teste.dequeue() + "\n");
        System.out.println("Numero retirado: " + teste.dequeue() + "\n");
        
        System.out.println(teste.toString());
    }
    
}
