import java.util.Locale;

public class WordWrapper {
    private String word;

    public WordWrapper(String input){
        this.word = input;
    }

    public String sandwich(){
        return word.toUpperCase() + word.toUpperCase() + word.toUpperCase();
    }

    public String toString(){
        return word + word.length();
    }

    public boolean isPal(){
        int i = 0;
        int s = word.length()-1;

        while(i<s) {
            if (word.charAt(i) != word.charAt(s))
                return false;
            i++;
            s--;
        }
        return true;
    }

    public static void main(String[] args) {
        WordWrapper wordw = new WordWrapper(args[0]);

        System.out.println(wordw.toString());
        System.out.println(wordw.sandwich());
        System.out.println(wordw.isPal());
    }
}

