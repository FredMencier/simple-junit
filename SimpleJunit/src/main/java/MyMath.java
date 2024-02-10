import java.util.List;

public class MyMath {

    public Integer sum(final List<Integer> myList) {
        if (myList == null || myList.isEmpty()) {
            return 0;
        }
        int res = 0;
        for (Integer nb : myList) {
            res = res + nb;
        }
        return res;
    }

    public Integer sumWithBug(final List<Integer> myList) {
        if (myList == null || myList.isEmpty()) {
            return 0;
        }
        int res = 0;
        for (Integer nb : myList) {
            res = res + nb;
        }
        return res + 1;
    }

    public Integer sum2(final List<Integer> myList) throws IllegalArgumentException {
        if (myList == null) throw new IllegalArgumentException("Liste vide");
        int res = 0;
        for (Integer nb : myList) {
            res = res + nb;
        }
        return res;
    }
}
