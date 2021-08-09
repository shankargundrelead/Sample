package com.java.features.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program{
public static void main(String[] args) throws Exception {
	
	String value = "abc10dahjj40jkjksf50jk30jkja34jk56a";
	System.out.println("patternExamleForDigitOrNumbers :: "+patternExamleForDigitOrNumbers(value)); //220
	System.out.println("sumOfNumbers(value) :: "+ sumOfNumbers(value));  //220sumOfDigits
	System.out.println("sumOfDigits :: "+sumOfDigits(value));//31
	int[] numArray = {1,4,5,2};
	System.out.println("nthLargestNumberFromArray :: " +nthLargestNumberFromArray(numArray,3));
	//System.out.println("nthLargestNumberFromArray :: " +nthLargestNumberFromArray01(numArray,3));

	System.out.println("reverseString :: "+reverseString(value));String palString ="babab";
	System.out.println("checkForPalimdrom :: "+checkForPalimdrom(palString));
	String val = "avaajavaaajjjavasj";
	boolean flag = checkForRotationString(val,"java");
	System.out.println(flag);
	getFibonaci(10);
	
}


public static void getFibonaci( int n) {
	int a=0,b=0,c=1;
	
	for(int i=1;i<=n;i++) {
	a=b;
	b=c;
	c=a+b;
	System.out.print(a +" ");
	}
}

public static int patternExamleForDigitOrNumbers(String str){
	int sum=0;
	 Pattern p = Pattern.compile("\\d+"); // number sum
	 //Pattern p = Pattern.compile("\\d"); -- digit sum
     Matcher m = p.matcher(str);
     while(m.find()) {
            sum+=Integer.parseInt(m.group());
      }
	return sum;
	
}

static public int sumOfNumbers(String str){
	int sum = 0;
	char []chs = str.toCharArray();
	boolean flag = false;
	String numStr="";
	boolean seqBreak=true;
	for(int i=0;i<chs.length;i++){
		int asciival = (int)chs[i];
		
		if(asciival>47 &&  asciival < 58){
			flag=true;
		//	System.out.println(chs[i] +" AssciiValue : " +(int)chs[i]);
			//sum+=Integer.parseInt(chs[i]+"");
			numStr+=chs[i];
		}else{
			flag=false;
		}
		
		if(i==str.length()-1 && numStr.length()>=1){
			flag=false;
		}
		
		if(flag==false && numStr.length()>=1){
			sum+=Integer.parseInt(numStr);
			numStr="";
		}
		
		
	}
	System.out.println("here is sum : " +sum);
	return sum;
}

static public int sumOfDigits(String str){
	int sum = 0;
	char []chs = str.toCharArray();
	
	for(int i=0;i<chs.length;i++){
		int asciival = (int)chs[i];
		if(asciival>47 &&  asciival < 58){
		//	System.out.println(chs[i] +" AssciiValue : " +(int)chs[i]);
			sum+=Integer.parseInt(chs[i]+"");
		}
		
	}
	System.out.println("here is sum : " +sum);
	return sum;
}
private static int nthLargestNumberFromArray01(int[] num,int nthlargest) throws Exception {
	System.out.println("inside ");
	if(num==null)
		throw new Exception("NUll Array..");
	
	if(nthlargest <=0)
		throw new Exception("Invalid nthlargest input");
	
	if(num.length-1 < nthlargest)
		throw new Exception("Invalid nthlargest input");
	List<int[]> numList=Arrays.asList(num); 
	HashSet sortSet = new HashSet(numList);
	List sortedList = new ArrayList(sortSet);
	Collections.sort(sortedList);
	System.out.println("hashset of numbers. ..." +sortSet);
	int nthNumber= (Integer) sortedList.get(numList.size()-nthlargest);
return nthNumber;

}
private static int nthLargestNumberFromArray(int[] num,int nthlargest) throws Exception {
	System.out.println("inside ");
	if(num==null)
		throw new Exception("NUll Array..");
	
	if(nthlargest <=0)
		throw new Exception("Invalid nthlargest input");
	
	if(num.length-1 < nthlargest)
		throw new Exception("Invalid nthlargest input");
	
	HashSet<Integer> numbers = new HashSet<Integer>();
	for(int i=0;i<num.length;i++){
		numbers.add(num[i]);
	}
	System.out.println("hashset of numbers. ..." +numbers);
	Object[] nums=numbers.toArray();
	Arrays.sort(nums);
	int index= nums.length-nthlargest;
	return (Integer) nums[index];
}


public static String reverseString(String inputStr) throws Exception{
	String revStr = "";
	
	if(inputStr==null)
		throw new Exception("Invalid String");
	
	if(inputStr.length()==0 || inputStr.length()==1)
		return inputStr;
	
	if(checkForPalimdrom(inputStr))
		return inputStr;
	
	System.out.println("loop execution started..");
	
	for(int index=inputStr.length()-1;index>=0;index--){
		revStr +=inputStr.charAt(index);
	}
	return revStr;
}


public static String reverseString01(String inputStr) throws Exception{
	String revStr = "";
	
	if(inputStr==null)
		throw new Exception("Invalid String");
	
	if(inputStr.length()==0 || inputStr.length()==1)
		return inputStr;
	
	char ch[] = inputStr.toCharArray();
	int index =ch.length-1;
	while(true){
		if(index<0)
			break;
		revStr += ch[index];
		index--;
	}
	return revStr;
	
}
private static boolean checkForPalimdrom(String inputStr) {
	StringBuffer buffer = new StringBuffer(inputStr);
	String revStr = buffer.reverse().toString();
	return revStr.equals(inputStr);
}

private static boolean checkForRotationString(String value,String whichStr) {
	String finalString = value+value;
	finalString=finalString.substring(0,value.length()+whichStr.length());
	System.out.println(finalString);
	finalString=finalString.replaceAll("java","1");
	System.out.println(finalString);
	
	return finalString.contains(whichStr);
}
}
