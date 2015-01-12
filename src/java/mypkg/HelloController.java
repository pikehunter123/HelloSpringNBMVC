/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mypkg;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author kononov446
 */
@Controller
public class HelloController{
 
   @RequestMapping(value = "hello.htm", method = RequestMethod.GET)
   public String printHello(ModelMap model) {
      model.addAttribute("message", "Hello Spring MVC Framework!");
      return "gogo";
   }
   
   @RequestMapping(value = "uplevel", method = RequestMethod.GET)
   @ExceptionHandler({SpringException.class})
   public String stage(ModelMap model) {
       if  (true)
           throw new SpringException("Samething was wrong");
      model.addAttribute("message", "hrenovuha");
      return "redirect:/pages/23.html";
   }
    @RequestMapping(value = "reddd")
   public String getred(ModelMap model) {
      return "red";
   }
   
   @RequestMapping("load.htm")  
 public ModelAndView test2() {  
  String message = "Welcome ";  
  return new ModelAndView("load", "message", message);  
 }
 
 @RequestMapping(value = "/student", method = RequestMethod.GET)
   public ModelAndView student() {
      return new ModelAndView("student", "command", new Student());
   }
   
   @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
   public String addStudent(@ModelAttribute("SpringWeb")Student student, 
   ModelMap model) {
      model.addAttribute("name", student.getName());
      model.addAttribute("age", student.getAge());
      model.addAttribute("id", student.getId());
      
      return "result";
   }

}