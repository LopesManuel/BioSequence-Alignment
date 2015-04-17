import java.util.*;
import java.io.*;
import java.math.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



class Alinhamento_Global_S {
    

    static int[][] fMatrix;
    static String x, y;
    
    public static void main(String args[]) {
    	String currentDir = System.getProperty("user.dir") + "/";
    	Path arg1 = Paths.get( currentDir + args[0] );
    	Path arg2 = Paths.get( currentDir + args[1] );
    	x = readFile(arg1);
    	y = readFile(arg2);

    	fMatrix =new int[x.length()+1][y.length()+1];
        
    }	
    
    public static String readFile(Path file){
    	String temp = "";
		Charset charset = Charset.forName("US-ASCII");
		try (BufferedReader reader = Files.newBufferedReader(file, charset)) {
			String line = reader.readLine(); // ignores the first line
			while ((line = reader.readLine()) != null) {
				temp = temp.concat(line);
			}
		    } catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}
		return temp;
    }
    
    /*********************************************
     *******  Needleman–Wunsch algorithm  ********
     *********************************************
     * +1  Match: The two letters are the same
     * -1  Mismatch: The two letters are differential
     * -1  Indel (INsertion or DELetion) : One letter aligns to a gap in the other string.
     **/
    
    public static int needlemanWunsch(){
		return 0;
    	
    }
    
  
}
    
