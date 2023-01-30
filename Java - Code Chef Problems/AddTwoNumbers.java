/*
CodeChef CODE: FLOW001

Problem
Problem Statement
The task is very simple: given two integers A and B, write a program to add these two numbers and output it.

Input Format
The first line contains an integer T, the total number of test cases. Then follow T lines, each line contains two Integers A and B.

Input:
3
1 2
100 200
10 40

Output:
3
300
50
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
	    int val1;
	    int val2;
	    
	    while(t != 0) {
	        val1 = s.nextInt();
	        val2 = s.nextInt();
	        System.out.println(val1 + val2);
	        t--;
	    }
	}
}
