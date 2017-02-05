package entity;

/**
 * Created by root on 17-2-4.
 */
public class LoseTypeEntity {
    private int ltid;
    private String ltype;

    public int getLtid() {
        return ltid;
    }

    public void setLtid(int ltid) {
        this.ltid = ltid;
    }

    public String getLtype() {
        return ltype;
    }

    public void setLtype(String ltype) {
        this.ltype = ltype;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LoseTypeEntity that = (LoseTypeEntity) o;

        if (ltid != that.ltid) return false;
        if (ltype != null ? !ltype.equals(that.ltype) : that.ltype != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ltid;
        result = 31 * result + (ltype != null ? ltype.hashCode() : 0);
        return result;
    }
}
