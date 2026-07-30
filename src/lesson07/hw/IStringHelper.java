package lesson07.hw;
public interface IStringHelper {

    /**
     * Checks if a string is a palindrome (reads same both ways)
     * @param word word to be checked
     * @return true if word is palindrome and false if its not
     */
    boolean isPalindrome(String word);

    /**
     * Checks if given string is a pangram.
     *
     * Pangram is a sentence that contains all 26 alphabet letters
     * The example of pangram: The quick brown fox jumps over the lazy dog
     * @param sentence sentence to be checked
     * @return true if word is pangram and false if its not
     */
    boolean isPangram(String sentence);

    /**
     * Parses IP adress passed as string into array of bytes.
     *
     * This method first checks whether this ip is valid using regex.
     * Then it parses the numbers and checks if numbers are in range of 0 to 255
     * Only after those checks it returns ip as array of 4 byte values
     * If any of those checks fail, it returns null instead
     * @param ip - IP in string representations
     * @return array of 4 bytes with ip numbers or null if input string format is invalid
     */
    byte[] parseIp(String ip);

    /**
     * Encrypts string into text that cant be read easily by human.
     * You may use any of encryption methods, or use suggested method.
     *
     * Suggested method: add some constant value to every char in a string,
     * as a result, padding all letters in ASCII table to the right
     *
     * Additional task: apply a mask to your encryption to make it even harder to read
     * Mask is some kind of pattern that is used when encrypting, instead of
     * plain additions
     * For example, it is when you pad every first letter by 2, every second letter by 3 and every third letter by 4
     * @param text text to encrypt
     * @return encrypted data
     */
    String encrypt(String text);

    /**
     * Does exactly the opposite to what encrypt() method does.
     * Takes encrypted data and turns it into readable text
     * @param data encrypted data
     * @return text that was there before encryption
     */
    String decrypt(String data);

    /**
     * Counts how many times given char occures in a text
     * @param text text to count chars in
     * @param letter char to be counted
     * @return total count of given chars
     */
    int countOccurencies(String text, char letter);

    /**
     * Checks if passed text is an email using regex
     * @param text text to be checked
     * @return true if text is an email, false if its not
     */
    boolean isEmail(String text);

    /**
     * Reverses a string.
     * For example, for input "Hello world" it should produce "dlrow olleH"
     * @param s string to reverse
     * @return reversed string
     */
    String reverse(String s);

    /**
     * Reverses order of words in a string.
     * For example, for input "Hello world" it should produce "world Hello"
     * @param s string to reverse word order in
     * @return string with words in reverse order
     */
    String wordReverse(String s);

    /**
     * Translates sentence to camel case identifier.
     * For input "What a BEAUTIFUL day!" it should produce "whatABeautifulDay"
     * @param s string to translate
     * @return camelCase style string
     */
    String toCamelCase(String s);
}