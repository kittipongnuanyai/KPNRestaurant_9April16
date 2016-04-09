package ice_pbru.kittipongnuanyai.kpnrestautant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private MyManage myManage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Request SQLite
        myManage = new MyManage(this);
        
        //test add value
        testAdd();



    }   //Main method

    private void testAdd() {
        myManage.addValueToSQLite(0, "user", "pass", "name");
        myManage.addValueToSQLite(1, "food", "price", "source");

    }

}   //Main class
