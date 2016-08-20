package example.tacademy.airbnb.widget;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import example.tacademy.airbnb.R;
import example.tacademy.airbnb.data.Category;


/**
 * Created by Kwak on 2016-08-14.
 */
public class CategoryViewHolder  extends RecyclerView.ViewHolder {
    Category category;
    TextView category_name;

    public CategoryViewHolder(View itemView)
    {
        super(itemView);
        category_name = (TextView)itemView.findViewById(R.id.category_textview);
    }

    public void setCategory(String category_name)
    {
        this.category_name.setText(category_name);
    }
}
