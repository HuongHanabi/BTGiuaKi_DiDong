package com.vuthidiemhuong.thcs_de1.DataSource;

/**
 * Created by ASUS on 4/3/2018.
 */

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

import com.vuthidiemhuong.thcs_de1.Helper.Helper;
import com.vuthidiemhuong.thcs_de1.Model.HocVien;

public class HocVienDataSource {
    Context context; // tao moi truong
    Helper helper;
    public HocVienDataSource(Context context) {
        this.context = context; // tao mot moi truong context
        helper = new Helper(context,Helper.DATABASE_NAME,null,Helper.DATABASE_VERSION);
    }
    public void ThemHocVien(HocVien hv){
        ContentValues content = new ContentValues();
        content.put(Helper.NOIDUNG,hv.getnoiDung());
        content.put(Helper.SOTIEN,hv.getsoTien());
        content.put(Helper.HINHTHUC,hv.gethinhThuc());
        SQLiteDatabase db = helper.OpenDatabase();
        db.insert(Helper.TABLE_THUCHI,null,content);
    }
    public ArrayList<HocVien> LietKeHV(){
        ArrayList<HocVien> listHocVien = new ArrayList<HocVien>(); // tao 1 list
        SQLiteDatabase db = helper.OpenDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + Helper.TABLE_THUCHI,null);
        c.moveToFirst();
        if (c.getCount()>0){
            while (!c.isAfterLast()){
                listHocVien.add(new HocVien(c.getString(1),c.getString(2),c.getInt(3)));
                c.moveToNext();
            }
        }
        helper.CloseDatabase();
        return listHocVien;
    }
}
