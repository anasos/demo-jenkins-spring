package rh.tuto.start.hTuto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/laptop")
public class LaptopRest {

	@GetMapping("/new")
	public Laptop getNewLatop(){
		return new Laptop();
	}
}
