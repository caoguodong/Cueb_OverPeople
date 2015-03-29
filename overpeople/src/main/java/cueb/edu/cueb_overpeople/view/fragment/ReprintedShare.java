package cueb.edu.cueb_overpeople.view.fragment;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import cueb.edu.cueb_overpeople.R;
import cueb.edu.cueb_overpeople.data.adapter.RePrintedAdapter;


public class ReprintedShare extends BaseFragment {

    private ListView listView;

    public ReprintedShare() {
    }


    @Override
    public void init() {
        listView = (ListView) rootView.findViewById(R.id.repriented_listView);
        listView.setAdapter(new RePrintedAdapter(getActivity()));
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_reprinted_share;
    }
}
