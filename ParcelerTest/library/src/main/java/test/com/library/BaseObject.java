package test.com.library;

import org.parceler.Parcel;

/**
 * Created by sbirksted on 12/30/14.
 */
@Parcel
public class BaseObject {

    public String getaString() {
        return aString;
    }

    public void setaString(String aString) {
        this.aString = aString;
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    protected int anInt;
    protected String aString;

    public BaseObject() {

    }
}
