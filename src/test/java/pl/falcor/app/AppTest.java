package pl.falcor.app;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;

public class AppTest {

    @Test
    public void shouldConfirmTextFileIsATextFile() throws FileNotFoundException {
        FileLoader fileLoader = new FileLoader("src/test/resources/testTXT.txt");
        ExtensionChecker extensionChecker = new ExtensionChecker(fileLoader.loadFile());

        Extension verifiedExtension = extensionChecker.verify();

        Assert.assertEquals(Extension.TXT, verifiedExtension);
    }

    @Test
    public void shouldConfirmGIFTypeFileIsAGIFFile() throws FileNotFoundException {
        FileLoader fileLoader = new FileLoader("src/test/resources/testGIF.gif");
        ExtensionChecker extensionChecker = new ExtensionChecker(fileLoader.loadFile());

        Extension verifiedExtension = extensionChecker.verify();

        Assert.assertEquals(Extension.GIF, verifiedExtension);
    }

    @Test
    public void shouldConfirmJPGTypeFileWithIncorrectTXTExtensionIsInFactJPEGFile() throws FileNotFoundException {
        FileLoader fileLoader = new FileLoader("src/test/resources/testJPEG.txt");
        ExtensionChecker extensionChecker = new ExtensionChecker(fileLoader.loadFile());

        Extension verifiedExtension = extensionChecker.verify();

        Assert.assertEquals(Extension.JPEG, verifiedExtension);
    }

    @Test
    public void shouldConfirmEmptyFileIsATextFile() throws FileNotFoundException {
        FileLoader fileLoader = new FileLoader("src/test/resources/testEmpty.txt");
        ExtensionChecker extensionChecker = new ExtensionChecker(fileLoader.loadFile());

        Extension verifiedExtension = extensionChecker.verify();

        Assert.assertEquals(Extension.TXT, verifiedExtension);
    }
}
