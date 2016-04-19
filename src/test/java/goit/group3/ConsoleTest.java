package test.java.goit.group3;

import org.junit.*;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by home on 19.04.2016.
 */
public class ConsoleTest {
    @BeforeClass
    public static void runOnlyOnce() throws FileNotFoundException{
      BufferedInputStream  in = new BufferedInputStream(new FileInputStream("testInput.txt"));
    }



}
