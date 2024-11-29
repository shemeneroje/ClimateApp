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
public class Questions {
    private final ArrayList<Options> questions; // ArrayList of questions

    public Questions() {
        this.questions = new ArrayList<>();
        loadQuestions();
    }

    private void loadQuestions() {
        ArrayList<String> options1 = new ArrayList<>();
        options1.add("A type of weather");
        options1.add("A kind of cloud");
        options1.add("A season");
        options1.add("Long-term changes in temperature and weather patterns");
        questions.add(new Options(1, "What is Climate Change?", options1, "Long-term changes in temperature and weather patterns"));

        ArrayList<String> options2 = new ArrayList<>();
        options2.add("To create more trash");
        options2.add("To fill up landfills faster");
        options2.add("To make more pollution");
        options2.add("To help protect the environment by reusing materials");
        questions.add(new Options(2, "Why should we recycle?", options2, "To help protect the environment by reusing materials"));

        ArrayList<String> options3 = new ArrayList<>();
        options3.add("Cat");
        options3.add("Dog");
        options3.add("Elephant");
        options3.add("Polar bear");
        questions.add(new Options(3, "Which of these animals is endangered due to climate change?", options3, "Polar bear"));

        ArrayList<String> options4 = new ArrayList<>();
        options4.add("Leave the tap running");
        options4.add("Use more water");
        options4.add("Water plants in the middle of the day");
        options4.add("Turn off the tap when brushing teeth");
        questions.add(new Options(4, "What is one thing we can do to save water?", options4, "Turn off the tap when brushing teeth"));

        ArrayList<String> options5 = new ArrayList<>();
        options5.add("Using more plastic");
        options5.add("Driving everywhere");
        options5.add("Burning more coal");
        options5.add("Planting trees");
        questions.add(new Options(5, "Which of these actions can help reduce air pollution?", options5, "Planting trees"));

        ArrayList<String> options6 = new ArrayList<>();
        options6.add("Leaving all the lights on at night.");
        options6.add("Using more appliances at the same time.");
        options6.add("Ignoring energy-saving practices in daily life.");
        options6.add("Using energy efficiently to reduce waste.");
        questions.add(new Options(6, "What does it mean to conserve energy?", options6, "Using energy efficiently to reduce waste."));

        ArrayList<String> options7 = new ArrayList<>();
        options7.add("An amusement park");
        options7.add("A playground");
        options7.add("A food source");
        options7.add("A place to live");
        questions.add(new Options(7, "What do coral reefs provide for ocean animals?", options7, "A place to live"));

        ArrayList<String> options8 = new ArrayList<>();
        options8.add("Trees make paper");
        options8.add("Trees block the sun");
        options8.add("Trees are good for climbing");
        options8.add("Trees produce oxygen, which we breathe");
        questions.add(new Options(8, "Why is planting trees good for the Earth?", options8, "Trees produce oxygen, which we breathe"));

        ArrayList<String> options9 = new ArrayList<>();
        options9.add("It will dissolve quickly and disappear.");
        options9.add("It can turn into clean drinking water.");
        options9.add("It can make the ocean smell fresher.");
        options9.add("It can harm marine life and pollute the water for years.");
        questions.add(new Options(9, "What can happen if we throw plastic in the ocean?", options9, "It can harm marine life and pollute the water for years."));

        ArrayList<String> options10 = new ArrayList<>();
        options10.add("A type of food");
        options10.add("A type of weather");
        options10.add("A type of clothing");
        options10.add("A place where plants and animals live");
        questions.add(new Options(10, "What is a habitat?", options10, "A place where plants and animals live"));
    }

    // Return all questions
    public ArrayList<Options> getQuestions() {
        return questions; // Return the entire list of questions
    }

    // Return a specific question by index
    public Options getQuestion(int index) {
        if (index >= 0 && index < questions.size()) {
            return questions.get(index);
        }
        return null; // Handle invalid index gracefully
    }

    public int getSize() {
        return questions.size();
    }
}

