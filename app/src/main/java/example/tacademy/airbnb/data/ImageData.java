package example.tacademy.airbnb.data;

import java.io.Serializable;

/**
 * Created by Kwak on 2016-08-14.
 */
public class ImageData implements Serializable{

    private int imageId;
    private String imageName;


    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}
