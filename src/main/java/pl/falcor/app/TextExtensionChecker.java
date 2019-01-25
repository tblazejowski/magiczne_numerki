package pl.falcor.app;

import java.io.FileInputStream;
import java.io.IOException;

class TextExtensionChecker {

    Extension validate(FileInputStream fileInputStream) {
        boolean isText = true;
        byte[] bytes = new byte[25];
        try {
            fileInputStream.read(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (byte b : bytes) {
            if (b < 0) isText = false;
        }
        return isText ? Extension.TXT : Extension.UNKNOWN;
    }
}