package pl.falcor.magiczne_numerki;

import java.io.BufferedInputStream;
import java.io.IOException;

class TextExtensionChecker {

    Extension validate(BufferedInputStream fileInputStream) {
        boolean isText = true;
        byte[] bytes = new byte[25];
        try {
            fileInputStream.read(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (byte b : bytes) {
            if (!Character.isLetterOrDigit((char) b) && b < 0) isText = false;
        }
        return isText ? Extension.TXT : Extension.UNKNOWN;
    }
}