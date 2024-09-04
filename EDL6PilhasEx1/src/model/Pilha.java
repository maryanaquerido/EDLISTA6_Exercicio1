package model;

public class Pilha {
	No topo;
	int tamanho = 0;
	
	public Pilha () {
		topo = null;
		
	}
	
	public boolean isEmpty() { // OPERAÇÃO SE A PILHA FOR VAZIA
		if (topo == null) {
			return true;
		}
		return false;
	}
	
	public void push(int valor) { //OPERAÇÃO: PREENCHER VALOR DA PILHA
		No elemento = new No();
		elemento.dado = valor; // PASSANDO UM VALOR PELO NO
		elemento.proximo = topo;
		topo = elemento;
		tamanho ++;
		System.out.println("push(" + valor +")");
		System.out.println("top()\n");
	}
	
	public int top() {
        if (topo == null) {
            System.out.println("Pilha vazia.");
            return -1;
        }
        return topo.dado;
    }
	
	public int pop() {
        if (topo == null) {
            System.out.println("Pilha vazia.");
            return -1;
        }
        int poppedData = topo.dado;
        topo = topo.proximo;
        tamanho--;
        return poppedData;
    }
	
	 public int size() {
	        return tamanho;
	    }

}