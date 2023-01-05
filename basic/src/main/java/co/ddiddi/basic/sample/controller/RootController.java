package co.ddiddi.basic.sample.controller;

import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.ddiddi.basic.sample.vo.SampleVo;

@Controller
public class RootController {

	@GetMapping("/")
	public String getRoot(Model model) {
		SampleVo sampleVo = new SampleVo("title", "name", UUID.randomUUID().toString());
		model.addAttribute("sample", sampleVo);
		return "sample/sample";
	}
}
