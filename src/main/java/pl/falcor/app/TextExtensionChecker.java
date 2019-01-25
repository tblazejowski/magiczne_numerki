package pl.falcor.app;

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
            System.out.println(b);
            if (b < 0) isText = false;
        }
        return isText ? Extension.TXT : Extension.UNKNOWN;
    }
}