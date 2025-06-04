package xyz;

public class BinarySearchExample {

	public static void main(String[] args) {
		int[] numbers = {9,5,4,3,2,1,8};
		int target = 8;
		int left = 0;
		int right = numbers.length-1;
		boolean found = false;
		while(left<=right) {
			int mid = (left+right)/2;
			if(numbers[mid]==target) {
				System.out.println("Found" +" "+target + "at index" + " "+mid);
				found = true;
				break;
			}else if(target<numbers[mid]) {
				right=mid-1;
			}else {
				left = mid+1;
			}
		}
		if(!found) {
			System.out.println("Number not found");
		}

	}

}
