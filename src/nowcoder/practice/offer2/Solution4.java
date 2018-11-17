package nowcoder.practice.offer2;

public class Solution4 {

	/*public static boolean Find(int target, int [][] array) {
        if(array == null)
        {
            return false;
        }
        int rows = array.length;
        int columns = array[0].length;
        if(columns == 0 || rows == 0)
        {
            return false;
        }
        
        int column = columns - 1;
        int row = 0;
        while(row < rows && column >= 0)
        {
        	System.out.println(row + "|" + column);
            if(array[row][column] == target)
            {
                return true;
            }
            else if(array[row][column] > target)
            {
                column--;
            }
            else if(array[row][column] < target)
            {
                row++;
            }
        }
        return false;

    }*/
	public static boolean Find(int target, int [][] array) {
		
		if(array == null)
        {
            return false;
        }
        int rows = array.length;
        int columns = array[0].length;
        if(columns == 0 || rows == 0)
        {
            return false;
        }
        
		int row = array.length-1;
		int column = array[0].length-1;
		int r = 0;
		int c = column;
		while(c >= 0 && r <= row)
		{
			if(array[r]
					[c] == target)
			{
				return true;
			}
			else if(array[r][c] < target)
			{
				r++;
			}
			else if(array[r][c] > target)
			{
				c--;
			}
		}
		
		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = 5;
		/*int[][] array = new int[4][5];
		array[0][0] = 1;
		array[0][1] = 2;
		array[0][2] = 8;
		array[0][3] = 9;
		array[1][0] = 2;
		array[1][1] = 4;
		array[1][2] = 9;
		array[1][3] = 12;
		array[2][0] = 4;
		array[2][1] = 7;
		array[2][2] = 10;
		array[2][3] = 13;
		array[3][0] = 6;
		array[3][1] = 8;
		array[3][2] = 11;
		array[3][3] = 15;*/
		int[][] array = {{1,2,8,9},{4,7,10,13}};

		boolean find = Find(target,array);
		int rows = array.length;
        int columns = array[0].length;
		System.out.println(find);
	}

}
