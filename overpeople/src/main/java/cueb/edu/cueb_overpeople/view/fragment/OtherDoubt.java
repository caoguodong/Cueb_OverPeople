package cueb.edu.cueb_overpeople.view.fragment;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import cueb.edu.cueb_overpeople.R;
import cueb.edu.cueb_overpeople.data.adapter.OtherDoubtAdapter;


public class OtherDoubt extends BaseFragment {

    ListView listView;

    @Override
    public void init() {
        listView = (ListView) rootView.findViewById(R.id.other_doubt_listView);
        listView.setAdapter(new OtherDoubtAdapter(getActivity()));
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_other_doubt;
    }
}
