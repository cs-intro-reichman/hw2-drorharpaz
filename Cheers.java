// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String word1 = args[0].toUpperCase();
            String word2 = word1;
            int num = Integer.parseInt(args[1]);
            int counter = 0;

            while (word2.length() > 0) {
                if (word2.charAt(0) == 'A'||
                    word2.charAt(0) == 'E'||
                    word2.charAt(0) == 'F'||
                    word2.charAt(0) == 'H'||
                    word2.charAt(0) == 'I'||
                    word2.charAt(0) == 'L'||
                    word2.charAt(0) == 'M'||
                    word2.charAt(0) == 'N'||
                    word2.charAt(0) == 'O'||
                    word2.charAt(0) == 'R'||
                    word2.charAt(0) == 'S'||
                    word2.charAt(0) == 'X') {
                        System.out.println("Give me an " + word2.charAt(0) + ": " + word2.charAt(0) + "!");
                        
                } else { System.out.println("Give me a  " + word2.charAt(0) + ": " + word2.charAt(0) + "!");}
                word2 = word2.replaceFirst("" + word2.charAt(0),"");
            }

            System.out.println("What does that spell?");
            
            while (counter < num) {
                System.out.println(word1 + "!!!");
                counter ++;
            }
        }
}
