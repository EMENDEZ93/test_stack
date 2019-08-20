package test.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
	private ModeloRepositorio modeloRepositorio;
	
	@GetMapping
	public String test() {
		return "*** Test Spring ***";
	}

	@GetMapping("/mock")
	public String test2() {
		return "*** mock ***";
	}
	
	@GetMapping("/all")
	public List<Modelo> test3() {
		return modeloRepositorio.findAll();
	}
	
	
}
