package imageProcessing;


import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;

import static org.bytedeco.opencv.global.opencv_imgproc.CV_THRESH_OTSU;
import static org.opencv.imgcodecs.Imgcodecs.imread;

public class ImageProcessor {



    public Mat processImage(String imagePath) {
        Mat grayscale = convertImageToGrayscale(imagePath);
        Mat binary = convertGrayscaleToBinary(grayscale);

        return invertImageColor(binary);
    }

    private Mat convertImageToGrayscale(String imagePath) {
        Mat image = imread(imagePath);
        Mat grayscale = new Mat();

        Imgproc.cvtColor(image, grayscale, Imgproc.COLOR_RGB2GRAY);
        //imwrite("./resources/grayscale.jpg", grayscale);

        return grayscale;
    }

    private Mat convertGrayscaleToBinary(Mat grayscale) {
        Mat binaryImage = new Mat();

        Imgproc.threshold(grayscale, binaryImage, 0, 255, CV_THRESH_OTSU);
        //imwrite("./resources/binary.jpg", binaryImage);

        return binaryImage;
    }

    private Mat invertImageColor(Mat binary) {
        Mat invertedImage = new Mat();

        Core.bitwise_not(binary, invertedImage);
        //imwrite("./resources/inverted.jpg", invertedImage);

        return invertedImage;
    }

}