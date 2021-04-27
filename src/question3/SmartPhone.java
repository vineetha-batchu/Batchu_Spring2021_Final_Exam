/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author Vineetha Batchu
 */
public class SmartPhone extends MobilePhone {
    private boolean istouch;

    public SmartPhone(boolean istouch, String name) {
        super(name);
        this.istouch = istouch;
    }

    public boolean isIstouch() {
        return istouch;
    }

    public void setIstouch(boolean istouch) {
        this.istouch = istouch;
    }

    @Override
    public String toString() {
        return "SmartPhone{" + "istouch=" + istouch + "Name "+super.getName()+ '}';
    }
    
    
}
