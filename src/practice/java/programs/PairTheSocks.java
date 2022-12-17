package practice.java.programs;

import java.util.ArrayList;
import java.util.List;

public class PairTheSocks {

	public static void main(String[] args) {
		int count=0;
		//4 5 5 5 6 6 4 1 4 4 3 6 6 3 6 1 4 5 5 5
		List<Integer> ar = new ArrayList<Integer>();
		ar.add(4);
		ar.add(5);
		ar.add(5);
		ar.add(5);
		ar.add(6);
		ar.add(6);
		ar.add(4);
		ar.add(1);
		ar.add(4);
		ar.add(4);
		ar.add(3);
		ar.add(6);
		ar.add(6);
		ar.add(3);
		ar.add(6);
		ar.add(1);
		ar.add(4);
		ar.add(5);
		ar.add(5);
		ar.add(5);
		
		for (Integer integer : ar) {
			System.out.print(integer + " ");
		}
		System.out.println();
		for(int i=0 ;i<ar.size();i++) {
			for(int j=1;j<ar.size()-1;j++) {
				if(ar.get(i)==ar.get(j)) {
					count ++;
					ar.remove(i);
					ar.remove(j);
				}
			}
		}
		
		System.out.println("The count is "+count);
	}

}
