package pl.falcor.app;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {

        FileLoader fileLoader = new FileLoader("/home/tomasz/Pobrane/test.txt");
        ExtensionChecker extensionChecker = new ExtensionChecker(fileLoader.loadFile());
        System.out.println(extensionChecker.verify());
    }
}