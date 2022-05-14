package array;

import java.util.*;

public class String_array {
	public static void main(String[] args) {
		String markes[]= {"deepak","ingale","sagar","shubham","amol"};
		//int markes[]= {89,86,76,88,95,99};
		//int markes[]=new int[5];
		//markes[0]=89;//math
		//markes[1]=86;//science
	//	markes[2]=99;//biology
	//	markes[3]=56;//English
		//markes[4]=93;//chemistry
		
		for(int i=0;i<=markes.length-1;i++) {
			System.out.println(markes[i]);
		}
		
		
		System.out.println("-------Ascending----");
		Arrays.sort(markes);
		for(int i=0;i<=markes.length-1;i++) {
			System.out.println(markes[i]);
	}  
		System.out.println("--------Descending------");
		for(int i=markes.length-1;i>=0;i--) {
			System.out.println(markes[i]);
	}
	}
	
			}