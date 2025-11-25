package com.image;


import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;


public class CustomImageToPixel {
    static String finalWord = "";
    public static void main(String[] args) {
        try {
            // Load the image
            File file = new File("Custom_random_image.png"); // Replace with your image path

            BufferedImage image = ImageIO.read(file);

            int width = image.getWidth();
            int height = image.getHeight();


            // Loop through each pixel
            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    int pixel = image.getRGB(x, y);

                    // Extract ARGB components
                    int alpha = (pixel >> 24) & 0xff;
                    int red = (pixel >> 16) & 0xff;
                    int green = (pixel >> 8) & 0xff;
                    int blue = pixel & 0xff;

                    finalWord = finalWord + getCharfromASCII(red) != null ? String.valueOf(getCharfromASCII(red)) : "";


                    finalWord = finalWord + getCharfromASCII(green) != null ? String.valueOf(getCharfromASCII(green)) : "";
                    finalWord = finalWord + getCharfromASCII(blue) != null ? String.valueOf(getCharfromASCII(blue)) : "";
                    /*if (finalWord.length() > 100) {
                        // Print the ARGB values

                        System.out.printf("Pixel at (%d,%d): ARGB(%d,%d,%d,%d)%n", x, y, alpha, red, green, blue);
                    }*/
                }
            }
        }
        catch(Exception e){
                e.printStackTrace();
            }
        System.out.println("The final word is : "+finalWord);
        }

    public static Character getCharfromASCII(int ascii) {
        if (ascii==0) return null;
        return (char) ascii;
    }

   /*     public String tCharfromASCII(int ascii) {
            if (ascii==0) return null;
            return (char) ascii;
        }*/

}



