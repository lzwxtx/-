import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class test {


    InformationInsert informationInsert = new InformationInsert();
    List list = new LinkedList();

    @Before
    public void init(){

        News news1 = new News("1","2018/07/09 10:11:12","2020/08/23 23:18:53");
        News news2 = new News("2","2018/07/10 10:11:12","2020/08/23 23:18:53");
        News news3 = new News("3","2018/07/11 10:11:12","2020/08/23 23:18:53");
        News news4 = new News("4","2018/07/13 10:11:12","2020/08/23 23:18:53");
        list.add(news1);
        list.add(news2);
        list.add(news3);
        list.add(news4);
    }

    @Test
    public void topTest(){

        News news = new News();
        news.setName("top");
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String format = sdf.format(new Date());
        news.setInsertTime(format);
        String date="2018/07/12 10:11:12";
        news.setUpdateTime(date);
        informationInsert.topInsert(list,news);
        System.out.println(list.toString());
    }

    @Test
    public void indexTest(){

        News news = new News();
        news.setName("index");
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String format = sdf.format(new Date());
        news.setInsertTime(format);
        String date="2018/07/12 10:11:12";
        news.setUpdateTime(date);
        informationInsert.indexInsert(list,news,6);
        System.out.println(list.toString());
    }

    @Test
    public void timeTest(){

        News news = new News();
        news.setName("time");
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String format = sdf.format(new Date());
        news.setInsertTime(format);
        String date="2018/07/07 10:11:12";
        news.setUpdateTime(date);
        informationInsert.timeInsert(list,news);
        System.out.println(list.toString());
    }

}
