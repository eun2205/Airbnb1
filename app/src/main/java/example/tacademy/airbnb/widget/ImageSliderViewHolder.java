package example.tacademy.airbnb.widget;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import example.tacademy.airbnb.R;
import example.tacademy.airbnb.adapter.ImagePagerAdapter;
import example.tacademy.airbnb.data.ImageData;
import example.tacademy.airbnb.data.ImageDatas;

/**
 * Created by Kwak on 2016-08-18.
 */
public class ImageSliderViewHolder extends RecyclerView.ViewHolder {
    ViewPager pager;
    ImagePagerAdapter mAdapter;
    ImageDatas imageData;
    Context context;

    public ImageSliderViewHolder(View itemView, final Context context) {
        super(itemView);
        this.context = context;
        pager = (ViewPager)itemView.findViewById(R.id.pager);
        pager.setClipToPadding(false);
        mAdapter = new ImagePagerAdapter(context);
        mAdapter.setOnAdapterItemClickListener(new ImagePagerAdapter.OnAdapterItemClickLIstener() {
            @Override
            public void onAdapterItemClick(View view, ImageData imageData) {
                if(listener != null){
                    listener.onItemClick(view, imageData);
                }
            }
        });
        pager.setAdapter(mAdapter);
    }

    OnItemClickListener listener;
    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    public interface OnItemClickListener {
        public void onItemClick(View view, ImageData imageData);
    }



    public void setImageData(ImageDatas imageData){
        this.imageData = imageData;
        mAdapter.add(imageData);
    }

}

