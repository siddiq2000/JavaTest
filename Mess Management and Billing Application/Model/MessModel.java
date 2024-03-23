package Model;

import java.util.*;
public class MessModel{
    private ArrayList<String> Menu;
    private int messBill;
    
    Menu = new ArrayList;
    public ArrayList<String> getMenu() {
        return Menu;
    }
    public void setMenu(ArrayList<String> menu) {
        Menu = menu;
    }
    public int getMessBill() {
        return messBill;
    }
    public void setMessBill(int messBill) {
        this.messBill = messBill;
    }
    
}