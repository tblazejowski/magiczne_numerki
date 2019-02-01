package pl.falcor.magiczne_numerki;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URLConnection;

class BinaryExtensionChecker {

    Extension validate(BufferedInputStream fileInputStream) {
        String extension = null;
        try {
            extension = URLConnection.guessContentTypeFromStream(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Extension.parseGuessedContentType(extension);
    }
}