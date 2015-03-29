package cueb.edu.cueb_overpeople.data.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import cueb.edu.cueb_overpeople.R;

/**
 * Created by caoguodong on 2015/3/3.
 */
public class RePrintedAdapter extends BaseAdapter {

    private Context context;

    public RePrintedAdapter(Context context){
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

        ViewHodler hodler;

        if (convertView!=null){
            hodler = (ViewHodler) convertView.getTag();
        }else {
            hodler = new ViewHodler();
            convertView = LayoutInflater.from(context).inflate(R.layout.item_my_doubt,null);
            hodler.title = (TextView) convertView.findViewById(R.id.item_my_title);
            hodler.content = (TextView) convertView.findViewById(R.id.item_my_content);
        }


        return convertView;
    }

    class ViewHodler{
       TextView title,content;
    }
}
