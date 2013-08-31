/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Stateful;

/**
 *
 * @author wangxiahao
 */
@Stateful
public class AddServerBean implements AddServerBeanRemote {

    @Override
   public double add(double n1, double n2){
       System.out.println("Number added are "+n1 +" "+n2);
       System.out.println("Total is " + (n1+n2));
       return n1+n2;
   }
}
