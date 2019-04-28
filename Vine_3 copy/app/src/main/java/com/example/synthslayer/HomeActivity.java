package com.example.synthslayer;
//
//import android.media.MediaPlayer;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//
//import android.view.View;
//import android.widget.Button;
//import java.util.Random;
//
//public class HomeActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_home);
//    }
//}
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import java.util.Random;


public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
//Random
        final MediaPlayer target = MediaPlayer.create(this, R.raw.target);
        final MediaPlayer skinny_penis = MediaPlayer.create(this, R.raw.skinny_penis);
        final MediaPlayer hot_tub = MediaPlayer.create(this, R.raw.hot_tub);
        final MediaPlayer hat_back = MediaPlayer.create(this, R.raw.hat_back);
        final MediaPlayer church_girl = MediaPlayer.create(this, R.raw.church_girl);
        final MediaPlayer wtf_richard = MediaPlayer.create(this, R.raw.wtf_richard);
//CS Feels
        final MediaPlayer gamecube_shit = MediaPlayer.create(this, R.raw.gamecube_shit);
        final MediaPlayer garbage = MediaPlayer.create(this, R.raw.garbage);
        final MediaPlayer aa_aaa = MediaPlayer.create(this, R.raw.aa_aaa);
        final MediaPlayer no_head = MediaPlayer.create(this, R.raw.no_head);
        final MediaPlayer bday_gift = MediaPlayer.create(this, R.raw.bday_gift);
        final MediaPlayer free_taco = MediaPlayer.create(this, R.raw.free_taco);
//Entering CBTF
        final MediaPlayer jesus_christ = MediaPlayer.create(this, R.raw.jesus_christ);
        final MediaPlayer harry_potter = MediaPlayer.create(this, R.raw.harry_potter);
        final MediaPlayer mother_trucker = MediaPlayer.create(this, R.raw.mother_trucker);
        final MediaPlayer you_running = MediaPlayer.create(this, R.raw.you_running);
        final MediaPlayer walk_away = MediaPlayer.create(this, R.raw.walk_away);
        final MediaPlayer burnt_chicken = MediaPlayer.create(this, R.raw.burnt_chicken);
//Green on a MP
        final MediaPlayer guacamole = MediaPlayer.create(this, R.raw.guacamole);
        final MediaPlayer mexican_dog = MediaPlayer.create(this, R.raw.mexican_dog);
        final MediaPlayer breaking_free = MediaPlayer.create(this, R.raw.breaking_free);
        final MediaPlayer merry_chrysler = MediaPlayer.create(this, R.raw.merry_chrysler);
        final MediaPlayer you_bitch = MediaPlayer.create(this, R.raw.you_bitch);
        final MediaPlayer cant_kill = MediaPlayer.create(this, R.raw.cant_kill);
//Me in Lecture
        final MediaPlayer idiot_sandwhich = MediaPlayer.create(this, R.raw.idiot_sandwhich);
        final MediaPlayer confusion = MediaPlayer.create(this, R.raw.confusion);
        final MediaPlayer ok = MediaPlayer.create(this, R.raw.ok);
        final MediaPlayer im_jared = MediaPlayer.create(this, R.raw.im_jared);
        final MediaPlayer this_graph = MediaPlayer.create(this, R.raw.this_graph);
        final MediaPlayer shut_up = MediaPlayer.create(this, R.raw.shut_up);
//Jeff with a G
        final MediaPlayer up_kyle = MediaPlayer.create(this, R.raw.up_kyle);
        final MediaPlayer my_dad = MediaPlayer.create(this, R.raw.my_dad);
        final MediaPlayer not_correct = MediaPlayer.create(this, R.raw.not_correct);
        final MediaPlayer just_fam = MediaPlayer.create(this, R.raw.just_fam);
        final MediaPlayer have_consequences = MediaPlayer.create(this, R.raw.have_consequences);
        final MediaPlayer cant_believe = MediaPlayer.create(this, R.raw.cant_believe);
        // All categories
        Button playRandomVines = this.findViewById(R.id.random_vines);
        Button playCSFeels = this.findViewById(R.id.cs_feels);
        Button playEnteringCBTF = this.findViewById(R.id.entering_cbtf);
        Button playGreenOnMP = this.findViewById(R.id.green_mp);
        Button playMeInLecture = this.findViewById(R.id.me_lecture);
        Button playGeoff = this.findViewById(R.id.why_geoff);

        playRandomVines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int random = new Random().nextInt(6) + 1; // [0, 6] + 1 => [1, 6]
                if (random == 1) {
                    target.start();
                } else if (random == 2) {
                    skinny_penis.start();
                } else if (random == 3) {
                    hot_tub.start();
                } else if (random == 4) {
                    hat_back.start();
                } else if (random == 5) {
                    church_girl.start();
                } else if (random == 6) {
                    wtf_richard.start();
                }

            }
        });

        playCSFeels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int random = new Random().nextInt(6) + 1; // [0, 6] + 1 => [1, 6]
                if (random == 1) {
                    gamecube_shit.start();
                } else if (random == 2) {
                    garbage.start();
                } else if (random == 3) {
                    aa_aaa.start();
                } else if (random == 4) {
                    no_head.start();
                } else if (random == 5) {
                    bday_gift.start();
                } else if (random == 6) {
                    free_taco.start();
                }
            }
        });

        playEnteringCBTF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int random = new Random().nextInt(6) + 1; // [0, 6] + 1 => [1, 6]
                if (random == 1) {
                    jesus_christ.start();
                } else if (random == 2) {
                    harry_potter.start();
                } else if (random == 3) {
                    mother_trucker.start();
                } else if (random == 4) {
                    you_running.start();
                } else if (random == 5) {
                    walk_away.start();
                } else if (random == 6) {
                    burnt_chicken.start();
                }
            }
        });

        playGreenOnMP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int random = new Random().nextInt(6) + 1; // [0, 6] + 1 => [1, 6]
                if (random == 1) {
                    guacamole.start();
                } else if (random == 2) {
                    mexican_dog.start();
                } else if (random == 3) {
                    breaking_free.start();
                } else if (random == 4) {
                    merry_chrysler.start();
                } else if (random == 5) {
                    you_bitch.start();
                } else if (random == 6) {
                    cant_kill.start();
                }
            }
        });

        playMeInLecture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int random = new Random().nextInt(6) + 1; // [0, 6] + 1 => [1, 6]
                if (random == 1) {
                    idiot_sandwhich.start();
                } else if (random == 2) {
                    confusion.start();
                } else if (random == 3) {
                    ok.start();
                } else if (random == 4) {
                    im_jared.start();
                } else if (random == 5) {
                    this_graph.start();
                } else if (random == 6) {
                    shut_up.start();
                }
            }
        });

        playGeoff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int random = new Random().nextInt(6) + 1; // [0, 6] + 1 => [1, 6]
                if (random == 1) {
                    up_kyle.start();
                } else if (random == 2) {
                    my_dad.start();
                } else if (random == 3) {
                    not_correct.start();
                } else if (random == 4) {
                    just_fam.start();
                } else if (random == 5) {
                    have_consequences.start();
                } else if (random == 6) {
                    cant_believe.start();
                }
            }
        });
    }
}