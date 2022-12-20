import java.util.*;

class program1{
public static void main(String[] args){
String string_1,string_2;
Scanner sc=new Scanner(System.in);
System.out.println("Enter First String: ");
string_1=sc.nextLine();
System.out.println("Enter Second String: ");
string_2=sc.nextLine();
System.out.println("Length of the first string is "+string_1.length());
System.out.println("Length of the second string is "+string_2.length());
if(string_1.length()==string_2.length())
{
  System.out.println("The length of the two strings are the same");
}
else
{
  System.out.println("The length of the two strings is not the same");
}
if(string_1.equals(string_2))
{
  System.out.println("Two strings are equal");
}
else
{
  System.out.println("Two strings are not equal");
}
}

}

