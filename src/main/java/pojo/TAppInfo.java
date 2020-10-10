package pojo;

public class TAppInfo {

    private long id;
    private String corpName;
    private String appName;
    private String appKey;
    private String appSecret;
    private String redirectUrl;
    private long limit;
    private String description;
    private long cusId;
    private long state;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }


    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }


    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }


    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }


    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }


    public long getLimit() {
        return limit;
    }

    public void setLimit(long limit) {
        this.limit = limit;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public long getCusId() {
        return cusId;
    }

    public void setCusId(long cusId) {
        this.cusId = cusId;
    }


    public long getState() {
        return state;
    }

    public void setState(long state) {
        this.state = state;
    }

}
