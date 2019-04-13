package com.himanshu.problems;

import java.util.ArrayList;
import java.util.HashMap;

public class FindUniqueNumber {

	public static void main(String[] args) {
		int[] input = {1,3,5,5,6,6,7,8,10,10,12};
		for(Integer number : getUniqueNumber(input)){
			System.out.print(number + "\t");
		}
	}
	
	static ArrayList<Integer> getUniqueNumber(int[] input){
		ArrayList<Integer> response = new ArrayList<Integer>();
		HashMap<Integer, Integer> tempMap = new HashMap<Integer, Integer>();
		for(int ip : input){
			if(tempMap.containsKey(ip)){
				tempMap.put(ip, tempMap.get(ip)+1);
			}else{
				tempMap.put(ip,1);
			}
		}
		for(int n : tempMap.keySet()){
			if(tempMap.get(n)== 1){
				response.add(n);
			}
		}
		return response;
	}
}
