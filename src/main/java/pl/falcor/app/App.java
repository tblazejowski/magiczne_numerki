package pl.falcor.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URLConnection;

public class App {

    public static void main(String[] args) throws IOException {

        FileLoader fileLoader = new FileLoader("/home/tomasz/Pobrane/20190102_084740.jpg");
        ExtensionChecker extensionChecker = new ExtensionChecker(fileLoader.loadFile());
        System.out.println(URLConnection.guessContentTypeFromStream(new FileInputStream("/home/tomasz/Pobrane/20190102_084740.jpg")));
        System.out.println(extensionChecker.verify());
    }
}
