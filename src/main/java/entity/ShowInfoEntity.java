package entity;

/**
 * Created by root on 17-2-4.
 */
public class ShowInfoEntity {
    private int lid;
    private String loseType;
    private String loseInfo;
    private String loseImg;
    private String loseLocation;
    private String losePhone;
    private String loseTime;
    private String loseName;
    private int lcid;
    private LoseTypeEntity loseTypeByLtid;

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getLoseType() {
        return loseType;
    }

    public void setLoseType(String loseType) {
        this.loseType = loseType;
    }

    public String getLoseInfo() {
        return loseInfo;
    }

    public void setLoseInfo(String loseInfo) {
        this.loseInfo = loseInfo;
    }

    public String getLoseImg() {
        return loseImg;
    }

    public void setLoseImg(String loseImg) {
        this.loseImg = loseImg;
    }

    public String getLoseLocation() {
        return loseLocation;
    }

    public void setLoseLocation(String loseLocation) {
        this.loseLocation = loseLocation;
    }

    public String getLosePhone() {
        return losePhone;
    }

    public void setLosePhone(String losePhone) {
        this.losePhone = losePhone;
    }

    public String getLoseTime() {
        return loseTime;
    }

    public void setLoseTime(String loseTime) {
        this.loseTime = loseTime;
    }

    public String getLoseName() {
        return loseName;
    }

    public void setLoseName(String loseName) {
        this.loseName = loseName;
    }

    public int getLcid() {
        return lcid;
    }

    public void setLcid(int lcid) {
        this.lcid = lcid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShowInfoEntity that = (ShowInfoEntity) o;

        if (lid != that.lid) return false;
        if (lcid != that.lcid) return false;
        if (loseType != null ? !loseType.equals(that.loseType) : that.loseType != null) return false;
        if (loseInfo != null ? !loseInfo.equals(that.loseInfo) : that.loseInfo != null) return false;
        if (loseImg != null ? !loseImg.equals(that.loseImg) : that.loseImg != null) return false;
        if (loseLocation != null ? !loseLocation.equals(that.loseLocation) : that.loseLocation != null) return false;
        if (losePhone != null ? !losePhone.equals(that.losePhone) : that.losePhone != null) return false;
        if (loseTime != null ? !loseTime.equals(that.loseTime) : that.loseTime != null) return false;
        if (loseName != null ? !loseName.equals(that.loseName) : that.loseName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lid;
        result = 31 * result + (loseType != null ? loseType.hashCode() : 0);
        result = 31 * result + (loseInfo != null ? loseInfo.hashCode() : 0);
        result = 31 * result + (loseImg != null ? loseImg.hashCode() : 0);
        result = 31 * result + (loseLocation != null ? loseLocation.hashCode() : 0);
        result = 31 * result + (losePhone != null ? losePhone.hashCode() : 0);
        result = 31 * result + (loseTime != null ? loseTime.hashCode() : 0);
        result = 31 * result + (loseName != null ? loseName.hashCode() : 0);
        result = 31 * result + lcid;
        return result;
    }

    public LoseTypeEntity getLoseTypeByLtid() {
        return loseTypeByLtid;
    }

    public void setLoseTypeByLtid(LoseTypeEntity loseTypeByLtid) {
        this.loseTypeByLtid = loseTypeByLtid;
    }
}
