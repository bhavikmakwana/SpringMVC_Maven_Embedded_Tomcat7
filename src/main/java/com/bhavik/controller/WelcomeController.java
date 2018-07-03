package com.bhavik.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/*
* With Controller Interface
*
* */
public class WelcomeController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        String uname = httpServletRequest.getParameter("uname");
        System.out.println("Parameter name -> "+uname);
        Map<String, String> map = new HashMap<String, String>();
        map.put("uname",uname);
        ModelAndView view = new ModelAndView("success", map);
        return view;
    }
}
