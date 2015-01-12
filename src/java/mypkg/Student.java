/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mypkg;

public class Student {
   private Integer age;
   private String name;
   private Integer id;

   public void setAge(Integer age) {
       System.out.println("age= "+age);
      
      this.age = age;
   }
   public Integer getAge() {
      return age;
   }

   public void setName(String name) {
      System.out.println("name= "+name);
      this.name = name+"_setted";
   }
   public String getName() {
      return name+"_getted";
   }

   public void setId(Integer id) {
      this.id = id;
   }
   public Integer getId() {
      return id;
   }
}
