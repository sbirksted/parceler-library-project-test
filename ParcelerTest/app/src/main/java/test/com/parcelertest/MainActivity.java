package test.com.parcelertest;

import android.os.Parcelable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import org.parceler.Parcels;

import test.com.library.BaseObject;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //App POJO
        ChildOfChildOfBaseObject cbo = new ChildOfChildOfBaseObject();
        cbo.setaString("Child Object");
        cbo.setAnInt(4321);
        Parcelable parcelable = Parcels.wrap(cbo);

        ChildOfChildOfBaseObject pcbo = Parcels.unwrap(parcelable);
        Log.d("Parcel", cbo.getaString() + " : "+ pcbo.getaString());
        Log.d("Parcel", cbo.getAnInt() + " : " + pcbo.getAnInt());
        Log.d("Parcel", cbo.anotherInt + " : " + pcbo.anotherInt);

        //Lib POJO
        BaseObject baseObject = new BaseObject();
        Parcelable p = Parcels.wrap(baseObject);
        Parcels.unwrap(p);

        BaseObject bo = new BaseObject();
        bo.setAnInt(1234);
        bo.setaString("Hello Parceler");
        parcelable = Parcels.wrap(bo);

        BaseObject pbo = Parcels.unwrap(parcelable);
        Log.d("Parcel", bo.getaString() + " : "+ pbo.getaString());
        Log.d("Parcel", bo.getAnInt() + " : " + pbo.getAnInt());

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
