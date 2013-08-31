/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Remote;

/**
 *
 * @author wangxiahao
 */
@Remote
public interface AddServerBeanRemote {

    double add(double n1, double n2);
    
}
