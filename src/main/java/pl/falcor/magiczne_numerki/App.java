package pl.falcor.magiczne_numerki;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {

        if (args.length == 0) {
            System.err.println("Nie podano ścieżki pliku.");
            return;
        }
        FileLoader fileLoader = new FileLoader(args[0]);
        InspectionResult inspectionResult =
                new InspectionResult(new ExtensionChecker(fileLoader.loadFile()).verify(), fileLoader.getExtension());
        System.out.println(inspectionResult.toString());
    }
}