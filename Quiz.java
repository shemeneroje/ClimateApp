    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package climateapp;



/**
 *
 * @author shemeneroje
 */
public class Quiz {
    protected int num; 
    protected String text; 

    public Quiz(int num, String text) {
        this.num = num;
        this.text = text;
    }

    public int getNum() {
        return num;
    }

    public String getText() {
        return text;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setText(String text) {
        this.text = text;
    }
}