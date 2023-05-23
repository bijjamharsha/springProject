package org.ass.ums.controller;

import java.util.List;

import org.ass.ums.entity.RegisterEntity;
import org.ass.ums.service.imp.RegisterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@ResponseBody
public class RegisterRest {
	@Autowired
	private RegisterServiceImpl registerServiceImpl;
	//@RequestMapping(value="getAllUser" ,method=RequstMethod.GET)
	@PostMapping(value = "getAllUser")
	public  @ResponseBody List<RegisterEntity> getAllUser() {
		return registerServiceImpl.getAllUser();
	}
	//@RequestMapping(value="saveRegisterDetails")
	@GetMapping(value ="saveUserDetails")
	public void saveUserDetails(@RequestBody RegisterEntity registerEntity) {
		registerServiceImpl.processUserInfo(registerEntity);
	}

}
