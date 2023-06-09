import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
        // Write your code here.
		ArrayList<ArrayList<Long>> res = new ArrayList<>();

		for(int i = 0; i < n; i++){
			res.add(new ArrayList<Long>());
			for(int j = 0; j <= i; j++){
				if(j == 0 || j == i){
					res.get(i).add((long)1);
				}
				else{
					res.get(i).add((res.get(i-1).get(j-1))+res.get(i-1).get(j));
				}
			}
		}
		return res;
	}
}
