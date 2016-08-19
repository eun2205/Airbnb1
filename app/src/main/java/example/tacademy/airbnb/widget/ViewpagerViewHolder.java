package example.tacademy.airbnb.widget;

import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import example.tacademy.airbnb.R;

/**
 * Created by Tacademy on 2016-08-19.
 */
public class ViewpagerViewHolder extends RecyclerView.ViewHolder {

    ViewPager pager;

    public ViewpagerViewHolder(View itemView) {
        super(itemView);
        pager = (ViewPager)itemView.findViewById(R.id.pager);
    }
}
