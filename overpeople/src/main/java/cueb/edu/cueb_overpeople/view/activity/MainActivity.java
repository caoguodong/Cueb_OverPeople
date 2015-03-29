package cueb.edu.cueb_overpeople.view.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import cueb.edu.cueb_overpeople.R;
import cueb.edu.cueb_overpeople.view.fragment.BaseFragment;
import cueb.edu.cueb_overpeople.view.fragment.DoubtAndAnswer;
import cueb.edu.cueb_overpeople.view.fragment.ExperienceShare;
import cueb.edu.cueb_overpeople.view.fragment.HomePage;
import cueb.edu.cueb_overpeople.view.fragment.ReprintedShare;


public class MainActivity extends ActionBarActivity {


    private CheckedTextView experienceButton,answerButton,reprintedButton,profileButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        HomePage fragment = new HomePage();
        transaction.replace(R.id.content,fragment);
        transaction.commit();

        experienceButton= (CheckedTextView) findViewById(R.id.main_button_experience_share);
        answerButton = (CheckedTextView) findViewById(R.id.main_button_answer_question);
        reprintedButton = (CheckedTextView) findViewById(R.id.main_button_reprinted_share);
        profileButton = (CheckedTextView) findViewById(R.id.main_button_profile);

        experienceButton.setOnClickListener(onClickListener);
        answerButton.setOnClickListener(onClickListener);
        reprintedButton.setOnClickListener(onClickListener);
        profileButton.setOnClickListener(onClickListener);

        experienceButton.performClick();
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            BaseFragment fragment= null;
            switch (v.getId()) {
                case R.id.main_button_experience_share:
                    fragment = new ExperienceShare();
                    clearCheckedButton();
                    experienceButton.setChecked(true);
//                    findViewById(R.id.main_button_experience_share).setBackgroundColor(getResources().getColor(R.color.back));
                    break;
                case R.id.main_button_answer_question:
                    fragment = new DoubtAndAnswer();
                    clearCheckedButton();
                    answerButton.setChecked(true);
//                    findViewById(R.id.main_button_answer_question).setBackgroundColor(getResources().getColor(R.color.back));
                    break;
                case R.id.main_button_reprinted_share:
                    fragment = new ReprintedShare();
                    clearCheckedButton();
                    reprintedButton.setChecked(true);
//                    findViewById(R.id.main_button_reprinted_share).setBackgroundColor(getResources().getColor(R.color.back));
                    break;
                case R.id.main_button_profile:
                    fragment = new HomePage();
                    clearCheckedButton();
                    profileButton.setChecked(true);
//                    findViewById(R.id.main_button_profile).setBackgroundColor(getResources().getColor(R.color.back));
                    break;
            }
            transaction.replace(R.id.content,fragment);
            transaction.commit();
        }
    };

    private void clearCheckedButton(){
        experienceButton.setChecked(false);
        answerButton.setChecked(false);
        reprintedButton.setChecked(false);
        profileButton.setChecked(false);
    }
}
