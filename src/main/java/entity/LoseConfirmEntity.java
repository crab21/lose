package entity;

/**
 * Created by root on 17-2-4.
 */
public class LoseConfirmEntity {
    private int lid;
    private int lcid;
    private String lctime;

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public int getLcid() {
        return lcid;
    }

    public void setLcid(int lcid) {
        this.lcid = lcid;
    }

    public String getLctime() {
        return lctime;
    }

    public void setLctime(String lctime) {
        this.lctime = lctime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LoseConfirmEntity that = (LoseConfirmEntity) o;

        if (lid != that.lid) return false;
        if (lcid != that.lcid) return false;
        if (lctime != null ? !lctime.equals(that.lctime) : that.lctime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lid;
        result = 31 * result + lcid;
        result = 31 * result + (lctime != null ? lctime.hashCode() : 0);
        return result;
    }
}
