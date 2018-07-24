package com.siit.oraseanu.ImageProc;

import java.io.IOException;
import java.util.Scanner;

public class MainImageProcessing {

    public static void main(String[] args) throws IOException {
        MyImageProcessor myImageProcessor = new MyImageProcessor();
        String path = "D:\\SIIT\\";
        String imageName = "img";
        String extension = ".jpg";

        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to do?\n - Rotate image 90 CW (1)\n - Rotate image 270 CW(2) ");
        int i;
        i = scanner.nextInt();
        if (i == 1) {
            myImageProcessor.Rotate90CW(path, imageName, extension);
            System.out.println("image rotated 90CW");
        } else if (i==2){
            myImageProcessor.Rotate270CW(path, imageName, extension);
            System.out.println("image rotated 270CW");
        }



    }
}



