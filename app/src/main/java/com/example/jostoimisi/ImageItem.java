package com.example.jostoimisi;

public class ImageItem {
    private int imageResource;
    private String imageName;

    public ImageItem(int imageResource, String imageName) {
        this.imageResource = imageResource;
        this.imageName = imageName;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getImageName() {
        return imageName;
    }
}
