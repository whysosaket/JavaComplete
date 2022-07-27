import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) {
        /*
        *  FileRead = reads the content of a file one by one char by char
        *             read() returns an int value which contains the byte value
        *               HENCE WE NEED TO CAST THIS ALL IN A CHARACTER VALUE
        *             when read returns -1, there is no more data to be read
        *             hence, we can close this with a while loop
        */
        try {
            FileReader reader = new FileReader("saket.txt");
            int data= reader.read();
            while(data != -1){
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
