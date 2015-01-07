package test.com.parcelertest;

import org.parceler.Parcel;

/**
 * Created by sbirksted on 12/30/14.
 */
@Parcel
public class ChildOfChildOfBaseObject extends ChildOfBaseObject {
    protected int anotherInt;
    public ChildOfChildOfBaseObject() {
        anotherInt = 999;
    }
}
