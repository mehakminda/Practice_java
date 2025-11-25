package com.image;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.Random;

public class CustomGenerateImage {
    static int  i;
    public static void main(String[] args) {
        int width = 100;
        int height = 100;

        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Random rand = new Random();
        String a="MehakMinda";
        for (Character ch : a.toCharArray()) {
            int ascii = (int) ch;
            System.out.println("Character: '" + ch + "' ASCII: " + ascii);
        }

        int i=0;
        // Fill image with random colors
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                int r = nextASCII(a);
                int g = nextASCII(a);
                int b = nextASCII(a);
                Color color = new Color(r, g, b);
                image.setRGB(x, y, color.getRGB());
            }
        }

        // Save the image to a file
        try {
            File output = new File("Custom_random_image.png");
            ImageIO.write(image, "png", output);
            System.out.println("Image saved as 'random_image.png'");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static int nextASCII(String a){
        if(i==a.length()){
            return 0;
        }
        char ch = a.charAt(i);
        int ascii = (int) ch;
        i++;
        return ascii;
    }
}
