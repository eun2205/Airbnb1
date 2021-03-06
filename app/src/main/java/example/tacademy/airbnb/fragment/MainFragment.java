package example.tacademy.airbnb.fragment;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import example.tacademy.airbnb.CountryActivity;
import example.tacademy.airbnb.R;
import example.tacademy.airbnb.adapter.MainListAdapter;
import example.tacademy.airbnb.data.AirBnBCommend;
import example.tacademy.airbnb.data.GuideData;
import example.tacademy.airbnb.data.HostCommend;
import example.tacademy.airbnb.data.ImageData;
import example.tacademy.airbnb.data.LatelySearchData;
import example.tacademy.airbnb.data.MainData;
import example.tacademy.airbnb.data.PopularData;
import example.tacademy.airbnb.data.SearchImage;
import example.tacademy.airbnb.data.WeekCommend;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    RecyclerView listView;
    MainListAdapter mAdapter;

    private OnMainFragmentSelectListener mListener;

    public MainFragment() {
    }

    public static MainFragment newInstance() {
        MainFragment fragment = new MainFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        listView = (RecyclerView) view.findViewById(R.id.rv_list);
        mAdapter = new MainListAdapter(getFragmentManager(),getContext());

        listView.setAdapter(mAdapter);
        LinearLayoutManager manager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        listView.setLayoutManager(manager);
        mAdapter.setOnAdapterItemClickListener(new MainListAdapter.OnAdapterItemClickLIstener() {
            @Override
            public void onAdapterItemClick(View view, ImageData imageData) {
                Intent intent = new Intent(getContext(), CountryActivity.class);
                startActivity(intent);
            }
        });
        initData();
        return view;
    }

    public interface OnMainFragmentSelectListener {
        void onMainFragmentSelectListner(View view);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }
    private void initData() {
        MainData mainData = new MainData();

        mainData.setUserName("은지");

        SearchImage searchImage = new SearchImage();

        ImageData imageData = new ImageData();
        imageData.setImageId(R.drawable.sample_bangkok);
        imageData.setImageName("방콕");
        searchImage.getImageDatas().add(imageData);
        imageData = new ImageData();
        imageData.setImageId(R.drawable.sample_zadar);
        imageData.setImageName("자다르");
        searchImage.getImageDatas().add(imageData);
        imageData = new ImageData();
        imageData.setImageId(R.drawable.sample_milano);
        imageData.setImageName("밀라노");
        searchImage.getImageDatas().add(imageData);

        mainData.setSearchImage(searchImage);

        LatelySearchData latelySearchData = new LatelySearchData();

        imageData = new ImageData();
        imageData.setImageId(R.drawable.sample_home);
     //  imageData.setImageName("서울");
        latelySearchData.getImageDatas().add(imageData);
        imageData = new ImageData();
        imageData.setImageId(R.drawable.sample_home2);
     //   imageData.setImageName("파리");
        latelySearchData.getImageDatas().add(imageData);
        imageData = new ImageData();
        imageData.setImageId(R.drawable.sample_home3);
     //   imageData.setImageName("두브로브니크");
        latelySearchData.getImageDatas().add(imageData);

        mainData.setLatelySearchData(latelySearchData);


        WeekCommend weekCommend = new WeekCommend();

        imageData = new ImageData();
        imageData.setImageId(R.drawable.sample_paris);
        imageData.setImageName("파리");
        weekCommend.getImageDatas().add(imageData);
        imageData = new ImageData();
        imageData.setImageId(R.drawable.sample_dubro);
        imageData.setImageName("두브로브니크");
        weekCommend.getImageDatas().add(imageData);
        imageData = new ImageData();
        imageData.setImageId(R.drawable.sample_seoul);
        imageData.setImageName("서울");
        weekCommend.getImageDatas().add(imageData);

        mainData.setWeekCommend(weekCommend);

        AirBnBCommend airBnBCommend = new AirBnBCommend();

        imageData = new ImageData();
        imageData.setImageId(R.drawable.sample_airbnb);
        imageData.setImageName("Geodesic Domes");
        airBnBCommend.getImageDatas().add(imageData);
        imageData = new ImageData();
        imageData.setImageId(R.drawable.sample_airbnb2);
        imageData.setImageName("Lighthouses");
        airBnBCommend.getImageDatas().add(imageData);
        imageData = new ImageData();
        imageData.setImageId(R.drawable.sample_airbnb3);
        imageData.setImageName("Around the World");
        airBnBCommend.getImageDatas().add(imageData);

        mainData.setAirBnBCommend(airBnBCommend);

        PopularData popularData = new PopularData();

        imageData = new ImageData();
        imageData.setImageId(R.drawable.sample_seoul);
        imageData.setImageName("서울");
        popularData.getImageDatas().add(imageData);
        imageData = new ImageData();
        imageData.setImageId(R.drawable.sample_dubro);
        imageData.setImageName("두브로브니크");
        popularData.getImageDatas().add(imageData);
        imageData = new ImageData();
        imageData.setImageId(R.drawable.sample_paris);
        imageData.setImageName("파리");
        popularData.getImageDatas().add(imageData);

        mainData.setPopularData(popularData);

        GuideData guideData = new GuideData();

        imageData = new ImageData();
        imageData.setImageId(R.drawable.sample_sanfran);
        imageData.setImageName("샌프란시스코");
        guideData.getImageDatas().add(imageData);
        imageData = new ImageData();
        imageData.setImageId(R.drawable.sample_london);
        imageData.setImageName("런던");
        guideData.getImageDatas().add(imageData);
        imageData = new ImageData();
        imageData.setImageId(R.drawable.sample_london2);
        imageData.setImageName("런던");
        guideData.getImageDatas().add(imageData);
        imageData = new ImageData();
        imageData.setImageId(R.drawable.sample_osaka);
        imageData.setImageName("오사카");
        guideData.getImageDatas().add(imageData);
        imageData = new ImageData();
        imageData.setImageId(R.drawable.sample_berlin);
        imageData.setImageName("베를린");
        guideData.getImageDatas().add(imageData);
        imageData = new ImageData();

        mainData.setGuideData(guideData);

        HostCommend hostCommend = new HostCommend();
        hostCommend = new HostCommend();
        hostCommend.setImage(ContextCompat.getDrawable(getContext(),R.drawable.sample_friends));
        hostCommend.setRecomendText("여행 크레딧을 받으세요!");
        mainData.setHostCommend2(hostCommend);

        mAdapter.setmainData(mainData);
    }

}
