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
        return String.format("Prawdziwe rozszerzenie zbadanego pliku to: %s rozszerenie nazwy pliku to: %s", realExtension, fileNameExtension);
    }
}
