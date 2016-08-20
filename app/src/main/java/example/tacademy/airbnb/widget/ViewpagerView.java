//package example.tacademy.airbnb.widget;
//
//import android.content.Context;
//import android.view.View;
//import android.widget.AdapterView;
//import android.widget.ImageView;
//import android.widget.RelativeLayout;
//import android.widget.TextView;
//
//import example.tacademy.airbnb.R;
//import example.tacademy.airbnb.data.ImageData;
//
///**
// * Created by Tacademy on 2016-08-19.
// */
//public class ViewpagerView extends RelativeLayout {
//
//    ImageView pictureView;
//    TextView nameView;
//
//
//    public ViewpagerView(Context context) {
//        super(context);
//        init();
//    }
//
//    OnItemClickListener mListener;
//
//    public interface OnItemClickListener {
//        public void onItemClick(View view, ImageData imageData);
//    }
//
//    private void init() {
//        View view = inflate(getContext(), R.layout.view_pager, this);
//        pictureView = (ImageView) findViewById(R.id.pager_picture);
//        nameView = (TextView) findViewById(R.id.pager_name);
//
//        view.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if ()
//            }
//        });
//    }
//}
