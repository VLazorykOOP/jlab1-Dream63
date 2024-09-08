import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {
    
        // initialization
        String specCharacters = "[ ,\\.:;'?=()!\\[\\]-]+";
        Scanner console = new Scanner (System.in);
        int maxNumOfCharacterInWord = 0;
        String str = "In condimentum, tortor vel porttitor rhoncus, est ante commodo risus, a molestie massa arcu sed leo. Quisque non diam et.";
        System.out.println("My string: " + str);

        // input from keyboard
        System.out.print("Vvedit character: ");
        String n = console.nextLine();

        // looking for max enters of selected char in string
        int numOfCharacterInWord = 0;
        for (char c : str.toCharArray()) {

            if (c == n.toCharArray()[0]) 
                numOfCharacterInWord++;
            if(numOfCharacterInWord > maxNumOfCharacterInWord) 
                maxNumOfCharacterInWord = numOfCharacterInWord;
            if(c == ' ')
            numOfCharacterInWord = 0;   
        } 

        System.out.println("Words with most of selected characters: ");

        // looking for words that contain max amount of selected character
        for (String str1 : str.split(specCharacters)) {
            int numOfCharacterInWord1 = 0;

            for (char c : str1.toCharArray()) 
                if (c == n.toCharArray()[0]) 
                    numOfCharacterInWord1++;

            if(numOfCharacterInWord1 == maxNumOfCharacterInWord) 
                System.out.print(str1 + " ");
        }
        console.close();
    }
}
