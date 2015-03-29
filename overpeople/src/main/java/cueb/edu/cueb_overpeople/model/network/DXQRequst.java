package cueb.edu.cueb_overpeople.model.network;

import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;

/**
 * Created by caoguodong on 2015/2/5.
 */
public class DXQRequst{

    public static Request getRequst(int method,String url,DataBackHelper helper){
        Request request = null;
        switch (method){
            case Request.Method.GET:
                request = new StringRequest(method,url,helper,helper);
        }

        return request;
    }
}
