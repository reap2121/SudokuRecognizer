package application;

import imageProcessing.ImageProcessor;
import org.opencv.core.Core;

public class Application {

    public static void main( String[] args ) {
        nu.pattern.OpenCV.loadLocally();
        ImageProcessor proc = new ImageProcessor();

        proc.test();
    }

}
