package pl.falcor.app;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLConnection;

public class ExtensionChecker {

    private final FileInputStream fileInputStream;

    public ExtensionChecker(FileInputStream fileInputStream) {
        this.fileInputStream = fileInputStream;
    }

    String verify() {
        String extension = null;
        try {
            extension = URLConnection.guessContentTypeFromStream(new BufferedInputStream(fileInputStream));
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (extension == null) {
            determineContent();
        }

        return extension;
    }

    private void determineContent() {

    }
}
