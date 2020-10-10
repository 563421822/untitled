package pojo;


public class TApiMapping {

    private long id;
    private String gatewayApiName;
    private String insideApiUrl;
    private long state;
    private String description;
    private String serviceId;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getGatewayApiName() {
        return gatewayApiName;
    }

    public void setGatewayApiName(String gatewayApiName) {
        this.gatewayApiName = gatewayApiName;
    }


    public String getInsideApiUrl() {
        return insideApiUrl;
    }

    public void setInsideApiUrl(String insideApiUrl) {
        this.insideApiUrl = insideApiUrl;
    }


    public long getState() {
        return state;
    }

    public void setState(long state) {
        this.state = state;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

}
