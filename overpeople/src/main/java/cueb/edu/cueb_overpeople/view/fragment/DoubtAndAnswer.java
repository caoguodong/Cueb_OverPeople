package cueb.edu.cueb_overpeople.view.fragment;

import android.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.widget.RadioGroup;

import cueb.edu.cueb_overpeople.R;


public class DoubtAndAnswer extends BaseFragment {

    private ViewPager viewPager;
    private RadioGroup radioGroup;

    @Override
    public void init() {
        viewPager = (ViewPager) rootView.findViewById(R.id.doubtViewPager);
        radioGroup = (RadioGroup) rootView.findViewById(R.id.rg_tab);

        Fragment myDoubt = new MyDoubt();
        Fragment otherDoubt = new OtherDoubt();

        Fragment[] fragmentsArray = new Fragment[]{myDoubt, otherDoubt};
        MyViewPagerAdapter viewPagerAdapter = new MyViewPagerAdapter(mainActivity.getSupportFragmentManager(), fragmentsArray);

        viewPager.setAdapter(viewPagerAdapter);
        viewPager.setCurrentItem(0);
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        radioGroup.check(R.id.tab_my);
                        break;
                    case 1:
                        radioGroup.check(R.id.tab_other);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.tab_my:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.tab_other:
                        viewPager.setCurrentItem(1);
                        break;
                }
            }
        });

    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_doubt_and_answer;
    }


    public class MyViewPagerAdapter extends FragmentStatePagerAdapter {

        Fragment[] fragmentsArray;

        public MyViewPagerAdapter(FragmentManager fm, Fragment[] fragmentsArray) {
            super(fm);
            this.fragmentsArray = fragmentsArray;
        }
;
        @Override
        public Fragment getItem(int position) {
            return fragmentsArray[position];
        }

        @Override
        public int getCount() {
            return fragmentsArray.length;
        }
    }
}
