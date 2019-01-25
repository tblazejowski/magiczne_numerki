package pl.falcor.app;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class FileLoader {

    private BufferedInputStream fileInputStream;
    private final String filePath;

    FileLoader(String path) {
        this.filePath = path;
    }

    BufferedInputStream loadFile() throws FileNotFoundException {
        this.fileInputStream = new BufferedInputStream(new FileInputStream(this.filePath));
        return this.fileInputStream;
    }

    void close() throws IOException {
        this.fileInputStream.close();
    }

    Extension getExtension() {
        try {
            return Extension.valueOf(filePath.substring(filePath.lastIndexOf('.') + 1).toUpperCase());
        } catch (Exception exception) {
            return Extension.UNKNOWN;
        }
    }
}