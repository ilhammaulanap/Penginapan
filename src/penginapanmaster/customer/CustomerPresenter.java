/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penginapanmaster.customer;
/**
 *
 * @author Lukman
 */
public class CustomerPresenter{
    
     public static void getCustomer() {      
        CustomerView cs = new CustomerView();
        cs.setVisible(true);
        cs.setResizable(false);
        cs.setTitle("Oleg Hotel");
        cs.setLocationRelativeTo(null);
    }
}
