package cueb.edu.cueb_overpeople.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cueb.edu.cueb_overpeople.view.activity.MainActivity;

abstract public class BaseFragment extends Fragment {
    protected MainActivity mainActivity;
    protected View rootView;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainActivity = (MainActivity) getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(getLayoutId(),container,false);
        init();
        return rootView;
    }

    /**
     * 初始化需要的步骤
     * */
    abstract public void init();

    /**
     * 返回布局需要的Id
     * */
    abstract public int getLayoutId();

}
