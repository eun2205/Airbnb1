package example.tacademy.airbnb.data;

import android.graphics.drawable.Drawable;

/**
 * Created by Kwak on 2016-08-15.
 */
public class HostCommend {
    private Drawable image;
    private String recomendText;


    public String getRecomendText() {
        return recomendText;
    }

    public void setRecomendText(String recomendText) {
        this.recomendText = recomendText;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }
}
