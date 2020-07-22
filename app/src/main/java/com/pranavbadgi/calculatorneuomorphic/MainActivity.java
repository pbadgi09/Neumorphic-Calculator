package com.pranavbadgi.calculatorneuomorphic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.View;

import com.pranavbadgi.calculatorneuomorphic.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;
    float mValueOne, mValueTwo;
    boolean add,subtract,divide,multiply;
    Vibrator vibrator;
    MediaPlayer mp;
    final static long REFRESH_TIME = 100;
    final Handler handler = new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);


        initializer();
        listener();

        final Runnable runnable = new Runnable() {
            @Override
            public void run() {
                //call method here
                reset();
                handler.postDelayed(this,REFRESH_TIME);
            }
        };


    View view = getWindow().getDecorView().getRootView();
    view.setOnTouchListener(new View.OnTouchListener() {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            switch(event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    handler.post(runnable);
                    break;
                case MotionEvent.ACTION_UP:
                    handler.removeCallbacks(runnable);
                    break;
            }
            return false;
        }
    });

    }

    private void reset() {
        binding.one.setImageResource(R.drawable.one);
        binding.two.setImageResource(R.drawable.two);
        binding.three.setImageResource(R.drawable.three);
        binding.four.setImageResource(R.drawable.four);
        binding.five.setImageResource(R.drawable.five);
        binding.six.setImageResource(R.drawable.six);
        binding.seven.setImageResource(R.drawable.seven);
        binding.eight.setImageResource(R.drawable.eight);
        binding.nine.setImageResource(R.drawable.nine);
        binding.zero.setImageResource(R.drawable.zero);
        binding.plus.setImageResource(R.drawable.plus);
        binding.minus.setImageResource(R.drawable.minus);
        binding.multiply.setImageResource(R.drawable.multiply);
        binding.divide.setImageResource(R.drawable.divide);
        binding.clear.setImageResource(R.drawable.ac);
        binding.equals.setImageResource(R.drawable.equals);
        binding.textView.setText("");
    }


    private void initializer() {
        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        mp = MediaPlayer.create(this,R.raw.buttonclick);
    }

    private void listener() {

        binding.one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound();
                binding.one.setImageResource(R.drawable.onep);
                binding.textView.setText(binding.textView.getText() + "1");

                //resetting other images
                binding.two.setImageResource(R.drawable.two);
                binding.three.setImageResource(R.drawable.three);
                binding.four.setImageResource(R.drawable.four);
                binding.five.setImageResource(R.drawable.five);
                binding.six.setImageResource(R.drawable.six);
                binding.seven.setImageResource(R.drawable.seven);
                binding.eight.setImageResource(R.drawable.eight);
                binding.nine.setImageResource(R.drawable.nine);
                binding.zero.setImageResource(R.drawable.zero);
                binding.plus.setImageResource(R.drawable.plus);
                binding.minus.setImageResource(R.drawable.minus);
                binding.multiply.setImageResource(R.drawable.multiply);
                binding.divide.setImageResource(R.drawable.divide);
                binding.clear.setImageResource(R.drawable.ac);
                binding.equals.setImageResource(R.drawable.equals);
            }
        });

        binding.two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound();
                binding.two.setImageResource(R.drawable.twop);
                binding.textView.setText(binding.textView.getText() + "2");

                //resetting other images
                binding.one.setImageResource(R.drawable.one);
                binding.three.setImageResource(R.drawable.three);
                binding.four.setImageResource(R.drawable.four);
                binding.five.setImageResource(R.drawable.five);
                binding.six.setImageResource(R.drawable.six);
                binding.seven.setImageResource(R.drawable.seven);
                binding.eight.setImageResource(R.drawable.eight);
                binding.nine.setImageResource(R.drawable.nine);
                binding.zero.setImageResource(R.drawable.zero);
                binding.plus.setImageResource(R.drawable.plus);
                binding.minus.setImageResource(R.drawable.minus);
                binding.multiply.setImageResource(R.drawable.multiply);
                binding.divide.setImageResource(R.drawable.divide);
                binding.clear.setImageResource(R.drawable.ac);
                binding.equals.setImageResource(R.drawable.equals);
            }
        });

        binding.three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound();
                binding.three.setImageResource(R.drawable.threep);
                binding.textView.setText(binding.textView.getText() + "3");

                //resetting other images
                binding.two.setImageResource(R.drawable.two);
                binding.one.setImageResource(R.drawable.one);
                binding.four.setImageResource(R.drawable.four);
                binding.five.setImageResource(R.drawable.five);
                binding.six.setImageResource(R.drawable.six);
                binding.seven.setImageResource(R.drawable.seven);
                binding.eight.setImageResource(R.drawable.eight);
                binding.nine.setImageResource(R.drawable.nine);
                binding.zero.setImageResource(R.drawable.zero);
                binding.plus.setImageResource(R.drawable.plus);
                binding.minus.setImageResource(R.drawable.minus);
                binding.multiply.setImageResource(R.drawable.multiply);
                binding.divide.setImageResource(R.drawable.divide);
                binding.clear.setImageResource(R.drawable.ac);
                binding.equals.setImageResource(R.drawable.equals);
            }
        });

        binding.four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound();
                binding.four.setImageResource(R.drawable.fourp);
                binding.textView.setText(binding.textView.getText() + "4");

                //resetting other images
                binding.two.setImageResource(R.drawable.two);
                binding.three.setImageResource(R.drawable.three);
                binding.one.setImageResource(R.drawable.one);
                binding.five.setImageResource(R.drawable.five);
                binding.six.setImageResource(R.drawable.six);
                binding.seven.setImageResource(R.drawable.seven);
                binding.eight.setImageResource(R.drawable.eight);
                binding.nine.setImageResource(R.drawable.nine);
                binding.zero.setImageResource(R.drawable.zero);
                binding.plus.setImageResource(R.drawable.plus);
                binding.minus.setImageResource(R.drawable.minus);
                binding.multiply.setImageResource(R.drawable.multiply);
                binding.divide.setImageResource(R.drawable.divide);
                binding.clear.setImageResource(R.drawable.ac);
                binding.equals.setImageResource(R.drawable.equals);
            }
        });

        binding.five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound();
                binding.five.setImageResource(R.drawable.fivep);
                binding.textView.setText(binding.textView.getText() + "5");

                //resetting other images
                binding.two.setImageResource(R.drawable.two);
                binding.three.setImageResource(R.drawable.three);
                binding.four.setImageResource(R.drawable.four);
                binding.one.setImageResource(R.drawable.one);
                binding.six.setImageResource(R.drawable.six);
                binding.seven.setImageResource(R.drawable.seven);
                binding.eight.setImageResource(R.drawable.eight);
                binding.nine.setImageResource(R.drawable.nine);
                binding.zero.setImageResource(R.drawable.zero);
                binding.plus.setImageResource(R.drawable.plus);
                binding.minus.setImageResource(R.drawable.minus);
                binding.multiply.setImageResource(R.drawable.multiply);
                binding.divide.setImageResource(R.drawable.divide);
                binding.clear.setImageResource(R.drawable.ac);
                binding.equals.setImageResource(R.drawable.equals);
            }
        });

        binding.six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound();
                binding.six.setImageResource(R.drawable.sixp);
                binding.textView.setText(binding.textView.getText() + "6");

                //resetting other images
                binding.two.setImageResource(R.drawable.two);
                binding.three.setImageResource(R.drawable.three);
                binding.four.setImageResource(R.drawable.four);
                binding.five.setImageResource(R.drawable.five);
                binding.one.setImageResource(R.drawable.one);
                binding.seven.setImageResource(R.drawable.seven);
                binding.eight.setImageResource(R.drawable.eight);
                binding.nine.setImageResource(R.drawable.nine);
                binding.zero.setImageResource(R.drawable.zero);
                binding.plus.setImageResource(R.drawable.plus);
                binding.minus.setImageResource(R.drawable.minus);
                binding.multiply.setImageResource(R.drawable.multiply);
                binding.divide.setImageResource(R.drawable.divide);
                binding.clear.setImageResource(R.drawable.ac);
                binding.equals.setImageResource(R.drawable.equals);
            }
        });


        binding.seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound();
                binding.seven.setImageResource(R.drawable.sevenp);
                binding.textView.setText(binding.textView.getText() + "7");

                //resetting other images
                binding.two.setImageResource(R.drawable.two);
                binding.three.setImageResource(R.drawable.three);
                binding.four.setImageResource(R.drawable.four);
                binding.five.setImageResource(R.drawable.five);
                binding.six.setImageResource(R.drawable.six);
                binding.one.setImageResource(R.drawable.one);
                binding.eight.setImageResource(R.drawable.eight);
                binding.nine.setImageResource(R.drawable.nine);
                binding.zero.setImageResource(R.drawable.zero);
                binding.plus.setImageResource(R.drawable.plus);
                binding.minus.setImageResource(R.drawable.minus);
                binding.multiply.setImageResource(R.drawable.multiply);
                binding.divide.setImageResource(R.drawable.divide);
                binding.clear.setImageResource(R.drawable.ac);
                binding.equals.setImageResource(R.drawable.equals);
            }
        });

        binding.eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound();
                binding.eight.setImageResource(R.drawable.eightp);
                binding.textView.setText(binding.textView.getText() + "8");

                //resetting other images
                binding.two.setImageResource(R.drawable.two);
                binding.three.setImageResource(R.drawable.three);
                binding.four.setImageResource(R.drawable.four);
                binding.five.setImageResource(R.drawable.five);
                binding.six.setImageResource(R.drawable.six);
                binding.seven.setImageResource(R.drawable.seven);
                binding.one.setImageResource(R.drawable.one);
                binding.nine.setImageResource(R.drawable.nine);
                binding.zero.setImageResource(R.drawable.zero);
                binding.plus.setImageResource(R.drawable.plus);
                binding.minus.setImageResource(R.drawable.minus);
                binding.multiply.setImageResource(R.drawable.multiply);
                binding.divide.setImageResource(R.drawable.divide);
                binding.clear.setImageResource(R.drawable.ac);
                binding.equals.setImageResource(R.drawable.equals);
            }
        });

        binding.nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound();
                binding.nine.setImageResource(R.drawable.ninep);
                binding.textView.setText(binding.textView.getText() + "9");

                //resetting other images
                binding.two.setImageResource(R.drawable.two);
                binding.three.setImageResource(R.drawable.three);
                binding.four.setImageResource(R.drawable.four);
                binding.five.setImageResource(R.drawable.five);
                binding.six.setImageResource(R.drawable.six);
                binding.seven.setImageResource(R.drawable.seven);
                binding.eight.setImageResource(R.drawable.eight);
                binding.one.setImageResource(R.drawable.one);
                binding.zero.setImageResource(R.drawable.zero);
                binding.plus.setImageResource(R.drawable.plus);
                binding.minus.setImageResource(R.drawable.minus);
                binding.multiply.setImageResource(R.drawable.multiply);
                binding.divide.setImageResource(R.drawable.divide);
                binding.clear.setImageResource(R.drawable.ac);
                binding.equals.setImageResource(R.drawable.equals);
            }
        });


        binding.zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound();
                binding.zero.setImageResource(R.drawable.zerop);
                binding.textView.setText(binding.textView.getText() + "0");

                //resetting other images
                binding.two.setImageResource(R.drawable.two);
                binding.three.setImageResource(R.drawable.three);
                binding.four.setImageResource(R.drawable.four);
                binding.five.setImageResource(R.drawable.five);
                binding.six.setImageResource(R.drawable.six);
                binding.seven.setImageResource(R.drawable.seven);
                binding.eight.setImageResource(R.drawable.eight);
                binding.nine.setImageResource(R.drawable.nine);
                binding.one.setImageResource(R.drawable.one);
                binding.plus.setImageResource(R.drawable.plus);
                binding.minus.setImageResource(R.drawable.minus);
                binding.multiply.setImageResource(R.drawable.multiply);
                binding.divide.setImageResource(R.drawable.divide);
                binding.clear.setImageResource(R.drawable.ac);
                binding.equals.setImageResource(R.drawable.equals);
            }
        });


        binding.equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound();
                binding.equals.setImageResource(R.drawable.equalsp);
                mValueTwo = Float.parseFloat(binding.textView.getText() + "");

                //resetting other images
                binding.two.setImageResource(R.drawable.two);
                binding.three.setImageResource(R.drawable.three);
                binding.four.setImageResource(R.drawable.four);
                binding.five.setImageResource(R.drawable.five);
                binding.six.setImageResource(R.drawable.six);
                binding.seven.setImageResource(R.drawable.seven);
                binding.eight.setImageResource(R.drawable.eight);
                binding.nine.setImageResource(R.drawable.nine);
                binding.zero.setImageResource(R.drawable.zero);
                binding.plus.setImageResource(R.drawable.plus);
                binding.minus.setImageResource(R.drawable.minus);
                binding.multiply.setImageResource(R.drawable.multiply);
                binding.divide.setImageResource(R.drawable.divide);
                binding.clear.setImageResource(R.drawable.ac);
                binding.one.setImageResource(R.drawable.one);


                if(add == true) {
                    binding.textView.setText(mValueOne + mValueTwo + "");
                    add = false;
                }

                if(subtract == true) {
                    binding.textView.setText(mValueOne - mValueTwo + "");
                    subtract = false;
                }

                if(divide == true) {
                    binding.textView.setText(mValueOne / mValueTwo + "");
                    divide = false;
                }
                if(multiply == true) {
                    binding.textView.setText(mValueOne * mValueTwo + "");
                    multiply = false;
                }
            }
        });


        binding.clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound();
                binding.clear.setImageResource(R.drawable.acp);
                binding.textView.setText("");

                //resetting other images
                binding.two.setImageResource(R.drawable.two);
                binding.three.setImageResource(R.drawable.three);
                binding.four.setImageResource(R.drawable.four);
                binding.five.setImageResource(R.drawable.five);
                binding.six.setImageResource(R.drawable.six);
                binding.seven.setImageResource(R.drawable.seven);
                binding.eight.setImageResource(R.drawable.eight);
                binding.nine.setImageResource(R.drawable.nine);
                binding.zero.setImageResource(R.drawable.zero);
                binding.plus.setImageResource(R.drawable.plus);
                binding.minus.setImageResource(R.drawable.minus);
                binding.multiply.setImageResource(R.drawable.multiply);
                binding.divide.setImageResource(R.drawable.divide);
                binding.one.setImageResource(R.drawable.one);
                binding.equals.setImageResource(R.drawable.equals);
            }
        });


        binding.divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound();
                binding.divide.setImageResource(R.drawable.dividep);
                mValueOne = Float.parseFloat(binding.textView.getText() + "");
                divide = true;
                binding.textView.setText(null);

                //resetting other images
                binding.two.setImageResource(R.drawable.two);
                binding.three.setImageResource(R.drawable.three);
                binding.four.setImageResource(R.drawable.four);
                binding.five.setImageResource(R.drawable.five);
                binding.six.setImageResource(R.drawable.six);
                binding.seven.setImageResource(R.drawable.seven);
                binding.eight.setImageResource(R.drawable.eight);
                binding.nine.setImageResource(R.drawable.nine);
                binding.zero.setImageResource(R.drawable.zero);
                binding.plus.setImageResource(R.drawable.plus);
                binding.minus.setImageResource(R.drawable.minus);
                binding.multiply.setImageResource(R.drawable.multiply);
                binding.one.setImageResource(R.drawable.one);
                binding.clear.setImageResource(R.drawable.ac);
                binding.equals.setImageResource(R.drawable.equals);
            }
        });


        binding.multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound();
                binding.multiply.setImageResource(R.drawable.multiplyp);
                mValueOne = Float.parseFloat(binding.textView.getText() + "");
                multiply = true;
                binding.textView.setText(null);

                //resetting other images
                binding.two.setImageResource(R.drawable.two);
                binding.three.setImageResource(R.drawable.three);
                binding.four.setImageResource(R.drawable.four);
                binding.five.setImageResource(R.drawable.five);
                binding.six.setImageResource(R.drawable.six);
                binding.seven.setImageResource(R.drawable.seven);
                binding.eight.setImageResource(R.drawable.eight);
                binding.nine.setImageResource(R.drawable.nine);
                binding.zero.setImageResource(R.drawable.zero);
                binding.plus.setImageResource(R.drawable.plus);
                binding.minus.setImageResource(R.drawable.minus);
                binding.one.setImageResource(R.drawable.one);
                binding.divide.setImageResource(R.drawable.divide);
                binding.clear.setImageResource(R.drawable.ac);
                binding.equals.setImageResource(R.drawable.equals);
            }
        });


        binding.minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound();
                binding.minus.setImageResource(R.drawable.minup);
                mValueOne = Float.parseFloat(binding.textView.getText() + "");
                subtract = true;
                binding.textView.setText(null);

                //resetting other images
                binding.two.setImageResource(R.drawable.two);
                binding.three.setImageResource(R.drawable.three);
                binding.four.setImageResource(R.drawable.four);
                binding.five.setImageResource(R.drawable.five);
                binding.six.setImageResource(R.drawable.six);
                binding.seven.setImageResource(R.drawable.seven);
                binding.eight.setImageResource(R.drawable.eight);
                binding.nine.setImageResource(R.drawable.nine);
                binding.zero.setImageResource(R.drawable.zero);
                binding.plus.setImageResource(R.drawable.plus);
                binding.one.setImageResource(R.drawable.one);
                binding.multiply.setImageResource(R.drawable.multiply);
                binding.divide.setImageResource(R.drawable.divide);
                binding.clear.setImageResource(R.drawable.ac);
                binding.equals.setImageResource(R.drawable.equals);
            }
        });


        binding.plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound();
                binding.plus.setImageResource(R.drawable.plusp);
                //resetting other images
                binding.two.setImageResource(R.drawable.two);
                binding.three.setImageResource(R.drawable.three);
                binding.four.setImageResource(R.drawable.four);
                binding.five.setImageResource(R.drawable.five);
                binding.six.setImageResource(R.drawable.six);
                binding.seven.setImageResource(R.drawable.seven);
                binding.eight.setImageResource(R.drawable.eight);
                binding.nine.setImageResource(R.drawable.nine);
                binding.zero.setImageResource(R.drawable.zero);
                binding.one.setImageResource(R.drawable.one);
                binding.minus.setImageResource(R.drawable.minus);
                binding.multiply.setImageResource(R.drawable.multiply);
                binding.divide.setImageResource(R.drawable.divide);
                binding.clear.setImageResource(R.drawable.ac);
                binding.equals.setImageResource(R.drawable.equals);


                if(binding.textView.getText() == null) {
                    binding.textView.setText("");
                } else {
                    mValueOne = Float.parseFloat(binding.textView.getText() + "");
                    add = true;
                    binding.textView.setText(null);
                }
            }
        });

    }





    public void playSound() {
        vibrator.vibrate(30);
        mp.start();
    }
}