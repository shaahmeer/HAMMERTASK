package com.example.hammertaskapp.View;

public class DataModel {


    int image;
    String Heading,Description;

    public DataModel(int image, String heading, String description) {
        this.image = image;
        Heading = heading;
        Description = description;
    }



    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getHeading() {
        return Heading;
    }

    public void setHeading(String heading) {
        Heading = heading;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
