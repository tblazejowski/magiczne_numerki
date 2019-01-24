package pl.falcor.app;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class App {

    public static void main(String[] args) throws FileNotFoundException {

        FileLoader fileLoader = new FileLoader("/home/tomasz/Exercise/file.txt");
        InputStream is = fileLoader.loadFile();

    }
}
