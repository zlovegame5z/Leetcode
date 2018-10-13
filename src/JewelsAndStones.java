import java.util.Scanner;

/*  2018/10/13
*
*
You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: J = "aA", S = "aAAbbbb"
Output: 3
Example 2:

Input: J = "z", S = "ZZ"
Output: 0
*
*
* */
public class JewelsAndStones {
	public int numJewelsInStones(String J,String S)
	{
		boolean[] Jewel = new boolean[128]; //have 128 char
		int count = 0;
		for (char str : J.toCharArray()) //逐一檢查 每個J2charArray 也就是每個迴圈跑 str = toCharArray
		{
			Jewel[str] = true;
		}
		for (char str : S.toCharArray()){
			if (Jewel[str])count++;
		}
		return count;
	}
    public static void main(String args[])
    {
    	JewelsAndStones solution = new JewelsAndStones();

		String J = "z";
		String S = "ZZ";
		System.out.println(solution.numJewelsInStones(J,S));
    }
}
