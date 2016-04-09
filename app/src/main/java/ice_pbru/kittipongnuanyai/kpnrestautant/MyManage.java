package ice_pbru.kittipongnuanyai.kpnrestautant;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by kittipongnuanyai on 4/9/16 AD.
 */
public class MyManage {

    //Explicit
    private MyOpenHelper myOpenHelper;
    private SQLiteDatabase sqLiteDatabase;


    public MyManage(Context context) {

        myOpenHelper = new MyOpenHelper(context);
        sqLiteDatabase = myOpenHelper.getWritableDatabase();


    }   //Constructor

}   //Main Class
