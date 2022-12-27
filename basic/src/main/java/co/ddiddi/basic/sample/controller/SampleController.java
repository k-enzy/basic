package co.ddiddi.basic.sample.controller;

import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.ddiddi.basic.sample.vo.SampleVo;
import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/sample")
public class SampleController {

	@GetMapping("/sample")
	public String getSample(Model model) {
		SampleVo sampleVo = new SampleVo("title", "name", UUID.randomUUID().toString());
		model.addAttribute("sample", sampleVo);
		return "sample/sample";
	}
}
