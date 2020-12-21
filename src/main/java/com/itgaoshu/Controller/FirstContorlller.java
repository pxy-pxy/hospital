package com.itgaoshu.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstContorlller
{
    @RequestMapping("login.do")
   public String login(){
       return "view/login";

   }}
