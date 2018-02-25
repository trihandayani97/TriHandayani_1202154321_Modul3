package com.example.trihandayani.trihandayani_1202154321_modul3;

/**
 * Created by Tri Handayani on 2/25/2018.
 */

public class Items {

    private String item_name, item_desc;
    private int imgThumb;

    //constructor
    public Items(String item_name, String item_desc, int imgThumb) {
        this.item_name = item_name;
        this.item_desc = item_desc;
        this.imgThumb = imgThumb;
    }

    //getter
    public String getItem_name() {
        return item_name;
    }

    public String getItem_desc() {
        return item_desc;
    }

    public int getImgThumb() {
        return imgThumb;
    }

}
