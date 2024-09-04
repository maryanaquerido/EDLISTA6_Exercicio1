package controller;
import model.Pilha;
public class Controller {
	public Controller() {
		super();
	}
	
	Pilha p1 = new Pilha();
	Pilha p2 = new Pilha();
	
	public void AlgoritmoA () {
		for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                p1.push(i * i);
            } else {
                if (i <= 5) {
                    p1.push(i);
                } else {
                    System.out.println("Pop: " + p1.pop() +"\n"); 
                }
            }
        }

        System.out.println("Topo: " + p1.top());
        System.out.println("Tamanho: " + p1.size());
    }
	
	public void AlgoritmoB () {
		for (int i = 100; i < 115; i++) {
            if (p2.isEmpty()) {
                p2.push(i + 100);
            } else {
                if (p2.size() <= 4) {
                    p2.push(i + 50);
                } else {
                	 System.out.println("Pop: " + p2.pop() +"\n"); 
                }
            }
        }
        
		System.out.println("Topo: " + p2.top());
        System.out.println("Tamanho: " + p2.size());
    }
}


