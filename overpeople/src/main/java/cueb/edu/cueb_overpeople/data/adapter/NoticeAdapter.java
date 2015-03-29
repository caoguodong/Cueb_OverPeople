package cueb.edu.cueb_overpeople.data.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import cueb.edu.cueb_overpeople.R;

/**
 * Created by caoguodong on 2015/3/4.
 */
public class NoticeAdapter extends BaseAdapter{

    Context context;

    public NoticeAdapter(Context context){
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

        if (convertView !=null){
            holder = (ViewHolder) convertView.getTag();
        }else {
            holder = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.item_notice,null);
            holder.content = (TextView) convertView.findViewById(R.id.item_notice_content);
            convertView.setTag(holder);
        }

        return convertView;
    }

    private class ViewHolder{
        TextView content;
    }
}
