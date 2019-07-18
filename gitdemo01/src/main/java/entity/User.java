package entity;

/**
 * @program: git-demo
 * @description:
 * @author: Ms.Zhou
 * @create: 2019-07-18 16:55
 **/
public class User {
    private String id;
    private String uname;
    private  String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
}
