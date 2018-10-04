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
public interface IStack<T> {
    
    public void push(T elem);
    public T pop();
    public int size();
    public boolean isEmpty();
    public T peek();
    @Override
    public String toString();
}
