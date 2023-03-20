//A Tokenizer class. This will be able to open up a file and parse the file into individual words.

import java.io.*;
import java.util.Scanner;

public class Tokenizer {

    private Scanner sc = null;
    private String file;
    private int num;

    public Tokenizer(String fileName) throws IOException { //Will accept the filename and open it
        this.file = fileName;
        this.num = 1;
        this.sc = new Scanner(new File(this.file)); //Scanner file
    }

    public Token next() { //looks at next word in file and adds it as token
        String word = sc.next();
        Token token = new Token(file, word, num); //creating token obj

        num++;
        return token;
    }
    public boolean hasNext() { //invoking the hasNext method within the scanner class
        return sc.hasNext();
    }
}
