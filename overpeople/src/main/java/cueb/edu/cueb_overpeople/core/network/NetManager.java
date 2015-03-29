package cueb.edu.cueb_overpeople.core.network;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import cueb.edu.cueb_overpeople.model.network.ApiHelper;
import cueb.edu.cueb_overpeople.model.network.DXQRequst;
import cueb.edu.cueb_overpeople.model.network.DataBackHelper;
import cueb.edu.cueb_overpeople.model.network.DataBackListener;

/**
 * Created by caoguodong on 2015/2/5.
 */
public class NetManager {

    private RequestQueue mQueue;

    private NetManager(){
    }

    private static class Instance{
        public static final NetManager holder = new NetManager();
    }

    public static NetManager getInstance(){
        return Instance.holder;
    }

    public void init(Context context){
        mQueue = Volley.newRequestQueue(context);
    }

    private void request(DataBackListener listener,String key,int count){
        DataBackHelper helper = new DataBackHelper(key,listener);

        mQueue.add(DXQRequst.getRequst(Request.Method.GET, ApiHelper.getRequstUrl(key, count), helper));
    }

    public void homeRequest(DataBackListener listener,int count){
        request(listener,ApiHelper.HOME,count);
    }

}
