package pl.falcor.app;

class InspectionResult {

    private final Extension realExtension;
    private final Extension fileNameExtension;

    InspectionResult(Extension realExtension, Extension fileNameExtension) {

        this.realExtension = realExtension;
        this.fileNameExtension = fileNameExtension;
    }

    @Override
    public String toString() {
        return String.format("Rozszerzenie w nazwie podanego pliku to %s, wynikające z inspekcji rozszerzenie pliku to: %s%n", fileNameExtension, realExtension);
    }
}
