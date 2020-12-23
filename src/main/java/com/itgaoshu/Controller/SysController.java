package com.itgaoshu.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SysController {

    /*
     * 跳转加载departments.html
     * */
    @RequestMapping("toDepartments")
    public String toDepartments() {
        return "view/center/departments";
    }
    /*
     * 跳转加载doctor.html
     * */
    @RequestMapping("toDoctor")
    public String toDoctor() {
        return "view/center/doctor";
    }
    /*
     * 跳转加载area.html
     * */
    @RequestMapping("toArea")
    public String toArea() {
        return "view/center/area";
    }


}
