package lesson07.hw;

import java.util.Arrays;

public class Main01 {
    static public void main(String[] args){
        fuct fuct = new fuct();
        String s = "ABa";
        System.out.println(fuct.isPalindrome(s));
        s = "asdfghjk";
        System.out.println(fuct.isPangram(s));
        s = fuct.encrypt("hello world");
        System.out.println(s);
        System.out.println(fuct.decrypt(s));
        s = "vlad@gmail.com";
        System.out.println(fuct.isEmail(s));
        s = "hello wolrd";
        System.out.println(fuct.wordReverse(s));
        System.out.println(fuct.reverse(s));
        System.out.println(fuct.countOccurencies(s, 'l'));
        System.out.println(fuct.toCamelCase(s));
        s = "123.1.23.5";
        System.out.println(Arrays.toString(fuct.parseIp(s)));


    }
}