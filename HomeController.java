package com.codingdojo.daikichipathvariables;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/daikichi")
public class HomeController {
	@RequestMapping("/")
	public String homepath() {
		return "This is a test";
	}
	@RequestMapping("/daikichi/travel/{place}")
	public String travelShow(@PathVariable("place") String city) {
		return "Congratulations! You will soon travel to " + city + "!";
	}
	
	@RequestMapping("/daikichi/lotto/{lottoNum}")
	public String lottoShow(@PathVariable("lottoNum") String num) {
		int intNum = Integer.parseInt(num);
		if(intNum % 2 == 0) 
		{
			return "You will take a grand journey in the near future, but be weary of tempting offers.";
		}
		else 
		{
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}
		
	}
}
