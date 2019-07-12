package application;

import imageProcessing.ImageProcessor;

public class Application {

    private static final String IMAGE_PATH = "resources/sudoku.png";

    public static void main( String[] args ) {
        nu.pattern.OpenCV.loadLocally();
        ImageProcessor proc = new ImageProcessor();

        proc.processImage(IMAGE_PATH);
    }

}
