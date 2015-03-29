package cueb.edu.cueb_overpeople.model.parser;


import cueb.edu.cueb_overpeople.model.network.ApiHelper;

/**
 * Created by caoguodong on 2015/2/6.
 */
public class ParserFactory {

    public static ParserBase getParser(String key){
        ParserBase parserBase = null;
        switch (key){
            case ApiHelper.HOME:
                break;
            case ApiHelper.CONCEPT:
                break;
            case ApiHelper.DIANPU:
                break;
            case ApiHelper.DIGITAL:
                break;
            case ApiHelper.DRESS:
                break;
            case ApiHelper.OFFICE:
                break;
            case ApiHelper.TECH:
                break;
            case ApiHelper.GREEN:
                break;
            case ApiHelper.IDEAAD:
                break;
            default:
                break;
        }

        return parserBase;
    }
}
