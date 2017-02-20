package entity;

/**
 * Created by root on 17-2-19.
 */
public class SubmitInfo {
    private String lose_type;
    private  String lose_name;
    private  String lose_location;
    private  String lose_info;
    private String lose_phone;

    public SubmitInfo() {
    }

    public SubmitInfo(String lose_type, String lose_name, String lose_location, String lose_info, String lose_phone) {
        this.lose_type = lose_type;
        this.lose_name = lose_name;
        this.lose_location = lose_location;
        this.lose_info = lose_info;
        this.lose_phone = lose_phone;
    }

    public String getLose_type() {
        return lose_type;
    }

    public void setLose_type(String lose_type) {
        this.lose_type = lose_type;
    }

    public String getLose_name() {
        return lose_name;
    }

    public void setLose_name(String lose_name) {
        this.lose_name = lose_name;
    }

    public String getLose_location() {
        return lose_location;
    }

    public void setLose_location(String lose_location) {
        this.lose_location = lose_location;
    }

    public String getLose_info() {
        return lose_info;
    }

    public void setLose_info(String lose_info) {
        this.lose_info = lose_info;
    }

    public String getLose_phone() {
        return lose_phone;
    }

    public void setLose_phone(String lose_phone) {
        this.lose_phone = lose_phone;
    }
}