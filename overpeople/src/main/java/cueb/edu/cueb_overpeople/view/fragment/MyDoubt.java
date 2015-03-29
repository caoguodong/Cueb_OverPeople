package cueb.edu.cueb_overpeople.view.fragment;

import android.widget.Button;
import android.widget.ListView;

import cueb.edu.cueb_overpeople.R;
import cueb.edu.cueb_overpeople.data.adapter.MyDoubtAdapter;


public class MyDoubt extends BaseFragment {

    ListView listView;

    @Override
    public void init() {
        listView = (ListView) rootView.findViewById(R.id.my_doubt_listView);
        Button questionButton = new Button(getActivity());
        questionButton.setText("提问");
        questionButton.setBackgroundResource(R.drawable.experience_item_button_selector);
        listView.addFooterView(questionButton);
        listView.setAdapter(new MyDoubtAdapter(mainActivity.getApplicationContext()));
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_my_doubt;
    }
}
