
// question numbber 3....create a text file, which has Alphabets A-z in that file on each line.so read the file and get all lines 
//nd push into Dictionary ,in which key as line number and value as corresponding alphabet. 
//push the value alone from dictionary to string array.
class Question3
{
    static void splitString(String str)
    {
        StringBuffer alpha = new StringBuffer(),
        num = new StringBuffer(), special = new StringBuffer();
         
        for (int i=0; i<str.length(); i++)
        {
            if (Character.isDigit(str.charAt(i)))
                num.append(str.charAt(i));
            else if(Character.isAlphabetic(str.charAt(i)))
                alpha.append(str.charAt(i));
            else
                special.append(str.charAt(i));
        }
      
        System.out.println(alpha);
        System.out.println(num);
        System.out.println(special);
    }
     
    // Driver method
    public static void main(String args[])
    {
        String str = "vikash01$$for0vikash03!@!!";
        splitString(str);
    }
}