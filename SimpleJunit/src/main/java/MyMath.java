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
}
