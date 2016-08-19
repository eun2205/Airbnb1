package example.tacademy.airbnb.widget;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import example.tacademy.airbnb.R;

/**
 * Created by Tacademy on 2016-08-19.
 */
public class TitleViewHolder extends RecyclerView.ViewHolder {

    TextView titleView;

    public TitleViewHolder(View itemView) {
        super(itemView);
        titleView = (TextView)itemView.findViewById(R.id.text_title);
    }
}
