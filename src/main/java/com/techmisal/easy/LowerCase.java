package com.techmisal.easy;

/*

Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.


Example 1:

Input: "Hello"
Output: "hello"
Example 2:

Input: "here"
Output: "here"
Example 3:

Input: "LOVELY"
Output: "lovely"




 */

public class LowerCase {


    public String toLowerCase(String str) {

        StringBuilder sb = new StringBuilder(str);

       for(int i=0;i<sb.length();i++){
           if(sb.charAt(i)>=65&&sb.charAt(i)<=90){
               sb.replace(i, i+1,new Character((char) (sb.charAt(i)+32)).toString());
           }
       
       }

        return sb.toString();
    }

}
