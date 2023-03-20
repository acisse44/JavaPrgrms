/*A Concordance class. This will have a Map<String, List<Token>> as the underlying structure
(i.e. you will map a word to a list of Tokens representing where that word can be found).
You will need the following methods:
add(). This opens up a file and adds all Tokens to the map.
a toString() method that creates a String representation of the Concordance.
a method called count() that returns how many times a String occurs. */
import java.io.*;
import java.util.*;
public class Concordance {
    private Map<String, List<Token>> myMap = new HashMap<>();
    public void add(String filename) throws IOException {
        Tokenizer tokenizer = new Tokenizer(filename);
        List<Token> tokenList = null;
        while (tokenizer.hasNext()) {//If there are words in my file
            Token tk = tokenizer.next();
            String token = tk.getWord(); //Retrieves the word as a string
            if (myMap.containsKey(token)) { //Check if there is a key assoc. w/ the token
                tokenList = myMap.get(token); //Get the value for the key
            } else {
                tokenList = new ArrayList<>(); //else make a new list
            }
            tokenList.add(tk); //add onto my list of tokens

            myMap.put(token, tokenList); //add the pair into my map
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(String word: myMap.keySet()){ //creating a set view of our keys
            sb.append("\nThe word ").append(word).append(" is in token: ");
            List<String> tokens = new ArrayList<>();
            for(Token token: myMap.get(word)){ //for every token in our values
                tokens.add(token.toString()); //add it to our array list of tokens
            }
            sb.append(tokens); //build the string
        }
        return sb.toString(); //return our string
    }

    public int count (){
        return myMap.size();

    }
}
