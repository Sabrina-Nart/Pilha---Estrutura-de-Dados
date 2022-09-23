
package tad;

public class Pilha implements Cloneable { 
    
    private int base, topo;
    private String[] stack;  
    
    public Pilha(int tamanho){ 
        this.clearStack();
        this.stack = new String[tamanho]; 
    }
    
    public void clearStack(){ 
        this.base = -1;
        this.topo = -1;        
    }
    
    public boolean isEmptyStack(){
        return this.base == -1; 
    }
    
    //isFull
    public boolean isFullStack(){
        return this.topo == (this.stack.length -1); 
    }
    
    //push
    public boolean pushStack(String valor){ 
        if (this.isFullStack()){ 
            return false;
        }
        
        if (this.isEmptyStack()){ 
            this.base = 0;
            this.topo = 0;
            this.stack[this.topo] = valor;
            return true;
        }
        
        this.topo++; 
        this.stack[this.topo] = valor;
        return true;
    }
    
    //pop 
    public boolean popStack(){ 
        if (this.isEmptyStack()){ 
            return false;
        }
        if (this.topo == this.base){ 
            this.clearStack();
            return true;
        }
        this.topo--;
        return true;
    }
    
    //top 
    public String topStack(){
        return (this.isEmptyStack() ? "STACK UNDERFLOW" : this.stack[this.topo]);
    }
    
    @Override 
    public Pilha clone() throws CloneNotSupportedException {
        return (Pilha)super.clone();
    }
    
}
