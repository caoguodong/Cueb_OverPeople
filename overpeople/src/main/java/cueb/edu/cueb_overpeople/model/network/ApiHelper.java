package cueb.edu.cueb_overpeople.model.network;

/**
 * Created by caoguodong on 2015/2/5.
 */
public class ApiHelper {

    private static String rootUrl = "http://www.duoxinqi.com";

    public static final String HOME="home";
    public static final String OFFICE="office";
    public static final String DIGITAL="digital";
    public static final String DRESS="dress";
    public static final String CONCEPT="concept";
    public static final String TECH="TECH";
    public static final String GREEN="green";
    public static final String IDEAAD="ideaad";
    public static final String DIANPU="dianpu";

    public static String getRequstUrl(String Page,int count){
        return rootUrl+"/"+Page+"/"+count;
    }
}
