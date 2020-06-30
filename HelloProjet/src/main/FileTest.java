package main;

import org.junit.Test;

import java.io.File;

public class FileTest {
    @Test
    public void test01(){
        System.out.println(File.pathSeparator);
        System.out.println(File.pathSeparatorChar);
        System.out.println(File.separator);
        System.out.println(File.separatorChar);
    }
}
