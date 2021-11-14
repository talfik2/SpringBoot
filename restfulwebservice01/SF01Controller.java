package restfulwebservice01;

import java.util.List;

// At the beginning, you need to use the @Controller annotation.
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller // When you create the @Controller, SpringBoot understands that you’ll use the requests on that code.
@RestController // Does the same task with @Controller,recommended way..
public class SF01Controller {
	
	// 1'st Way to create Get Request
	//@RequestMapping(method = RequestMethod.GET, path = "/getRequest") // So that SpringBoot can link getMethod() with Get Request.
	
	//2'nd Way to create Get Request: Recommended
	@GetMapping(path = "/getRequest")
	
	public String getMethod(){ // This is a get method(request), but it'll return just a string, nothing more.
								// Here, we created String, but in real life, you can create anything. 
			 return "Get Request is taken..."; // Create the "return" to understand getMethod() is taken.
			 // You can insert some HTML code here and make the things more colorful.
			 // Don't forget to check updates from your localhost:http://localost:8080/getRequest
	}
	
	@GetMapping(path="/getBean") //We used different URL(@GetMapping(path = “/getBean”)). 
									// You cannot use the same URL more than once since browser will confuse which one to go.
	public SF02ControllerBean getMethod1() { // Inside the same class, if you want to use same methods name, the parameters should be different.
												// Thus, we need to set second method's name as getMethod1()
		return new SF02ControllerBean("This is the get request to return message object..."); // When I used getBean, I should see that message. 
	}
	
	@GetMapping(path="/getParameter{name}")
	public SF02ControllerBean getMethod2(@PathVariable String name) { // •	I’ll create one more get method, and it ‘ll return the page according to the URL.
		return new SF02ControllerBean(String.format("Hey, %s this is your page...", name ));
		// In real life, you'll type query related code from here. 
	}
	
	// Let's create one more method that returns the list of objects. 
	@GetMapping(path = "getList/{name}")
	public List<SF02ControllerBean> getMethod3(@PathVariable String name) { // We added List<> so that it can return list of objects.
		
		return List.of(new SF02ControllerBean(String.format("Hi %s", name)),
				new SF02ControllerBean(String.format("How are you %s", name)),
				new SF02ControllerBean(String.format(" %s do you want to drink coffee", name)));
		// It'll return list of objects that I wrote above.. {}
	}
}
