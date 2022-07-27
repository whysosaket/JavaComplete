import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("Poem.txt");
            writer.write("Hello I Am Saket \nI am here in India, In Bihar");        //writes to the file
            writer.append("\nHello Again, this is form a different line");              //we can add new text
            writer.append("\nThis is soo cool");
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
