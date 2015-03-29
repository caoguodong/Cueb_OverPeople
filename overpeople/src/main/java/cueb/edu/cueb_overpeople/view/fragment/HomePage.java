package cueb.edu.cueb_overpeople.view.fragment;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import cueb.edu.cueb_overpeople.R;
import cueb.edu.cueb_overpeople.data.adapter.NoticeAdapter;


public class HomePage extends BaseFragment {

    ListView noticeListView;

    @Override
    public void init() {
        noticeListView = (ListView) rootView.findViewById(R.id.profile_noticeListView);
        noticeListView.setAdapter(new NoticeAdapter(getActivity()));
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_home_page;
    }
}
