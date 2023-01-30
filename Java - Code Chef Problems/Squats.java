/*
CodeChef CODE: SQUATS

Problem
Somu went to the gym today. He decided to do X sets of squats. Each set consists of 
15
15 squats. Determine the total number of squats that he did today.

Input Format
The first line contains a single integer T — the number of test cases. Then the test cases follow.
The first and only line of each test case contains an integer X — the total number of sets of squats that Somu did.

Output Format
For each test case, output the total number of squats done by Somu.

Input:
3
1
4
99

Output:
15
60
1485
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s = new Scanner(System.in);
	    int t = s.nextInt();
	    
	    while(t != 0) {
	        int x = s.nextInt();
	        System.out.println(x * 15);
	        t--;
	    }
	}
}
