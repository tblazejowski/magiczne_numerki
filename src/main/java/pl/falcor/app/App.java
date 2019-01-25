package pl.falcor.app;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {

        if (args.length == 0) {
            System.err.println("Nie podano ścieżki pliku.");
            return;
        }
        FileLoader fileLoader = new FileLoader(args[0]);
        ExtensionChecker extensionChecker = new ExtensionChecker(fileLoader.loadFile());
        InspectionResult inspectionResult = new InspectionResult(extensionChecker.verify(), fileLoader.getExtension());
        System.out.println(inspectionResult.toString());
    }
}