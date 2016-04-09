package ice_pbru.kittipongnuanyai.kpnrestautant;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by kittipongnuanyai on 4/9/16 AD.
 */
public class MyOpenHelper extends SQLiteOpenHelper {

    //2. Explicit
    public static final String database_name = "Restaurant.db";
    private static final int database_version = 1;

    private static final String create_user_table = "create table userTABLE (" +
            "_id integer primary key, " +
            "User text," +
            "Password text," +
            "Name text);";

    private static final String create_food_table = "create table foodTABLE (" +
            "_id integer primary key," +
            "Food text," +
            "Price text," +
            "Source text)";




    //1. command n , alt insert --> constructor
    public MyOpenHelper(Context context) {
        super(context, database_name, null, database_version);


    } //Constructor

    //3.--> ไปใส่ extends sql ด้านบน

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(create_food_table);
        sqLiteDatabase.execSQL(create_user_table);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}   //Main Class
