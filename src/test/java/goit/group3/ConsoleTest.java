package test.java.goit.group3;

import org.junit.BeforeClass;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class ConsoleTest {
    @BeforeClass
    public static void runOnlyOnce() throws FileNotFoundException{
      BufferedInputStream  in = new BufferedInputStream(new FileInputStream("testInput.txt"));
    }



}
