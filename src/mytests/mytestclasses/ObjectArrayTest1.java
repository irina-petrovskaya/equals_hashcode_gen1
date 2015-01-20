package mytests.mytestclasses;

import java.util.Arrays;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 1/19/2015.
 * Project: equals_hashcode_gen1
 * *******************************
 */
public class ObjectArrayTest1 {

    UtilClass1[] utils;


    public ObjectArrayTest1(UtilClass1[] utils) {
        this.utils = utils;
    }

    public UtilClass1[] getUtils() {

        return utils;
    }

    public void setUtils(UtilClass1[] utils) {
        this.utils = utils;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ObjectArrayTest1)) return false;

        ObjectArrayTest1 that = (ObjectArrayTest1) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(getUtils(), that.getUtils());

    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getUtils());
    }
}
