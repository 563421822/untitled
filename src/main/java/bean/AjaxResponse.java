package bean;

import pojo.TAdminUser;

/**
 * Ajax状态和信息的bean
 */
public class AjaxResponse {
    private boolean status;
    private String message;
    private Object object;
    private TAdminUser user;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public TAdminUser getUser() {
        return user;
    }

    public void setUser(TAdminUser user) {
        this.user = user;
    }

    public AjaxResponse(boolean status, String message) {
        this.status = status;
        this.message = message;
    }

    public AjaxResponse(boolean status, String message, Object object, TAdminUser user) {
        this.status = status;
        this.message = message;
        this.object = object;
        this.user = user;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
