package lesson06.hw;

public class StringHelper implements IStringHelper{

    @Override
    public boolean isPalindrome(String word){
        int left = 0;
        int right = word.length() - 1;
        while(left < right){
            if(word.toLowerCase().charAt(left) != word.toLowerCase().charAt(right)){
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
        for(char c = 'a'; c <= 'z'; c++){
            if(!sentence.contains(String.valueOf(c))){
                return false;
            }
        }
        return true;
    }
    @Override
    public String encrypt(String text) {
        StringBuilder encry = new StringBuilder();
        for(int i = 0; i < text.length();i++){
            encry.append( (char) (text.charAt(i) + 3));
        }
        return encry.toString();
    }
    @Override
    public String decrypt(String data){
        StringBuilder dencry = new StringBuilder();
        for(char i = 0; i < data.length();i++){
            dencry.append((char) (data.charAt(i) - 3));
        }
        return dencry.toString();
    }
    @Override
    public boolean isEmail(String text){
        if(!text.contains("@")){
                return false;
            }

        return true;
    }
    @Override
    public String reverse(String s) {
        String[] arr = s.split(" ");
        StringBuilder res = new StringBuilder();

        for (int i = arr.length - 1; i >= 0 ; i--){
            res.append(arr[i]);
            if (i > 0){
                res.append(" ");
            }
        }
        return res.toString();
    }
}
