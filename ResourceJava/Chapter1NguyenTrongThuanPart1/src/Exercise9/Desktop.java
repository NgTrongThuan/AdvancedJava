/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise9;

/**
 *
 * @author Nguyen Trong Thuan
 * @date: 20/08/2016
 * @version 1
 * ----------------------------
 * class desktop
 */
public class Desktop extends Computer{
    private String cpu;
    private String ram;

    public Desktop() {
    }

    public Desktop(String cpu, String ram, String seri, double price, String brand, int quantity) {
        super(seri, price, brand, quantity);
        this.cpu = cpu;
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }
    
    @Override
    public void showInformation(){
        super.showInformation();
        System.out.println("CPU: " + this.cpu);
        System.out.println("RAM: " + this.ram);
    }
}
