package com.ceroja.circleoffifths;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String[] MajorChords = {"C", "G", "D", "A", "E", "B/Cb","Gb/F#","Db/C#","Ab","Eb","Bb","F"};
    String[] minorChords = {"a", "e", "b", "f#", "c#","g#","eb/d#","bb","f","c","g","d"};
    int displace = 0;
    TextView text1;
    TextView text2;
    TextView text3;
    TextView text4;
    TextView text5;
    TextView text6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = (TextView) findViewById(R.id.minor1);
        text2 = (TextView) findViewById(R.id.minor2);
        text3 = (TextView) findViewById(R.id.minor3);
        text4 = (TextView) findViewById(R.id.major1);
        text5 = (TextView) findViewById(R.id.major2);
        text6 = (TextView) findViewById(R.id.major3);

        text1.setText(minorChords[stringRotate(displace - 1)]);
        text2.setText(minorChords[stringRotate(displace + 0)]);
        text3.setText(minorChords[stringRotate(displace + 1)]);

        text4.setText(MajorChords[stringRotate(displace - 1)]);
        text5.setText(MajorChords[stringRotate(displace + 0)]);
        text6.setText(MajorChords[stringRotate(displace + 1)]);
    }

    /** Called when the user taps the Send button */
    public void rotateWheelFifth(View view) {
        // Do something in response to button
        displace = displace + 1;
        text1.setText(minorChords[stringRotate(displace - 1)]);
        text2.setText(minorChords[stringRotate(displace)]);
        text3.setText(minorChords[stringRotate(displace + 1)]);
        text4.setText(MajorChords[stringRotate(displace - 1)]);
        text5.setText(MajorChords[stringRotate(displace)]);
        text6.setText(MajorChords[stringRotate(displace+ 1)]);
    }

    /** Called when the user taps the Send button */
    public void rotateWheelFourth(View view) {
        // Do something in response to button
        displace = displace - 1;
        text1.setText(minorChords[stringRotate(displace - 1)]);
        text2.setText(minorChords[stringRotate(displace)]);
        text3.setText(minorChords[stringRotate(displace + 1)]);
        text4.setText(MajorChords[stringRotate(displace - 1)]);
        text5.setText(MajorChords[stringRotate(displace)]);
        text6.setText(MajorChords[stringRotate(displace+ 1)]);
    }
    public int stringRotate(int chordNumber){
        if (chordNumber < 0)
            chordNumber += 12;
        else
            chordNumber = chordNumber % 12;
        return chordNumber;
    }
}
