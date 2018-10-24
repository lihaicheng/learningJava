package nowcoder.practice.offer2;

public class Solution10_3 {
	public static int JumpFloorII(int target) {
		return (int) Math.pow(2, target - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("JumpFloorII(1):" + JumpFloorII(2));
	}

}
