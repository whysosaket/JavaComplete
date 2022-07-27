import java.io.File;

public class FIleClass {
    public static void main(String[] args) {
        File file= new File("file.txt");
        if(file.exists()){
            System.out.println("The file exists");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());              //to check if a file is a file and not a folder
            //file.delete();                                //this is going to delete the specified file
        }
        else System.out.println("The file doesn't exist");



    }
}
