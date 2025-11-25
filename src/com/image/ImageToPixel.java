package com.image;


import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;


public class ImageToPixel {

    public static void main(String[] args) {
        try {
            // Load the image
            File file = new File("C:\\Users\\mminda\\OneDrive - OpenText\\Pictures\\imagesm.jpg"); // Replace with your image path

            BufferedImage image = ImageIO.read(file);

            int width = image.getWidth();
            int height = image.getHeight();

            // Loop through each pixel
            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    int pixel = image.getRGB(x, y);

                    // Extract ARGB components
                    int alpha = (pixel >> 24) & 0xff;
                    int red   = (pixel >> 16) & 0xff;
                    int green = (pixel >> 8)  & 0xff;
                    int blue  = pixel & 0xff;

                    System.out.printf("Pixel at (%d,%d): ARGB(%d,%d,%d,%d)%n", x, y, alpha, red, green, blue);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
