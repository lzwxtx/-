import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class InformationInsert {
    public List<News> topInsert(List<News> list , News news){
        list.add(0,news);
        return list;
    }
    public List<News> indexInsert(List<News> list, News news, int index){

        //插在尾部
        if(index == list.size()+1){
            list.add(news);
            return list;
        }
        //插在头部
        if (index == 1){
            topInsert(list,news);
        }
        if(index > list.size()+1){
            System.out.println("插入失败,请检查index是否在 0 ~ " + (list.size()+1));
            return list;
        }
        //插在第index处
        list.add(index-1,news);
        return list;
    }
    public List<News> timeInsert(List<News> list, News news){
        Date newData = convert(news.getUpdateTime());
        for (int i = 0; i < list.size() ; i++) {
            Date date = convert(list.get(i).getUpdateTime());
            if(newData.after(date)&&i<list.size()-1){

            }else if(newData.before(date)){
                list.add(i,news);
                break;
            }else {
                list.add(news);
                break;
            }

        }
        return list;
    }
     // 字符串转换为时间
    public Date convert(String str){
        Date date = null;
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        try {
            date = sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date;
    }

}
