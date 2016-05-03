package fr.inria.diverse;

/**
 * Created by marodrig on 03/05/2016.
 */
public class SomeObject {

    public double data = 10;

    public SomeObject(double i) {
        data = i;
    }

    void modifyData() {
        data = Math.log(data);
    }


}
