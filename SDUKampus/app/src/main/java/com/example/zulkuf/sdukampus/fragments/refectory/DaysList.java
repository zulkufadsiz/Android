package com.example.zulkuf.sdukampus.fragments.refectory;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by zulkuf on 20/03/17.
 */

public class DaysList {
    private String image;
    private String calory;
    private String name;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCalory() {
        return calory;
    }

    public void setCalory(String calory) {
        this.calory = calory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<DaysList> createNewList(){

        DaysList food1 = new DaysList();
        food1.setCalory("29,6 kcal");
        food1.setName("Domates Çorbası");
        food1.setImage("http://www.e-tarifler.com/wp-content/uploads/2011/01/sutlu-domates-corbasi-tarifi.jpg");

        DaysList food2 = new DaysList();
        food2.setCalory("200 kcal");
        food2.setName("Özbek Pilavı");
        food2.setImage("http://3.bp.blogspot.com/-AvbneMfcbb8/VoZt6IMiw-I/AAAAAAAAEow/hpZuMfrlk_c/s640/ozbek-pilavi.jpg");

        DaysList food3 = new DaysList();
        food3.setCalory("267 kca");
        food3.setName("Zeytinyağlı Kurufasulye");
        food3.setImage("http://e-yemektarifleri.info/wp-content/uploads/zeytinyagli-kurufasulye.jpg");

        DaysList food4 = new DaysList();
        food4.setCalory("95 kcal");
        food4.setName("Ayran");
        food4.setImage("http://www.e-bitlis.com/resimler/20140424__8521801233.JPG");


        List<DaysList>foodlist = new LinkedList<>();
        foodlist.add(food1);
        foodlist.add(food2);
        foodlist.add(food3);
        foodlist.add(food4);
        return foodlist;
    }

}
