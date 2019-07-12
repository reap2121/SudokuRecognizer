package imageProcessing;


import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;

import static org.opencv.imgcodecs.Imgcodecs.imread;
import static org.opencv.imgcodecs.Imgcodecs.imwrite;

public class ImageProcessor {

    private final String IMAGE_PATH = "resources/sudoku.png";

    public void test(){

        Mat image = imread(IMAGE_PATH);
        Mat grayscale = new Mat();

        Imgproc.cvtColor(image, grayscale, Imgproc.COLOR_RGB2GRAY);

        imwrite("./resources/grayscale.jpg", grayscale);


    }

}