/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise8;

/**
 *
 * @author Nguyen Trong Thuan
 * @date: 20/08/2016
 * @version 1 
 * ------------------------ 
 * create class trooper
 */
public class Trooper extends Soldier {

    public Trooper(String name, int power, String weapon) {
        super(name, power, weapon);
    }

    @Override
    public void fight() {
        this.setPower(this.getPower() - 3);
    }
}
