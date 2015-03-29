package cueb.edu.cueb_overpeople.model.network;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import cueb.edu.cueb_overpeople.model.parser.ParserBase;
import cueb.edu.cueb_overpeople.model.parser.ParserFactory;

/**
 * Created by caoguodong on 2015/2/5.
 */
public class DataBackHelper implements Response.Listener<String>,Response.ErrorListener {

    private String key;
    private DataBackListener listener;

    public DataBackHelper(String key,DataBackListener listener){
        this.key = key;
        this.listener = listener;
    }

    @Override
    public void onErrorResponse(VolleyError volleyError) {
        String msg = volleyError.getMessage();
        if (listener!=null){
            if (volleyError.networkResponse == null){
                listener.netErroe("网络错误,请检查网络连接状况");
            }else {
                listener.netErroe(volleyError.networkResponse.statusCode+":"+msg);
            }
        }
    }

    @Override
    public void onResponse(String s) {
        ParserBase parser = ParserFactory.getParser(key);
        if (listener!=null&&parser!=null){
            listener.dataBack(parser.parserData(s));
        }
    }
}
