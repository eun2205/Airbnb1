package example.tacademy.airbnb.widget;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import example.tacademy.airbnb.R;

/**
 * Created by Tacademy on 2016-08-19.
 */
public class HelloViewHolder extends RecyclerView.ViewHolder {
    TextView nameView, helloView;

    public HelloViewHolder(View itemView) {
        super(itemView);
        nameView = (TextView) itemView.findViewById(R.id.text_name);
        helloView = (TextView) itemView.findViewById(R.id.text_hello);
    }

    public void setText(String text) {
        nameView.setText(text);
        helloView.setText(text);
    }
}
