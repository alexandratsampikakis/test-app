package com.example.android_test_app.models;

public class Article {

    private int imagePath;
    private String text;
    private String title;
    private String ingress;

    public Article(
            int imageUrl,
            String title,
            String ingress,
            String text) {

        this.imagePath = imageUrl;
        this.title = title;
        this.text = text;
        this.ingress = ingress;
    }

    /**
     *
     * @return -1 if no image.
     */
    public int getImagePath() {
        return imagePath;
    }

    public String getText() {
        return text;
    }

    public String getTitle() {
        return title;
    }

    public String getIngress() {
        return ingress;
    }
}
