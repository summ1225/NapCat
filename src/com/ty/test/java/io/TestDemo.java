package com.ty.test.java.io;
class Array {
	private int data[];
	private int foot = 0; //��ʾ����Ĳ����Ǳ�

	public Array(int length) {
		if (length > 0) {
			
			data = new int[length];

		} else {
			
			this.data = new int[1];
		}

	}
	public boolean add(int num){
		if (this.foot < this.data.length){
			this.data[this.foot ++ ] = num;
			return true;
		}else{
			return false;
			
		}
			
	}
	
	public int[] getData(){
		return data;
	}
}

public class TestDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Array ary = new Array(5);
		System.out.println(ary.add(10));;
		System.out.println(ary.add(20));;
		System.out.println(ary.add(30));;
		System.out.println(ary.add(40));;
		
		int[] tmp = ary.getData();
		for(int i : tmp){  //foreach����jdk1.7������ã����Ա���ʹ��JDK1.7�汾���С�
			System.out.println(i);
		}
	}

}
