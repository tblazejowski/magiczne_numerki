package pl.falcor.app;

import java.io.FileInputStream;

class ExtensionChecker {

    private final FileInputStream fileInputStream;
    private final BinaryExtensionChecker binaryExtensionChecker = new BinaryExtensionChecker();
    private final TextExtensionChecker textExtensionChecker = new TextExtensionChecker();

    ExtensionChecker(FileInputStream fileInputStream) {
        this.fileInputStream = fileInputStream;
    }

    Extension verify() {
        Extension result = binaryExtensionChecker.validate(fileInputStream);
        return result.equals(Extension.UNKNOWN) ? textExtensionChecker.validate(fileInputStream) : result;
    }


}