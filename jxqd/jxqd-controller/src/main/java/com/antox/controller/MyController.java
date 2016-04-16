package com.antox.controller;

import java.security.KeyPair;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.antox.RSA.RSA;
import com.antox.RSA.RSAKeyPair;
import com.antox.entity.User;
import com.antox.param.LoginParam;
import com.antox.service.IMyService;
import com.antox.utils.AjaxJson;
import com.antox.utils.MD5Util;

@Controller
@RequestMapping("my")
public class MyController {

	@Autowired
	private IMyService myService;

	@RequestMapping()
	public ModelAndView login(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("home/login/login");
		try {
			KeyPair kp = RSA.generateKeyPair();
			RSAKeyPair rkp = new RSAKeyPair(kp);
			request.setAttribute("e", rkp.getExponent());
			request.setAttribute("m", rkp.getModulus());
			request.getSession().setAttribute("RSAKeyPair", rkp);
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("sessionRole", "my");
		return mv;
	}

	@RequestMapping("loginId")
	@ResponseBody
	public AjaxJson loginId(String loginId) {
		AjaxJson j = new AjaxJson();
		User u = myService.queryLoginId(loginId);
		if (u == null) {
			j.setMsg("该账号不存在");
			j.setSuccess(false);
		} else {
			j.setResult(u.getLoginId());
			j.setSuccess(true);
		}
		return j;
	}

	@RequestMapping("loginIn")
	@ResponseBody
	public AjaxJson loginId(HttpServletRequest request, LoginParam login) {
		AjaxJson j = new AjaxJson();
		RSAKeyPair rkp = (RSAKeyPair) request.getSession().getAttribute("RSAKeyPair");
		String unHash = null;
		try {
			 unHash = RSA.decryptWithTransformation(login.getHash(), rkp.getPrivateKey());
		} catch (Exception e) {
			e.printStackTrace();
		}
		String validateCode = (String) request.getSession().getAttribute("my");
		if (validateCode == null) {
			j.setMsg("登入超时");
			j.setSuccess(false);
			return j;
		}
		if (!login.getVcode().equalsIgnoreCase(validateCode)) {
			j.setMsg("验证码不正确");
			j.setSuccess(false);
			return j;
		}
		User u = myService.queryLoginId(login.getLid());
		if(u==null) {
			j.setMsg("用户不存在");
			j.setSuccess(false);
			return j;
		}
		String seed = u.getSeed();
	    String hash = MD5Util.getMD5String(unHash+seed);
	    if(hash.equals(u.getHash())) {
	    	j.setMsg("登入成功");
	    	j.setSuccess(true);
	    } else {
	    	j.setMsg("用户名或密码错误");
	    	j.setSuccess(false);
	    }
		return j;
	}
}
