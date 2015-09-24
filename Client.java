package prototypepattern;

import java.util.ArrayList;

 class Prototype implements Cloneable {
	 private ArrayList list = new ArrayList();
	public Prototype clone(){
		Prototype prototype = null;
		try {
			prototype = (Prototype)super.clone();
			prototype.list = (ArrayList)this.list.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prototype;
	}

}

 
 class ConcrectPrototype extends Prototype{
	 public void show(){
		 System.out.println("原型模式实现类");
	 }
 }
 
 public class Client{
	 public static void main(String[] args){
		 ConcrectPrototype prototype = new ConcrectPrototype();
		 for(int i = 0 ;i <10 ;i++){
			ConcrectPrototype clonecp = (ConcrectPrototype)prototype.clone();
			clonecp.show();
		 }
	 }
 }
 
 
 