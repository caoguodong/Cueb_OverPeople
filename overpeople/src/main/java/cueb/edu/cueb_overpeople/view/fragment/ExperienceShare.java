package cueb.edu.cueb_overpeople.view.fragment;


import android.util.Log;
import android.widget.Button;
import android.widget.ListView;

import cueb.edu.cueb_overpeople.R;
import cueb.edu.cueb_overpeople.data.adapter.ExperienceShareAdapter;

public class ExperienceShare extends BaseFragment {

   // private PullRefreshLayout pullRefreshLayout;
    private ListView dataListView;

    @Override
    public void init() {
        //pullRefreshLayout = (PullRefreshLayout) mainActivity.findViewById(R.id.experience_swipeRefreshLayout);
        dataListView = (ListView)rootView.findViewById(R.id.experience_listView);
        ExperienceShareAdapter adapter = new ExperienceShareAdapter(getActivity());
        dataListView.setAdapter(adapter);

        Button button  = new Button(getActivity());
        button.setText("发帖");
        button.setBackgroundResource(R.drawable.experience_item_button_selector);

        dataListView.addFooterView(button);
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_experience_share;
    }



}
