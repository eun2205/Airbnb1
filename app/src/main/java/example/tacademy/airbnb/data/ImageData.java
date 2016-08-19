package example.tacademy.airbnb.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tacademy on 2016-08-19.
 */
public class ImageData {
    private String Imageid;

    public String getImageid() {
        return Imageid;
    }

    public void setImageid(String imageid) {
        Imageid = imageid;
    }
    private List<ImageData> imageData = new ArrayList<>();

    public List<ImageData> getImageData() {
        return imageData;
    }

    public void setImageData(List<ImageData> imageData) {
        this.imageData = imageData;
    }
}
