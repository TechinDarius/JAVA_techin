import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] words = {"Elephant", "Sunshine", "Computer", "Chocolate", "Butterfly", "Happiness",
                "Adventure", "Universe", "Mystery", "Strawberry", "Knowledge", "Excellent",
                "Friendship", "Rainbow", "Whirlwind", "Beautiful", "Freedom", "Sausage",
                "Symphony", "Laughter", "Elegance", "Midnight", "Basketball", "Dragonfly",
                "Cucumber", "Pineapple", "Serenity", "Enchantment", "Radiance", "Universe",
                "Glorious", "Fantastic", "Symphony", "Elephant", "Strawberry", "Harmony",
                "Sunshine", "Butterfly", "Adventure", "Magnificent", "Victory", "Delightful",
                "Abundance", "Vibrant", "Reflection", "Serendipity", "Resplendent",
                "Breathtaking", "Illumination", "Enigma"};
        String guessWord = randomWord(words);//parenka zodi is saraso
        String star = asterix(guessWord);//zvaigzdutes vietoj zodzio
        //System.out.println(guessWord); // spejamas zodis
        System.out.println("(Guess) Enter a letter in word: " + star);
        String letter = "";

        String firstStars = "", secondStars = "", firstLetters = "", secondLetters = "";
        do {

            letter = scan.nextLine(); //duodam raide
            //guessLetter(guessWord, letter, star);
            while (guessWord.toLowerCase().contains(letter.toLowerCase())) {

                int letterIndex = guessWord.toUpperCase().indexOf(letter.toUpperCase());
                firstStars = star.substring(0, letterIndex);
                secondStars = star.substring(letterIndex + 1);
                firstLetters = guessWord.substring(0, letterIndex);
                secondLetters = guessWord.substring(letterIndex + 1);

                if (letterIndex == 0) {
                    star = firstStars + letter.toUpperCase() + secondStars;
                } else {
                    star = firstStars + letter + secondStars;
                }
                guessWord = firstLetters + "*" + secondLetters;
            }

            System.out.println("(Guess) Enter a letter in word: " + star);
            //System.out.println(guessWord);//kiek liko raidziu speti
        } while (star.contains("*"));
        System.out.println("Congrats! You WIN!");
    }


    public static String randomWord(String[] words) {
        Random rand = new Random();
        String word = words[rand.nextInt(words.length)];
        return word;
    }

    public static String asterix(String myWord) {
        String stars = "";
        for (int i = 0; i < myWord.length(); i++) {
            stars += "*";
        }
        return stars;
    }

//    public static String guessLetter(String guessWord, String letter, String star) {
//        String firstStars, secondStars, firstLetters, secondLetters;
//        while (guessWord.toLowerCase().contains(letter.toLowerCase())) {
//
//            int letterIndex = guessWord.toUpperCase().indexOf(letter.toUpperCase());
//            firstStars = star.substring(0, letterIndex);
//            secondStars = star.substring(letterIndex + 1);
//            firstLetters = guessWord.substring(0, letterIndex);
//            secondLetters = guessWord.substring(letterIndex + 1);
//
//            if (letterIndex == 0) {
//                star = firstStars + letter.toUpperCase() + secondStars;
//            } else {
//                star = firstStars + letter + secondStars;
//            }
//            guessWord = firstLetters + "*" + secondLetters;
//        }
//        System.out.println("(Guess) Enter a letter in word: " + star);
//        return guessWord;
//    }

}