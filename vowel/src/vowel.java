import java.util.Scanner;
public class vowel {
    public static void vowel(String word){
        for(int i=0; i<= word.length(); i++ ){
            char c = word.charAt( i );
            if( (c>='a' && c<='z') || (c>='A' && c<='Z')){
                if(c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c =='o'
                        || c=='O' || c == 'u' || c == 'U'){
                    System.out.println (c + " is a vowel");
                }else{
                    System.out.println (c + " is a consonant");
                }
            }else{
                System.out.println ("This is not a letter");
            }
        }
        return;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        vowel (word);
        return;
    }
}
