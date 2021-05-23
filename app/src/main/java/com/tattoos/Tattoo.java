package com.tattoos;

import java.io.Serializable;

public class Tattoo implements Serializable {

    public Tattoo(int image, int description) {
        this.image = image;
        this.description = description;
    }

    int image;
    int description;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getDescription() {
        return description;
    }

    public void setDescription(int description) {
        this.description = description;
    }
}
