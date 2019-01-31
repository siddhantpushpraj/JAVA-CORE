package basics;

public class biggestInRow {
	public static void main(String[] args){
		int[][] myarr={{1,2,3},{1,4,9},{76,34,21}};
		//myarrr[][]= {{1,2,3},{1,4,9},{76,34,21}};
			for(int i = 0;i < myarr.length; i++){
				System.out.println("biggest number in row " + i + " is " + bigNumber(myarr[i]));
			}
	}
	public static int bigNumber(int arr[]) {
		int big=arr[0];
		for(int i = 0;i < arr.length;i++) {
 			if(big < arr[i]) {
				big=arr[i];
			}
		}
		return big;
	}
}
