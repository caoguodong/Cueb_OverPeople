package cueb.edu.cueb_overpeople.data.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import cueb.edu.cueb_overpeople.R;

/**
 * Created by caoguodong on 2015/3/4.
 */
public class OtherDoubtAdapter extends BaseAdapter {

    private Context context;

    public OtherDoubtAdapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;
        if (convertView!=null){
            holder = (ViewHolder) convertView.getTag();
        }else {
            holder = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.item_other_doubt,null);
            holder.title = (TextView) convertView.findViewById(R.id.item_other_title);
            holder.content = (TextView) convertView.findViewById(R.id.item_other_content);
            holder.answerButton = (Button) convertView.findViewById(R.id.item_other_button);
            convertView.setTag(holder);
        }

        return convertView;
    }

    public class ViewHolder{
        TextView title,content;
        Button answerButton;
    }
}
