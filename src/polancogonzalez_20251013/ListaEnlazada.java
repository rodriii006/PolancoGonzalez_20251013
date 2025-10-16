/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polancogonzalez_20251013;

/**
 *
 * @author Dell
 */
public class ListaEnlazada {
 
    private Nodo cabeza;
    
    public void agregarAlFinal(int dato){
        
        Nodo nuevoNodo = new Nodo(dato);
        
        if(cabeza == null){
            
            cabeza = nuevoNodo;
            
        }else{
        
            Nodo actual = cabeza;
            
            while(actual.siguiente != null){
                actual = actual.siguiente;
            
            }
            actual.siguiente = nuevoNodo;
            
        }
        
    }
    
    
    
    
    public void agregarAlInicio(int dato){
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.siguiente = cabeza;
        cabeza = nuevoNodo;
    }
    
    
    
    public void agregarEn(int posicion, int data){
    
        Nodo nuevoNodo = new Nodo(data);
        
        if(posicion == 0){
            nuevoNodo.siguiente = cabeza;
            cabeza = nuevoNodo;
        }
        
        Nodo actual = cabeza;
        for(int i=0; i < posicion  - 1 && actual != null; i++){
            actual = actual.siguiente;
        }
        
        if(actual == null){
            System.out.println("Posicion fuera del rango");
        }
        
        nuevoNodo.siguiente = actual.siguiente;
        actual.siguiente = nuevoNodo;
        
    }
    
    
    public void eliminar(int dato){
    
        if(cabeza == null){
            System.out.println("La lista esta vacia, no puede eliminar datos");
        }
        
        if(cabeza.data == dato){
            cabeza = cabeza.siguiente;
        }
        
        Nodo actual = cabeza;
        while(actual.siguiente != null && actual.siguiente.data != dato){
            actual = actual.siguiente;
        }
        
        if(actual.siguiente != null){
            actual.siguiente = actual.siguiente.siguiente;
        }
        
    }
    
    
    public void mostrar(){
    
        Nodo actual = cabeza;
        while(actual != null){
            System.out.print(actual.data+" -> ");
            actual = actual.siguiente;
        }
        
        System.out.println("null");
    }
    
    
    
}