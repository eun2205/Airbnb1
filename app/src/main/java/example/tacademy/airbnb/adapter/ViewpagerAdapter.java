package example.tacademy.airbnb.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import example.tacademy.airbnb.data.ImageData;
import example.tacademy.airbnb.widget.ViewpagerView;

/**
 * Created by Tacademy on 2016-08-19.
 */
public class ViewpagerAdapter extends PagerAdapter {

    List<ImageData> items = new ArrayList<>();
    Context mContext;

    public ViewpagerAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public void add(ImageData imageData) {
        this.items = imageData.getImageData();
        notifyDataSetChanged();
    }

    List<ViewpagerView> scrapped = new ArrayList<>();

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ViewpagerView viewpagerView = null;
        if (scrapped.size() > 0) {
            viewpagerView=scrapped.remove(0);
        }else{
            viewpagerView = new ViewpagerView(mContext);
        }
        viewpagerView.setImageData
        return super.instantiateItem(container, position);
    }
}
