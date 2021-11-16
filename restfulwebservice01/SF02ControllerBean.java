package restfulwebservice01;

public class SF02ControllerBean {
    private String msg;
    //Controller
    SF02ControllerBean(String msg){
        this.msg = msg;
    }
    //Getters & Setters
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    // toString()
    @Override
    public String toString() {
        return "Message: " + msg;
    }
}
