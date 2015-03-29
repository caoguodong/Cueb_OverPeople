package cueb.edu.cueb_overpeople.model.network;

/**
 * Created by caoguodong on 2015/2/5.
 */
public interface DataBackListener {

    void dataBack(Object data);

    void netErroe(String errorCode);

}
