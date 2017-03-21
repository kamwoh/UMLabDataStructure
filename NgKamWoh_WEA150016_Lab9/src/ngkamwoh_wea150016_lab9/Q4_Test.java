
package ngkamwoh_wea150016_lab9;


public class Q4_Test {

    public static void main(String[] args)
    {
        System.out.println("ABCBA "+isPalindrome("ABCBA"));
        System.out.println("ABCDEDCBA "+isPalindrome("ABCDEDCBA"));
        System.out.println("AABBAA "+isPalindrome("AABBAA"));
        System.out.println("ABABAB "+isPalindrome("ABABAB"));
        System.out.println("123454321 "+isPalindrome("123454321"));
        System.out.println("1234554321 "+isPalindrome("1234554321"));
        System.out.println("123456 "+isPalindrome("123456"));
        System.out.println("12345 "+isPalindrome("12345"));
    }
    
    public static boolean isPalindrome(String s)
    {
        MyStack<Character> ms = new MyStack<>();
        for(int i=0;i<s.length();i++)
        {
            ms.push(s.charAt(i));
        }
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            s1+=ms.pop();
        }
        return s.equals(s1);
    }
    
}
