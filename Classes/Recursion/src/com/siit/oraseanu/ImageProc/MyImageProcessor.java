package com.siit.oraseanu.ImageProc;

import org.imgscalr.Scalr;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MyImageProcessor {

    public void Rotate90CW(String path, String imageName, String extension)throws IOException {

        File f = new File(path + imageName + extension);
        BufferedImage img = ImageIO.read(f);

        BufferedImage rotateImage = Scalr.rotate(img, Scalr.Rotation.CW_90);

        File fRotated = new File(path + imageName +  "-r90CW" + extension);
        ImageIO.write(rotateImage, "jpg", fRotated);
    }

    public void Rotate270CW(String path, String imageName, String extension)throws IOException {

        File f = new File(path + imageName + extension);
        BufferedImage img = ImageIO.read(f);

        BufferedImage rotateImage = Scalr.rotate(img, Scalr.Rotation.CW_270);

        File fRotated = new File(path + imageName +  "-r180CW" + extension);
        ImageIO.write(rotateImage, "jpg", fRotated);
    }
}
