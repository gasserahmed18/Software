/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass4;

/**
 *
 * @author Ahmed Rateb
 */
public class Booking extends Playground {

    private String slot;

    public String getSlot() {
        return slot;
    }

    public void displayAvailableHours() {

        for (int i = 0; i < getAvaliableHours().size(); i++) {
            System.out.println(getAvaliableHours().get(i));
        }
    }

    public String selectAvailableHours(String selectedslot) {
        for (int i = 0; i < getAvaliableHours().size(); i++) {
            if (getAvaliableHours().get(i).equals(selectedslot)) {
                System.out.println("Booking is done");
                String temp = getAvaliableHours().get(i);
                changeAvaliableHours(selectedslot);
                slot = temp;
                return temp;
            }
        }
        System.out.println(" please check the hours again and try again");

        return null;
    }

}
