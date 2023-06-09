public class Solution 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
		// Write your code here.
		int n = permutation.size();
		if(n == 1 || n == 0) return permutation;
		int i = n-2;
		while(i >= 0 && permutation.get(i+1) < permutation.get(i)){
			i--;
		}

		if(i == -1){
			Collections.reverse(permutation);
			return permutation;
		}
        for(int j = n-1; j > i; j--){
			if(permutation.get(j) > permutation.get(i)) {
				int temp = permutation.get(i);
				permutation.set(i, permutation.get(j));
				permutation.set(j, temp);
				break;
			}
		}
		List<Integer> sublist = permutation.subList(i + 1, n);
        Collections.reverse(sublist);
		return permutation;
	}
}
