package pl.falcor.app;

enum Extension {

    JPEG("image/jpeg"), JPG("image/jpeg"),
    GIF("image/gif"),
    TXT("txt"),
    UNKNOWN("unknown");

    private final String contentType;

    Extension(String contentType) {
        this.contentType = contentType;
    }

    public static Extension parseGuessedContentType(String contentType) {
        for (Extension extension : Extension.values()) {
            if (extension.contentType.equals(contentType)) return extension;
        }
        return Extension.UNKNOWN;
    }
}