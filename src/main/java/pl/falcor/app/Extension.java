package pl.falcor.app;

enum Extension {

    JPEG("image/jpeg"), GIF("image/gif"), TXT("txt"), UNKNOWN("unknown");

    private final String content;

    Extension(String content) {
        this.content = content;
    }
}