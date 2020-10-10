package pojo;


public class TCustomer {

    private long id;
    private String username;
    private String password;
    private String nickname;
    private String address;
    private double money;
    private long state;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }


    public long getState() {
        return state;
    }

    public void setState(long state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "TCustomer{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", address='" + address + '\'' +
                ", money=" + money +
                ", state=" + state +
                '}';
    }
}
