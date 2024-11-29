/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package climateapp;

import java.util.ArrayList;

/**
 *
 * @author shemeneroje
 */
public class Options extends Quiz {
    //declare varible
    private ArrayList<String> options; 
    private String correctAnswer; 

    //constuctor
    public Options(int num, String text, ArrayList<String> options, String correctAnswer) {
        super(num, text); // Call the superclass constructor
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    //getters and setters
    public ArrayList<String> getOptions() {
        return options;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getQuestionText() {
        return this.getText();
    }
}