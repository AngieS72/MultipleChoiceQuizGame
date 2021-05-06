package edu.ranken.ashelton.multiplechoicequizgame;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import edu.ranken.ashelton.multiplechoicequizgame.QuizContract.*;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import static edu.ranken.ashelton.multiplechoicequizgame.QuizContract.QuestionsTable.COLUMN_QUESTION;

public class QuizDBHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "MultipleChoiceQuizGameTwo.db";
    private static final int DATABASE_VERSION = 2;

    private SQLiteDatabase db;

    public QuizDBHelper(Context context) {

        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;

// import QuizContract Class then no need to include here as: QuizContract.QuestionsTable...
        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuestionsTable.TABLE_NAME + " ( " +
                QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";

        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestionsTable();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME);
        onCreate(db);
    }

    private void fillQuestionsTable() {
        Question q1 = new Question("Diabetes develops as the result of a problem with which specific organ in the body?",
                "Pancreas", "Kidneys", "Heart", 1);
        addQuestion(q1);
        Question q2 = new Question("Sound travels faster in air than in water.", "True", "False", "", 2);
        addQuestion(q2);
        Question q3 = new Question("This planet spins the fastest, completing one whole rotation in just 10 hours. " + "Which planet is it?", "Mercury", "Saturn", "Jupiter", 3);
        addQuestion(q3);
        Question q4 = new Question("How many elements are there in the periodic table?", "118", "24", "220", 1);
        addQuestion(q4);
        Question q5 = new Question("This planet has a collective 53 moons, making it the planet in our solar system with the most number of moons.", "Pluto", "Saturn", "Venus", 2);
        addQuestion(q5);
        Question q6 = new Question("Where can you find the smallest bone in the human body?", "Hand", "Foot", "Middle Ear", 3);
        addQuestion(q6);
        Question q7 = new Question("Scientists believe that the continents of the earth were all one large landmass 280 million years ago. The moving of tectonic plates caused this mass to break off into different pieces, making up the continents as we know them today. What was this landmass called?",
                "Pangea", "Earth", "Australia",1);
        addQuestion(q7);
        Question q8 = new Question("This theory aims to explain how Pangea became separate continents, suggesting that the movement of tectonic plates caused the mass to break off and drift into different places.",
                "The Big Bang", "The Continental Drift Theory", "Gravitational Force", 2);
        addQuestion(q8);
        Question q9 = new Question("How many hearts does an octopus have?", "1", "2", "3", 3);
        addQuestion(q9);
        Question q10 = new Question( "True or false: male seahorses give birth to their young,not the females.", "True", "False", "", 1);
        addQuestion(q10);
        Question q11= new Question( "The oldest living tree is 4,843 years old and can be found where?", "Arctic", "California", "Laika", 2);
        addQuestion(q11);
        Question q12 = new Question("Can you hear anything in outer space?", "Yes", "No", "", 2);
        addQuestion(q12);
        Question q13= new Question("This man is responsible for reshaping the way early man believed the solar system worked. He proposed that the Earth was not the center of the universe, and that the sun was instead at the center of our solar system. Who was he?",
                "Galileo", "Hawking", "Copernicus", 3);
        addQuestion(q13);
        Question q14 = new Question( "From what tree do acorns come from?", "Maple", "Aspen", "Oak", 3);
        addQuestion(q14);
        Question q15 = new Question("What is the tallest type of grass?", "Bamboo", "Fescue", "Zoysia", 1);
        addQuestion(q15);
        Question q16 = new Question( "Dolly was the first ever living creature to be cloned. What type of animal was she?", "Monkey", "Sheep", "Dog", 2);
        addQuestion(q16);
        Question q17 = new Question( "This animal was the first ever to be launched into space. She was strapped into the Soviet Sputnik 2                 spacecraft which was sent out into outer space on November 3, 1957. What was her name?", "Laika", "Rose", "Katarina", 1);
        addQuestion(q17);
        Question q18 = new Question("Laika was the first ever animal to be launched into space via the Soviet Sputnik 2 on November 3, 1957. What type of animal was Laika?", "Llama", "Dog", "Monkey", 2);
        addQuestion(q18);
        Question q19 = new Question("An egg’s shell is what percentage of its total weight?", "1", "50", "12", 3);
        addQuestion(q19);
        Question q20 = new Question("What is the smallest country in the world?", "Vatican City", "Argentina", "Japan", 1);
        addQuestion(q20);
        Question q21 = new Question("Who is regarded as the man who invented the telephone?", "Thomas Edison", "Alexander Graham Bell", "Nikola Tesla", 2);
        addQuestion(q21);
        Question q22 = new Question("What is considered the highest mountain in Africa?", "Mount Everest", "Mount Shasta", "Mount Kilimanjaro", 3);
        addQuestion(q22);
        Question q23 = new Question("In what year was Alaska sold to the United States of America?", "1867", "1776", "1950", 1);
        addQuestion(q23);
        Question q24 = new Question("How many bones do sharks have in total?", "125", "Zero", "50", 2);
        addQuestion(q24);
        Question q25 = new Question( "Discovered by Alexander Fleming, this is now used to treat infections and is considered one of the most important discoveries in the field of medical science. What is it?", "Honey", "Isopropyl Alcohol", "Penicillin", 3);
        addQuestion(q25);
        Question q26 = new Question("This measurement – approximately six feet – is used to measure the depth of water. What is it?", "Fathom", "League", "Knots", 1);
        addQuestion(q26);
        Question q27 = new Question("What is a geiger counter used to measure?", "Barometric Pressure", "Radiation", "Heat", 2);
        addQuestion(q27);
        Question q28 = new Question("What is the hardest known natural material?", "Steel", "Sapphires", "Diamonds", 3);
        addQuestion(q28);
        Question q29 = new Question("True or false: your hair and your nails are made from the same material.", "True", "False", "", 1);
        addQuestion(q29);
        Question q30 = new Question("This part of the brain deals with hearing and language.", "Cerebellum", "Temporal Lobe", "Cortex", 2);
        addQuestion(q30);
    }

    private void addQuestion(Question question) {
        ContentValues cv = new ContentValues();
        cv.put(QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion());
        cv.put(QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1());
        cv.put(QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2());
        cv.put(QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3());
        cv.put(QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr());
        db.insert(QuizContract.QuestionsTable.TABLE_NAME, null, cv);
    }

    public ArrayList<Question> getAllQuestions() {
        ArrayList<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME, null);
        if (c.moveToFirst()) {
            do {
                Question question = new Question();
                question.setQuestion(c.getString(c.getColumnIndex(COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuizContract.QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuizContract.QuestionsTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuizContract.QuestionsTable.COLUMN_OPTION3)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuizContract.QuestionsTable.COLUMN_ANSWER_NR)));

                questionList.add(question);
            }
            while (c.moveToNext());
        }

        c.close();
        return questionList;

    }

    public ArrayList<Question> getQuestions() {
        ArrayList<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + QuestionsTable.TABLE_NAME, null);
        if (c.moveToFirst()) {
            do {
                Question question = new Question();
                question.setQuestion(c.getString(c.getColumnIndex(COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuizContract.QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuizContract.QuestionsTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuizContract.QuestionsTable.COLUMN_OPTION3)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuizContract.QuestionsTable.COLUMN_ANSWER_NR)));
                questionList.add(question);
            }
            while (c.moveToNext());
        }

        c.close();
        return questionList;

    }
}
