package mytests.mytestclasses;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 1/16/2015.
 * Project: equals_hashcode_gen1
 * *******************************
 */
public class NestedArraysTest1 {
    Integer[][][] int_array;

    public Integer[][][] getInt_array() {
        return int_array;
    }

    public void setInt_array(Integer[][][] int_array) {
        this.int_array = int_array;
    }

    public NestedArraysTest1(Integer[][][] int_array) {
        this.int_array = int_array;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof NestedArraysTest1)) return false;

        NestedArraysTest1 that = (NestedArraysTest1) o;

        return new EqualsBuilder()
                .append(getInt_array(), that.getInt_array())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(getInt_array())
                .toHashCode();
    }
}
