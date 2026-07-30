package lesson07.hw;

public class fuct implements IStringHelper {

    @Override
    public boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.toLowerCase().charAt(left) != word.toLowerCase().charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    @Override
    public boolean isPangram(String sentence) {
        sentence = sentence.toLowerCase();
        for (char c = 'a'; c <= 'z'; c++) {
            if (!sentence.contains(sentence.valueOf(c))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String encrypt(String text) {
        StringBuilder encry = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            encry.append((char) (text.charAt(i) + 3));
        }
        return encry.toString();
    }

    @Override
    public String decrypt(String data) {
        StringBuilder dencry = new StringBuilder();
        for (char i = 0; i < data.length(); i++) {
            dencry.append((char) (data.charAt(i) - 3));
        }
        return dencry.toString();
    }

    @Override
    public boolean isEmail(String text) {
        if (!text.contains("@")) {
            return false;
        }

        return true;
    }

    @Override
    public String wordReverse(String s) {
        String[] arr = s.split(" ");
        StringBuilder res = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {
            res.append(arr[i]);
            if (i > 0) {
                res.append(" ");
            }
        }
        return res.toString();
    }

    @Override
    public String reverse(String s) {
        StringBuilder arr = new StringBuilder(s);
        return arr.reverse().toString();
    }

    public int countOccurencies(String text, char letter) {
        int count = 0;
        for (int i = 0 ; i < text.length() ; i++){
            if (text.charAt(i) == letter){
                count++;
            }
        }
        return count;
    }
    public String toCamelCase(String s){

        String[] arr = s.split(" ");

        StringBuilder a = new StringBuilder(arr[0]);

        for (int i = 1 ; i <arr.length ; i++){

            a.append(Character.toUpperCase(arr[i].charAt(0)));
            a.append(arr[i].substring(1));
        }

        return a.toString();
    }
    public byte[] parseIp(String ip){
        String[] arr = ip.split("\\.");
        if (arr.length != 4){
            return null;
        }
        byte[] b = new byte[4];
        for (int i = 0; i < 4; i++){
            int num = Integer.parseInt(arr[i]);

            if (num > 255 || num < 0){
                return null;
            }
            b[i] = (byte) num;
        }
        return b;
    }
}

