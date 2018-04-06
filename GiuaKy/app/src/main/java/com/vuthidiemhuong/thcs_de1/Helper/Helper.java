package com.vuthidiemhuong.thcs_de1.Helper;



import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ASUS on 4/3/2018.
 */
// tao 1 file class Helper de co the quan li cong viec ket noi voi so so du lieu.
    // class nay thua ke tu SQLiteOpenHelper
public class Helper extends SQLiteOpenHelper {
    // khai bao thuoc tinh giup cho viec xu li de dang hon
    public static final String DATABASE_NAME = "HV.db";
    public static final int DATABASE_VERSION = 1;

    public static final String TABLE_THUCHI = "TABLE_THUCHI";
    public static final String ID = "ID";
    public static final String NOIDUNG = "NOIDUNG";
    public static final String SOTIEN = "SOTIEN";
    public static final String HINHTHUC = "HINHTHUC";

    // khai bao thuoc tinh tinh de tao bang du lieu CREATE.TABLE
    public static final String CREATE_TABLE_THUCHI = "CREATE TABLE "+TABLE_THUCHI+"(\n" +
            ID+" INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
            NOIDUNG+" TEXT NOT NULL,\n" + // null la khong the bo trong thong tin
            SOTIEN+" TEXT NOT NULL,\n" +
            HINHTHUC+" TEXT NOT NULL);";

    public Helper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }
    // khoi chay dau tien khi class duoc khoi tao. truy vaN CREATE.TABLE
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_THUCHI);
    }


    // Nang cap ung dung, khi thay doi version
    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }

    public SQLiteDatabase OpenDatabase(){
        return getWritableDatabase();
    }
    public void CloseDatabase(){
        close();
    }
}
