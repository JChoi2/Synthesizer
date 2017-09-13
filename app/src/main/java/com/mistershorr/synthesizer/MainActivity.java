package com.mistershorr.synthesizer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.NumberPicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private NumberPicker num, noteNum;
    private Button aButton, bButton, asButton, cButton, csButton, dButton, dsButton, eButton, fButton, fsButton, gButton, gsButton, challengeButton, numButton, scale2Button, twinke;
    private MediaPlayer aNote, asNote, bNote, cNote, csNote, dNote, dsNote, eNote, fNote, fsNote, gNote, gsNote, haNote, hbNote, hcsNote, hdNote, heNote, hfsNote;
    private MediaPlayer[] notees;
    private MediaPlayer[] scale;
    private MediaPlayer[] twinkesong, twinkesong2;
    private CheckBox sline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        wireWidgets();
        setListeners();
        createMediaPlayers();
    }

    private void createMediaPlayers() {
        aNote = MediaPlayer.create(this, R.raw.scalea);
        asNote = MediaPlayer.create(this, R.raw.scalebb);
        bNote = MediaPlayer.create(this, R.raw.scaleb);

        cNote = MediaPlayer.create(this, R.raw.scalec);
        csNote = MediaPlayer.create(this, R.raw.scalecs);
        dNote = MediaPlayer.create(this, R.raw.scaled);
        dsNote = MediaPlayer.create(this, R.raw.scaleds);
        eNote = MediaPlayer.create(this, R.raw.scalee);
        fNote = MediaPlayer.create(this, R.raw.scalef);
        fsNote = MediaPlayer.create(this, R.raw.scalefs);
        gNote = MediaPlayer.create(this, R.raw.scaleg);
        gsNote = MediaPlayer.create(this, R.raw.scalegs);
        haNote = MediaPlayer.create(this, R.raw.scalehigha);
        hbNote = MediaPlayer.create(this, R.raw.scalehighb);
        hcsNote = MediaPlayer.create(this, R.raw.scalehighcs);
        hdNote = MediaPlayer.create(this, R.raw.scalehighd);
        heNote = MediaPlayer.create(this, R.raw.scalehighe);
        hfsNote = MediaPlayer.create(this, R.raw.scalehighfs);
        notees = new MediaPlayer[] {aNote, asNote, bNote, cNote, csNote, dNote, dsNote, eNote, fNote, fsNote, gNote, gsNote};
        scale = new MediaPlayer[] {eNote, fsNote, gNote, haNote, hbNote, hcsNote, hdNote, heNote};
        twinkesong = new MediaPlayer[] {aNote, aNote, eNote, eNote, fsNote, fsNote, eNote, dNote, dNote, csNote, csNote, bNote, bNote, aNote};
        twinkesong2 = new MediaPlayer[] {eNote, eNote, dNote, dNote, csNote, csNote, bNote};
    }

    private void setListeners() {
        aButton.setOnClickListener(this);
        asButton.setOnClickListener(this);
        bButton.setOnClickListener(this);

        cButton.setOnClickListener(this);
        csButton.setOnClickListener(this);
        dButton.setOnClickListener(this);
        dsButton.setOnClickListener(this);
        eButton.setOnClickListener(this);
        fButton.setOnClickListener(this);
        fsButton.setOnClickListener(this);
        gButton.setOnClickListener(this);
        gsButton.setOnClickListener(this);
        challengeButton.setOnClickListener(this);
        scale2Button.setOnClickListener(this);
        twinke.setOnClickListener(this);
        numButton.setOnClickListener(this);

        noteNum.setMaxValue(12);
        noteNum.setMinValue(1);
        noteNum.setDisplayedValues(new String[] {"aNote", "asNote", "bNote", "cNote", "csNote", "dNote", "dsNote", "eNote", "fNote", "fsNote", "gNote", "gsNote"});
        num = (NumberPicker) findViewById(R.id.numberPicker);
        num.setMaxValue(10);
        num.setMinValue(1);
    }


    private void wireWidgets() {
        aButton = (Button) findViewById(R.id.button_a);
        asButton = (Button) findViewById(R.id.button_as);
        bButton = (Button) findViewById(R.id.button_b);

        cButton = (Button) findViewById(R.id.button_c);
        csButton = (Button) findViewById(R.id.button_cs);
        dButton = (Button) findViewById(R.id.button_d);
        dsButton = (Button) findViewById(R.id.button_ds);
        eButton = (Button) findViewById(R.id.button_e);
        fButton = (Button) findViewById(R.id.button_f);
        fsButton = (Button) findViewById(R.id.button_fs);
        gButton = (Button) findViewById(R.id.button_g);
        gsButton = (Button) findViewById(R.id.button_gs);
        challengeButton = (Button) findViewById(R.id.challenge1);
        scale2Button = (Button) findViewById(R.id.challenge3);
        noteNum = (NumberPicker) findViewById(R.id.notenum);
        numButton = (Button) findViewById(R.id.button_num);
        twinke = (Button) findViewById(R.id.twinke);
        sline = (CheckBox) findViewById(R.id.checkBox);
    }

    private void delayPlaying(int delay)  {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.button_a:
                aNote.seekTo(0);
                aNote.start();
                break;
            case R.id.button_as:
                asNote.seekTo(0);
                asNote.start();
                break;
            case R.id.button_b:
                bNote.seekTo(0);
                bNote.start();
                break;
            case R.id.button_c:
                cNote.seekTo(0);
                cNote.start();
                break;
            case R.id.button_cs:
                csNote.seekTo(0);
                csNote.start();
                break;
            case R.id.button_d:
                dNote.seekTo(0);
                dNote.start();
                break;
            case R.id.button_ds:
                dsNote.seekTo(0);
                dsNote.start();
                break;
            case R.id.button_e:
                eNote.seekTo(0);
                eNote.start();
                break;
            case R.id.button_f:
                fNote.seekTo(0);
                fNote.start();
                break;
            case R.id.button_fs:
                fsNote.seekTo(0);
                fsNote.start();
                break;
            case R.id.button_g:
                gNote.seekTo(0);
                gNote.start();
                break;
            case R.id.button_gs:
                gsNote.seekTo(0);
                gsNote.start();
                break;
            case R.id.challenge1:
                eNote.seekTo(0);
                eNote.start();
                delayPlaying(500);
                fsNote.seekTo(0);
                fsNote.start();
                delayPlaying(500);
                gNote.seekTo(0);
                gNote.start();
                delayPlaying(500);
                haNote.seekTo(0);
                haNote.start();
                delayPlaying(500);
                hbNote.seekTo(0);
                hbNote.start();
                delayPlaying(500);
                hcsNote.seekTo(0);
                hcsNote.start();
                delayPlaying(500);
                hdNote.seekTo(0);
                hdNote.start();
                delayPlaying(500);
                heNote.seekTo(0);
                heNote.start();
                break;
            case R.id.challenge3:
                for(int i = 0 ; i < scale.length ; i++){
                    MediaPlayer a = scale[i];
                    a.seekTo(0);
                    a.start();
                    delayPlaying(500);
                }
            case R.id.twinke:
                for(int i = 0 ; i < twinkesong.length ; i++){
                    MediaPlayer a = twinkesong[i];
                    a.seekTo(0);
                    a.start();
                    delayPlaying(600);
                }
                if (sline.isChecked()) {
                    for (int i = 0; i < twinkesong2.length; i++) {
                        MediaPlayer a = twinkesong2[i];
                        a.seekTo(0);
                        a.start();
                        delayPlaying(600);
                    }
                }

            case R.id.button_num:
                for(int i = 0 ; i < num.getValue() ; i++){
                    MediaPlayer a = notees[noteNum.getValue()-1];
                    a.seekTo(0);
                    a.start();
                    delayPlaying(500);
                }
            default:

        }

    }
}
