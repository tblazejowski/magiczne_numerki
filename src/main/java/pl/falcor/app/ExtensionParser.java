package pl.falcor.app;

class ExtensionParser {

    private static final char DELIMITER = '/';

    static Extension parse(String name) {
        Extension extension;
        try {
            extension = Extension.valueOf(name.substring(name.lastIndexOf(DELIMITER) + 1).toUpperCase());
        } catch (Exception exception) {
            return Extension.UNKNOWN;
        }
        return extension;
    }
}
