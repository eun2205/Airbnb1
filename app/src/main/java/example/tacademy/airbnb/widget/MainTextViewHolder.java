package example.tacademy.airbnb.widget;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import example.tacademy.airbnb.R;
import example.tacademy.airbnb.data.MainData;


/**
 * Created by Kwak on 2016-08-14.
 */
public class MainTextViewHolder extends RecyclerView.ViewHolder {

    TextView mainTextView;

    MainData mainData;

    public MainTextViewHolder(View itemView) {
        super(itemView);
        mainTextView = (TextView)itemView.findViewById(R.id.text_main_name);
    }

    public void setMainText(MainData mainData){
        this.mainData = mainData;
        mainTextView.setText(mainData.getUserName()+"님,");
    }


}
