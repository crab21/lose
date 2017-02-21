package service.controller.ViewAction;

import com.opensymphony.xwork2.ActionSupport;
import entity.SubmitInfo;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by root on 17-2-11.
 */
public class SubmitInfoAction extends ActionSupport{
  private SubmitInfo sub;
    private File picFile;
    private String picFileContentType;
    private String picFileFileName;

    public File getPicFile() {
        return picFile;
    }

    public void setPicFile(File picFile) {
        this.picFile = picFile;
    }

    public String getPicFileContentType() {
        return picFileContentType;
    }

    public void setPicFileContentType(String picFileContentType) {
        this.picFileContentType = picFileContentType;
    }

    public String getPicFileFileName() {
        return picFileFileName;
    }

    public void setPicFileFileName(String picFileFileName) {
        this.picFileFileName = picFileFileName;
    }

    public SubmitInfo getSub() {
        return sub;
    }

    public void setSub(SubmitInfo sub) {
        this.sub = sub;
    }

    @Override
    public String execute() throws Exception {

        System.out.println(sub.getLose_type());
        System.out.println(sub.getLose_name());
        System.out.println(sub.getLose_location());
        System.out.println(sub.getLose_info());
        System.out.println(sub.getLose_phone());

        return "ok";
    }
}
