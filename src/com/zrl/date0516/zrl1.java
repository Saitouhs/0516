package com.zrl.date0516;

public class zrl1
{
	public static int max(int a[])
	{
		int max = a[0];
		for(int i=0;i<a.length;i++)
			if(max<a[i])
				max = a[i];
		return max;
	}
	public static void main(String[] args)
	{
		int a[] = new int[]{1,4,5,9,10};
		System.out.println(max(a));
	}
}
