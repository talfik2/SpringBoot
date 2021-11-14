package restfulwebservice01;

public class SF02ControllerBean {
	
	private String msg; // Since it is private, let's add getters and setters.
	
	SF02ControllerBean(String msg){ // When I create an object, I'll send a message,
		this.msg = msg; // and this part will assign the message to msg variable.
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Message: " + msg; // I created toString() method because 
														// I want to see the details after I create the object. 
	}

}
