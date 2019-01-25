package pl.falcor.app;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLConnection;

class BinaryExtensionChecker {

    Extension validate(FileInputStream fileInputStream) {
        String extension = null;
        try {
            extension = URLConnection.guessContentTypeFromStream(new BufferedInputStream(fileInputStream));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ExtensionParser.parse(extension);
    }
}