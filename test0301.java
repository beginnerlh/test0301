/*
 * 在MATLAB中，有一个非常有用的函数 reshape，它可以将一个矩阵重塑为另一个大小不同的新矩阵，但保留其原始数据。
给出一个由二维数组表示的矩阵，以及两个正整数r和c，分别表示想要的重构的矩阵的行数和列数。
重构后的矩阵需要将原始矩阵的所有元素以相同的行遍历顺序填充。
如果具有给定参数的reshape操作是可行且合理的，则输出新的重塑矩阵；否则，输出原始矩阵。

示例 1:
输入: 
nums = 
[[1,2],
 [3,4]]
r = 1, c = 4
输出: 
[[1,2,3,4]]
解释:
行遍历nums的结果是 [1,2,3,4]。新的矩阵是 1 * 4 矩阵, 用之前的元素值一行一行填充新矩阵。

示例 2:
输入: 
nums = 
[[1,2],
 [3,4]]
r = 2, c = 4
输出: 
[[1,2],
 [3,4]]
解释:
没有办法将 2 * 2 矩阵转化为 2 * 4 矩阵。 所以输出原矩阵。
*/
package lianxi0301;

public class test0301 {
	public static void main(String[] args) {
		Solution S = new Solution();
		int[][] nums = new int[][] { { 1, 2}, { 3, 4} };
		int r = 4;
		int c = 1;
		int[][] num1 = new int[r][c];
			num1 = S.matrixReshape(nums, r, c); 
		for(int i = 0; i < r; i++)
		{
			for(int j = 0; j < c; j++) 
			{
				System.out.print(num1[i][j]+" ");
			}
			System.out.println();
		}
	}
}

class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(nums.length * nums[0].length == r * c)
        {
            int[][] num1 = new int[r][c];
            int m = 0;
            int n = 0;
            for(int i = 0; i < nums.length; i++)
            {
                for(int j = 0; j<nums[0].length;j++)
                {
                    num1[m][n] = nums[i][j];
                    n++;
                    if(n == c)
                    {
                        m++;
                        n = 0;
                        if(m == r)
                        {
                            m = 0;
                        }
                    }
                }
            }
            return num1;
        }
        return nums;
    }
}
