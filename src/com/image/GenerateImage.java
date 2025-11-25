package com.image;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.Random;

public class GenerateImage {
    public static void main(String[] args) {
        int width = 100;
        int height = 100;

        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Random rand = new Random();

        // Fill image with random colors
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int r = rand.nextInt(256);
                int g = rand.nextInt(256);
                int b = rand.nextInt(256);
                Color color = new Color(r, g, b);
                image.setRGB(x, y, color.getRGB());
            }
        }

        // Save the image to a file
        try {
            File output = new File("C:\\Users\\mminda\\OneDrive - OpenText\\Pictures\\random_image.png");
            ImageIO.write(image, "png", output);
            System.out.println("Image saved as 'random_image.png'");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
