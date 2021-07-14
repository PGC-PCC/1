package com.runbom.demo;

import org.omg.PortableServer.REQUEST_PROCESSING_POLICY_ID;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.ws.RequestWrapper;

@SpringBootApplication
@Controller
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

    @RequestMapping (value = {"", "/index"})
	public String index(Model model){
	    model.addAttribute("msg","谢谢惠顾");
	  return "index";
    };

	@RequestMapping (value = "test", method = RequestMethod.POST)
	public String test(@RequestParam(value = "name") String name,Model model){
		model.addAttribute("msg",name);
		return "test";
	};

}
