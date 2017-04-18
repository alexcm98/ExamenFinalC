package Models;
import Models.*;
public class Lista <T>{

	private T[] elementos;
	private int index;
	
	
	public Lista() {
		
		elementos = (T[]) new Object[1];
	}
	
	
	public void add(T element){
		
		aumentar();
		elementos[elementos.length-1] = element;
		
	}
	
public void remove(T element){
		int pos = 0;
		boolean comprobar = true;
		
		for(int i = 0;i<elementos.length;i++){
			if(element == elementos[i]){
				pos = i;
				if(i ==elementos.length-1){
					disminuir();
					comprobar = false;
				}
			}
		}
		
		if(comprobar){
			
			for(int i = pos;i<elementos.length;i++ ){
				
				elementos[i]=elementos[i+1];
			}
			
			disminuir();
			
		}
		
	}


public T getNext(int ind){
	int i = setIndex(ind+1);
	if(i != -1){
		
		return elementos[i];
		
	}else {
		return null;
	}
	
}
	
public T getPrev(int ind ){
	int i = setIndex(ind-1);
	if(i != -1){
		
		return elementos[i];
		
	}else {
		return null;
	}
	
}


public T getCurrent(int ind){
	int i = setIndex(ind);
	if(i != -1){
		
		return elementos[i];
		
	}else {
		return null;
	}

}


public int setIndex(int i){
	if(i <= elementos.length && i>-1){
		return i;
	}else{
		return -1;
	}
	
	
}









public void aumentar(){

		
		elementos =(T[]) elementos[elementos.length+1];
	}
	
public void disminuir(){
		
		elementos =(T[]) elementos[elementos.length-1];
	}
	
}
