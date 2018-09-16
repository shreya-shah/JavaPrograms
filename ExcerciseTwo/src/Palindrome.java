public class Palindrome {
    public Boolean isPalindrome(String input){
        if(input == null){
            return null;
        }

        String reverse = "";
        boolean isPalindrome;
        char[] letters = input.toCharArray();

        for(int i=letters.length-1;i>=0;i--){
            reverse += letters[i];
        }

        if(input.equals(reverse)){
            System.out.println("Input is a palindrome");
            isPalindrome = true;
        }else{
            System.out.println("Input is not a palindrome ");
            isPalindrome = false;
        }

        return isPalindrome;
    }
}
