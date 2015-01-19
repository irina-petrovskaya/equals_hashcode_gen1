package mytests.mytestclasses;



import java.util.List;
import com.google.common.base.Objects;
/**
 * *******************************
 * Created by Irina.Petrovskaya on 1/19/2015.
 * Project: equals_hashcode_gen1
 * *******************************
 */
public class ListOfArraysTest1 {
    List<Integer[][]> list1;

    public ListOfArraysTest1(List<Integer[][]> l1) {
        setList1(l1);
    }

    public List<Integer[][]> getList1() {
        return list1;
    }

    public void setList1(List<Integer[][]> list1) {
        this.list1 = list1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ListOfArraysTest1)) return false;
        ListOfArraysTest1 that = (ListOfArraysTest1) o;
        return com.google.common.base.Objects.equal(getList1(), that.getList1());
    }

    @Override
    public int hashCode() {
        return com.google.common.base.Objects.hashCode(getList1());
    }
}
