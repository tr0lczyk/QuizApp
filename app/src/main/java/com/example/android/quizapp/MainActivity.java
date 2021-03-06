package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    *
    * @method that return's the player name
    *
    *
    * */
    public String playerName() {
        EditText name = findViewById(R.id.player_name);
        return name.getText().toString();
    }

    /*
    *
    * @method that checks if the player choose the answer for the first question correctly
    *
    * */
    public int questionOne() {
        RadioButton buttonCorrectOne = findViewById(R.id.one_good_answer);
        boolean oneGoodAnswer = buttonCorrectOne.isChecked();
        if (oneGoodAnswer) {
            return 1;
        } else {
            return 0;
        }
    }

    /*
    *
    * @method that checks if the player choose the answer for the second question correctly
    *
    * */
    public int questionTwo() {
        CheckBox checkBoxCorrectATwo = findViewById(R.id.two_good_answerA);
        boolean twoGoodAnswerA = checkBoxCorrectATwo.isChecked();
        CheckBox checkBoxCorrectBTwo = findViewById(R.id.two_good_answerB);
        boolean twoGoodAnswerB = checkBoxCorrectBTwo.isChecked();
        CheckBox checkBoxCorrectCTwo = findViewById(R.id.two_good_answerC);
        boolean twoGoodAnswerC = checkBoxCorrectCTwo.isChecked();
        CheckBox checkBoxWrongOne = findViewById(R.id.bad_checkbox_one);
        boolean twoBadAnswerD = checkBoxWrongOne.isChecked();
        if (twoGoodAnswerA && twoGoodAnswerB && twoGoodAnswerC && !twoBadAnswerD) {
            return 1;
        } else {
            return 0;
        }
    }

    /*
    *
    * @method that checks if the player choose the answer for the third question correctly
    *
    * */
    public int questionThree() {
        EditText shipNameCorrect = findViewById(R.id.three_good_answer);
        String threeGoodAnswer = shipNameCorrect.getText().toString().trim();
        String falcon = getText(R.string.MilFal).toString();
        if (threeGoodAnswer.equalsIgnoreCase(falcon)) {
            return 1;
        } else {
            return 0;
        }
    }

    /*
    *
    * @method that checks if the player choose the answer for the fourth question correctly
    *
    * */
    public int questionFour() {
        RadioButton buttonCorrectFour = findViewById(R.id.four_good_answer);
        boolean oneGoodAnswer = buttonCorrectFour.isChecked();
        if (oneGoodAnswer) {
            return 1;
        } else {
            return 0;
        }
    }

    /*
    *
    * @method that checks if the player choose the answer for the fifth question correctly
    *
    * */
    public int questionFive() {
        CheckBox checkBoxCorrectAFive = findViewById(R.id.five_good_answerA);
        boolean fiveGoodAnswerA = checkBoxCorrectAFive.isChecked();
        CheckBox checkBoxCorrectBFive = findViewById(R.id.five_good_answerB);
        boolean fiveGoodAnswerB = checkBoxCorrectBFive.isChecked();
        CheckBox checkBoxWrongTwo = findViewById(R.id.bad_checkbox_two);
        boolean fiveBadAnswerC = checkBoxWrongTwo.isChecked();
        CheckBox checkBoxWrongThree = findViewById(R.id.bad_checkbox_three);
        boolean fiveBadAnswerD = checkBoxWrongThree.isChecked();
        if (fiveGoodAnswerA && fiveGoodAnswerB && !fiveBadAnswerC && !fiveBadAnswerD) {
            return 1;
        } else {
            return 0;
        }
    }

    /*
    *
    * @method that checks total number of correct answers
    *
    * */
    public int sumOfQuestions(int quest, int quest2, int quest3, int quest4, int quest5) {
        int correctAnswers = 0;
        correctAnswers += quest + quest2 + quest3 + quest4 + quest5;
        return correctAnswers;
    }

    /*
    *
    * @method that resets all of the answers
    *
    * */
    public void resetQuestions(View view){

//        GOOD ANSWERS
        RadioButton buttonCorrectOne = findViewById(R.id.one_good_answer);
        buttonCorrectOne.setChecked(false);
        CheckBox checkBoxCorrectATwo = findViewById(R.id.two_good_answerA);
        checkBoxCorrectATwo.setChecked(false);
        CheckBox checkBoxCorrectBTwo = findViewById(R.id.two_good_answerB);
        checkBoxCorrectBTwo.setChecked(false);
        CheckBox checkBoxCorrectCTwo = findViewById(R.id.two_good_answerC);
        checkBoxCorrectCTwo.setChecked(false);
        EditText shipNameCorrect = findViewById(R.id.three_good_answer);
        shipNameCorrect.setText("");
        RadioButton buttonCorrectFour = findViewById(R.id.four_good_answer);
        buttonCorrectFour.setChecked(false);
        CheckBox checkBoxCorrectAFive = findViewById(R.id.five_good_answerA);
        checkBoxCorrectAFive.setChecked(false);
        CheckBox checkBoxCorrectBFive = findViewById(R.id.five_good_answerB);
        checkBoxCorrectBFive.setChecked(false);

//        WRONG ANSWERS
        CheckBox checkBoxWrongOne = findViewById(R.id.bad_checkbox_one);
        checkBoxWrongOne.setChecked(false);
        CheckBox checkBoxWrongTwo = findViewById(R.id.bad_checkbox_two);
        checkBoxWrongTwo.setChecked(false);
        CheckBox checkBoxWrongThree = findViewById(R.id.bad_checkbox_three);
        checkBoxWrongThree.setChecked(false);
        RadioButton checkRadioButtonWrongOne = findViewById(R.id.wrong_radio_one);
        checkRadioButtonWrongOne.setChecked(false);
        RadioButton checkRadioButtonWrongTwo = findViewById(R.id.wrong_radio_two);
        checkRadioButtonWrongTwo.setChecked(false);
        RadioButton checkRadioButtonWrongThree = findViewById(R.id.wrong_radio_three);
        checkRadioButtonWrongThree.setChecked(false);
        RadioButton checkRadioButtonWrongFour = findViewById(R.id.wrong_radio_four);
        checkRadioButtonWrongFour.setChecked(false);
        RadioButton checkRadioButtonWrongFive = findViewById(R.id.wrong_radio_five);
        checkRadioButtonWrongFive.setChecked(false);
        RadioButton checkRadioButtonWrongSix = findViewById(R.id.wrong_radio_six);
        checkRadioButtonWrongSix.setChecked(false);
    }

    /*
    *
    * @method that checks if the player's name was applied
    *
    * */
    public void isNameThere(View view){
        String yourName = getString(R.string.StateName);
        if (playerName().equals("")) {
            Toast.makeText(this, yourName, Toast.LENGTH_LONG).show();
        } else {
            displayToast();
        }
    }

    /*
    *
    * @method that displays a different toast message, based on the number of correct answers
    *
    * */
    public void displayToast() {
        int sumOfAnswers = sumOfQuestions(questionOne(), questionTwo(), questionThree(), questionFour(), questionFive());
        String answerZero = playerName() + getString(R.string.Toast1) + sumOfAnswers + getString(R.string.Toast2);
        String answerOne = playerName() + getString(R.string.Toast3) + sumOfAnswers + getString(R.string.Toast4);
        String answerTwo = getString(R.string.Toast5) + playerName() + getString(R.string.Toast6) + sumOfAnswers + getString(R.string.Toast7);
        String answerThree = getString(R.string.Toast8) + playerName() + getString(R.string.Toast9) + sumOfAnswers + getString(R.string.Toast10);
        String answerFour = getString(R.string.Toast11) + playerName() + getString(R.string.Toast12) + sumOfAnswers + getString(R.string.Toast13);
        String answerFive = getString(R.string.Toast14) + playerName() + getString(R.string.Toast15) + sumOfAnswers + getString(R.string.Toast16);
        if (sumOfAnswers == 0) {
            Toast.makeText(this, answerZero, Toast.LENGTH_LONG).show();
        } else if (sumOfAnswers == 1) {
            Toast.makeText(this, answerOne, Toast.LENGTH_LONG).show();
        } else if (sumOfAnswers == 2) {
            Toast.makeText(this, answerTwo, Toast.LENGTH_LONG).show();
        } else if (sumOfAnswers == 3) {
            Toast.makeText(this, answerThree, Toast.LENGTH_LONG).show();
        } else if (sumOfAnswers == 4) {
            Toast.makeText(this, answerFour, Toast.LENGTH_LONG).show();
        } else if (sumOfAnswers == 5) {
            Toast.makeText(this, answerFive, Toast.LENGTH_LONG).show();
        }
    }
}

