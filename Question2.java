//let us assume two string array as a={apple,fruit,text,world} and b={text,sam,try,apple,blue}
 //compare the both array and give the count of word same in both array.
 import java.util.Arrays;  
public class Question2  
{   
public static void main (String[] args)    
{   
//defining array to compare   
String[] inarray1 = new String[] {"apple", "fruit", "text", "world"};   
String[] inarray2 = new String[] {"text", "sam", "try", "apple", "blue"}; Object[] array1 = {inarray1};  // array1 have only one element   
Object[] array2 = {inarray2};  // array2 also have only one element   
//comparing two arrays using equals() method  
if (Arrays.deepEquals(array1, array2))   
System.out.println("Arrays are both.");   
else  
System.out.println("Arrays are not both.");   
}   
}  