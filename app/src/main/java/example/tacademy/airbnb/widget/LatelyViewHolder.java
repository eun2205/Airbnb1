package example.tacademy.airbnb.widget;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import example.tacademy.airbnb.data.LatelySearchData;

/**
 * Created by Tacademy on 2016-08-20.
 */
public class LatelyViewHolder extends RecyclerView.ViewHolder {

    LatelySearchData latelySearchData;
    TextView lately_name;

    public LatelyViewHolder(View itemView) {
        super(itemView);
    }

    public LatelySearchData getLatelySearchData() {
        return latelySearchData;
    }

    public void setLatelySearchData(LatelySearchData latelySearchData) {
        this.latelySearchData = latelySearchData;
    }

    public TextView getLately_name() {
        return lately_name;
    }

    public void setLately_name(TextView lately_name) {
        this.lately_name = lately_name;
    }
}
