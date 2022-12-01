package day01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class day01_original {
    public static void main(String[] args) throws Exception {
        File file = new File("day01/input.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        List<String> data = new ArrayList<String>();

        String currentLine;
        while((currentLine = br.readLine()) != null) {
            data.add(currentLine);
        }

        br.close();

        partOne(data);
        partTwo(data);
    }

    public static void partOne(List<String> data) {
        List<Integer> listOfCalories = new ArrayList<Integer>();
        int currentCalories = 0;

        int position = 0;
        for (String food: data) {
            if(food.length() == 0) { // End of current elf's inventory
                listOfCalories.add(currentCalories);
                currentCalories = 0;
                position++;
                continue;
            }
            
            int calories = Integer.valueOf(food);
            currentCalories += calories;

            position++;

            if(position == data.size()) {
                listOfCalories.add(currentCalories);
            }
        }
        Collections.sort(listOfCalories);

        int top = listOfCalories.get(listOfCalories.size() - 1);

        System.out.println(top);
    }

    public static void partTwo(List<String> data) {
        List<Integer> listOfCalories = new ArrayList<Integer>();
        int currentCalories = 0;

        int position = 0;
        for (String food: data) {
            if(food.length() == 0) { // End of current elf's inventory
                listOfCalories.add(currentCalories);
                currentCalories = 0;
                position++;
                continue;
            }
            
            int calories = Integer.valueOf(food);
            currentCalories += calories;

            position++;

            if(position == data.size()) {
                listOfCalories.add(currentCalories);
            }
        }
        Collections.sort(listOfCalories);

        int topThree = listOfCalories.get(listOfCalories.size() - 1) + listOfCalories.get(listOfCalories.size() - 2) + listOfCalories.get(listOfCalories.size() - 3);

        System.out.println(topThree);
    }
}
