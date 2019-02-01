package pl.falcor.magiczne_numerki;

import java.io.BufferedInputStream;

class ExtensionChecker {

    private final BufferedInputStream fileInputStream;
    private final BinaryExtensionChecker binaryExtensionChecker = new BinaryExtensionChecker();
    private final TextExtensionChecker textExtensionChecker = new TextExtensionChecker();

    ExtensionChecker(BufferedInputStream fileInputStream) {
        this.fileInputStream = fileInputStream;
    }

    Extension verify() {
        Extension result = binaryExtensionChecker.validate(fileInputStream);
        return result.equals(Extension.UNKNOWN) ? textExtensionChecker.validate(fileInputStream) : result;
    }


}