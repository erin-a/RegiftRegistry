package org.launchcode.RegiftRegistry.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @RequestMapping(value = "")
    @ResponseBody
    public String index(HttpServletRequest request) {

        String name = request.getParameter("name")

        return "Hello " + name + "Regift Registry";

    }

    @RequestMapping(value = "goodbye")
    @ResponseBody
    public String goodbye() {
        return "Goodbye";
    }

    //pages to create

    //welcome page logged in

    //welcome page logged out

    //create account page

    //add a custom condition page

    //remove a custom condition page

    //add item page

    //edit item page

    //remove item page

    //view/manage registry page owner

    //view registry page guest

    //data fields for item
        //name
        //image link
        //item link
        //condition
        //source
        //accuracy
        //notes






}
