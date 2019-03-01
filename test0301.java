/*
 * ��MATLAB�У���һ���ǳ����õĺ��� reshape�������Խ�һ����������Ϊ��һ����С��ͬ���¾��󣬵�������ԭʼ���ݡ�
����һ���ɶ�ά�����ʾ�ľ����Լ�����������r��c���ֱ��ʾ��Ҫ���ع��ľ����������������
�ع���ľ�����Ҫ��ԭʼ���������Ԫ������ͬ���б���˳����䡣
������и���������reshape�����ǿ����Һ���ģ�������µ����ܾ��󣻷������ԭʼ����

ʾ�� 1:
����: 
nums = 
[[1,2],
 [3,4]]
r = 1, c = 4
���: 
[[1,2,3,4]]
����:
�б���nums�Ľ���� [1,2,3,4]���µľ����� 1 * 4 ����, ��֮ǰ��Ԫ��ֵһ��һ������¾���

ʾ�� 2:
����: 
nums = 
[[1,2],
 [3,4]]
r = 2, c = 4
���: 
[[1,2],
 [3,4]]
����:
û�а취�� 2 * 2 ����ת��Ϊ 2 * 4 ���� �������ԭ����
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
