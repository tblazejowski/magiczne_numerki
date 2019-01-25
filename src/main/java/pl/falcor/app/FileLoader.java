package pl.falcor.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class FileLoader {

    private FileInputStream fileInputStream;
    private final String filePath;

    FileLoader(String path) {
        this.filePath = path;
    }

    FileInputStream loadFile() throws FileNotFoundException {
        this.fileInputStream = new FileInputStream(this.filePath);
        return this.fileInputStream;
    }

    void close() throws IOException {
        this.fileInputStream.close();
    }
}