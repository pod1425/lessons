package lesson06.hw;
public class Main01 {
    static public void main(String[] args){
        StringHelper helper = new StringHelper();
        String s = "ABa";
        System.out.println(helper.isPalindrome(s));
        s = "asdfghjk";
        System.out.println(helper.isPangram(s));
        s = helper.encrypt("hello world");
        System.out.println(s);
        System.out.println(helper.decrypt(s));
        s = "vlad@gmail.com";
        System.out.println(helper.isEmail(s));
        s = "hello wolrd";
        System.out.println(helper.reverse(s));
    }
}