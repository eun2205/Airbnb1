package example.tacademy.airbnb.widget;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import example.tacademy.airbnb.R;
import example.tacademy.airbnb.adapter.GuidePagerAdapter;
import example.tacademy.airbnb.data.ImageDatas;

/**
 * Created by Kwak on 2016-08-19.
 */
public class GuideSliderViewHolder extends RecyclerView.ViewHolder {
    ViewPager pager;
    GuidePagerAdapter mAdapter;
    ImageDatas imageData;
    Context context;

    public GuideSliderViewHolder(View itemView, Context context) {
        super(itemView);
        this.context = context;
        pager = (ViewPager)itemView.findViewById(R.id.pager);
        pager.setClipToPadding(false);
        mAdapter = new GuidePagerAdapter(context);
        pager.setAdapter(mAdapter);
    }

    public void setImageData(ImageDatas imageData){
        this.imageData = imageData;
        mAdapter.add(imageData);
    }
}

