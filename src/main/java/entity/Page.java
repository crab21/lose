package entity;

/**
 * Created by root on 17-2-4.
 */
public class Page {
    private static final int pSize = 10;
    private int page = 1;

    public static int getpSize() {
        return pSize;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
