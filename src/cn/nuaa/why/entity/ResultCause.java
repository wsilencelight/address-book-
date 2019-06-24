package cn.nuaa.why.entity;


public class ResultCause {

    public static final String SUCCESS_CODE = "200";
    public static final String FAIL_CODE = "400";

    private String code;
    private String desc;

    public ResultCause() {}

    public ResultCause(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
