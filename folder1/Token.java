import java.util.*;
/* You will create a concordance. A concordance is a book that gives you a
   listing of another book’s words and where they appear. You will implement such a thing as a
   class.
   You will write the following classes:
   A Token class. This will store information about a word and where it can be found within a file. */
public class Token {
    private String filename;
    private String word;
    private int num;

    public Token (String filename, String word, int num) { //Field setters
        this.filename = filename;
        this.word = word;
        this.num = num;
    }
    public String getFilename() {//File getter
        return this.filename;
    }
    public String getWord () { //word getter
        return this.word;
    }
    public int getNum() { //count getter
        return this.num;
    }
    public String toString () { //toString representation of a word token
        StringBuilder sb = new StringBuilder();
        sb.append("File: ").append(filename).append(", word -> ").append(word).append(", count-> ").append(num);

        return sb.toString();
    }
}
