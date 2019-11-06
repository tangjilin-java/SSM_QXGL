package ab.tjl.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author:tangjilin
 * @Description:日期转换字符串 字符串转换日期工具类
 * @Date:Created in 16:46 2019/7/24
 * @Modified By:
 */
public class DateUtils {

    //日期转换字符串
    public static  String date2String(Date date,String patt){
        SimpleDateFormat sdf = new SimpleDateFormat(patt);
        String format = sdf.format(date);
        return format;
    }

    //字符串转换日期
    public static Date string2Date(String str,String patt) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat(patt);
        Date parse = sdf.parse(str);
        return parse;
    }
}
