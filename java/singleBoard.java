package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class singleBoard extends AppCompatActivity {
    ImageView[][] blocks = new ImageView[3][3];
    ImageView replay,cross, circle;
    TextView p1,p2;
    int player=1, computer=0;
    int pp=0,cp=0;
    int[][] arr = new int[3][3];
    int n=1;
    boolean won = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_board);
        blocks[0][0] = findViewById(R.id.aa);
        blocks[0][1] = findViewById(R.id.ab);
        blocks[0][2] = findViewById(R.id.ac);
        blocks[1][0] = findViewById(R.id.ba);
        blocks[1][1] = findViewById(R.id.bb);
        blocks[1][2] = findViewById(R.id.bc);
        blocks[2][0] = findViewById(R.id.ca);
        blocks[2][1] = findViewById(R.id.cb);
        blocks[2][2] = findViewById(R.id.cc);
        replay = findViewById(R.id.replay);
        p1 = findViewById(R.id.pp1);
        p2 = findViewById(R.id.pp2);
        cross = findViewById(R.id.cross);
        circle = findViewById(R.id.circle);
        Toast.makeText(this, "Your Turn", Toast.LENGTH_SHORT).show();
        for(int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                arr[x][y] = 5;
            }
        }
        blocks[0][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(arr[0][0]==5 && n<=9 && !won){
                    if(player == 1){
                        blocks[0][0].setImageResource(R.drawable.cross);
                        arr[0][0]=1;
                    }
                    else {
                        blocks[0][0].setImageResource(R.drawable.circle);
                        arr[0][0]=0;
                    }
                    n++;
                    check();
                    moveComputer();
                }
            }
        });
        blocks[0][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(arr[0][1]==5 && n<=9 && !won){
                    if(player == 1){
                        blocks[0][1].setImageResource(R.drawable.cross);
                        arr[0][1]=1;
                    }
                    else {
                        blocks[0][1].setImageResource(R.drawable.circle);
                        arr[0][1]=0;
                    }
                    n++;
                    check();
                    moveComputer();
                }
            }
        });
        blocks[0][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(arr[0][2]==5 && n<=9 && !won){
                    if(player == 1){
                        blocks[0][2].setImageResource(R.drawable.cross);
                        arr[0][2]=1;
                    }
                    else {
                        blocks[0][2].setImageResource(R.drawable.circle);
                        arr[0][2]=0;
                    }
                    n++;
                    check();
                    moveComputer();
                }
            }
        });
        blocks[1][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(arr[1][0]==5 && n<=9 && !won){
                    if(player == 1){
                        blocks[1][0].setImageResource(R.drawable.cross);
                        arr[1][0]=1;
                    }
                    else {
                        blocks[1][0].setImageResource(R.drawable.circle);
                        arr[1][0]=0;
                    }
                    n++;
                    check();
                    moveComputer();
                }
            }
        });
        blocks[1][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(arr[1][1]==5 && n<=9 && !won){
                    if(player == 1){
                        blocks[1][1].setImageResource(R.drawable.cross);
                        arr[1][1]=1;
                    }
                    else {
                        blocks[1][1].setImageResource(R.drawable.circle);
                        arr[1][1]=0;
                    }
                    n++;
                    check();
                    moveComputer();
                }
            }
        });
        blocks[1][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(arr[1][2]==5 && n<=9 && !won){
                    if(player == 1){
                        blocks[1][2].setImageResource(R.drawable.cross);
                        arr[1][2]=1;
                    }
                    else {
                        blocks[1][2].setImageResource(R.drawable.circle);
                        arr[1][2]=0;
                    }
                    n++;
                    check();
                    moveComputer();
                }
            }
        });
        blocks[2][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(arr[2][0]==5 && n<=9 && !won){
                    if(player == 1){
                        blocks[2][0].setImageResource(R.drawable.cross);
                        arr[2][0]=1;
                    }
                    else {
                        blocks[2][0].setImageResource(R.drawable.circle);
                        arr[2][0]=0;
                    }
                    n++;
                    check();
                    moveComputer();
                }
            }
        });
        blocks[2][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(arr[2][1]==5 && n<=9 && !won){
                    if(player == 1){
                        blocks[2][1].setImageResource(R.drawable.cross);
                        arr[2][1]=1;
                    }
                    else {
                        blocks[2][1].setImageResource(R.drawable.circle);
                        arr[2][1]=0;
                    }
                    n++;
                    check();
                    moveComputer();
                }
            }
        });
        blocks[2][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(arr[2][2]==5 && n<=9 && !won){
                    if(player == 1){
                        blocks[2][2].setImageResource(R.drawable.cross);
                        arr[2][2]=1;
                    }
                    else {
                        blocks[2][2].setImageResource(R.drawable.circle);
                        arr[2][2]=0;
                    }
                    n++;
                    check();
                    moveComputer();
                }
            }
        });
        replay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                won = false;
                n=1;
                if(player == 1 && computer == 0){
                    computer = 1;
                    player = 0;
                    cross.setImageResource(R.drawable.circle);
                    circle.setImageResource(R.drawable.cross);
                }
                else {
                    player = 1;
                    computer = 0;
                    cross.setImageResource(R.drawable.cross);
                    circle.setImageResource(R.drawable.circle);
                }
                blocks[0][0].setImageResource(R.drawable.white);
                blocks[0][1].setImageResource(R.drawable.white);
                blocks[0][2].setImageResource(R.drawable.white);
                blocks[1][0].setImageResource(R.drawable.white);
                blocks[1][1].setImageResource(R.drawable.white);
                blocks[1][2].setImageResource(R.drawable.white);
                blocks[2][0].setImageResource(R.drawable.white);
                blocks[2][1].setImageResource(R.drawable.white);
                blocks[2][2].setImageResource(R.drawable.white);
                for(int x=0;x<3;x++){
                    for(int y=0;y<3;y++){
                        arr[x][y] = 5;
                    }
                }
                if(computer == 1)
                    moveComputer();
                else
                    Toast.makeText(singleBoard.this, "Your Turn", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void moveComputer(){
        if(n<=9 && !won){
            /*Computer advantage*/
            for(int i=0;i<3;i++){
                if((arr[i][0]==computer && arr[i][1]==computer && arr[i][2]==5) || (arr[i][0]==computer && arr[i][1]==5 && arr[i][2]==computer) || (arr[i][0]==5 && arr[i][1]==computer && arr[i][2]==computer)){
                    if(arr[i][2]==5){
                        arr[i][2]=computer;
                        if(computer==1){
                            blocks[i][2].setImageResource(R.drawable.cross);
                        }
                        else {
                            blocks[i][2].setImageResource(R.drawable.circle);
                        }

                    }
                    else if(arr[i][1]==5){
                        arr[i][1]=computer;
                        if(computer==1){
                            blocks[i][1].setImageResource(R.drawable.cross);
                        }
                        else {
                            blocks[i][1].setImageResource(R.drawable.circle);
                        }
                    }
                    else if(arr[i][0]==5){
                        arr[i][0]=computer;
                        if(computer==1){
                            blocks[i][0].setImageResource(R.drawable.cross);
                        }
                        else {
                            blocks[i][0].setImageResource(R.drawable.circle);
                        }
                    }
                    n++;
                    check();
                    return;
                }
            }
            for(int i=0;i<3;i++) {
                if ((arr[0][i] == computer && arr[1][i] == computer && arr[2][i] == 5) || (arr[0][i] == computer && arr[1][i] == 5 && arr[2][i] == computer) || (arr[0][i] == 5 && arr[1][i] == computer && arr[2][i] == computer)) {
                    if (arr[2][i] == 5) {
                        arr[2][i] = computer;
                        if (computer == 1) {
                            blocks[2][i].setImageResource(R.drawable.cross);
                        } else {
                            blocks[2][i].setImageResource(R.drawable.circle);
                        }

                    } else if (arr[1][i] == 5) {
                        arr[1][i] = computer;
                        if (computer == 1) {
                            blocks[1][i].setImageResource(R.drawable.cross);
                        } else {
                            blocks[1][i].setImageResource(R.drawable.circle);
                        }
                    } else if (arr[0][i] == 5) {
                        arr[0][i] = computer;
                        if (computer == 1) {
                            blocks[0][i].setImageResource(R.drawable.cross);
                        } else {
                            blocks[0][i].setImageResource(R.drawable.circle);
                        }
                    }
                    n++;
                    check();
                    return;
                }
            }
                if(arr[0][0]==computer && arr[1][1]==computer && arr[2][2]==5){
                    arr[2][2]=computer;
                    if(computer==1){
                        blocks[2][2].setImageResource(R.drawable.cross);
                    }
                    else {
                        blocks[2][2].setImageResource(R.drawable.circle);
                    }
                    n++;
                    check();
                    return;
                }
                else if(arr[0][0]==computer && arr[1][1]==5 && arr[2][2]==computer){
                    arr[1][1]=computer;
                    if(computer==1){
                        blocks[1][1].setImageResource(R.drawable.cross);
                    }
                    else {
                        blocks[1][1].setImageResource(R.drawable.circle);
                    }
                    n++;
                    check();
                    return;
                }else if(arr[0][0]==5 && arr[1][1]==computer && arr[2][2]==computer){
                    arr[0][0]=computer;
                    if(computer==1){
                        blocks[0][0].setImageResource(R.drawable.cross);
                    }
                    else {
                        blocks[0][0].setImageResource(R.drawable.circle);
                    }
                    n++;
                    check();
                    return;
                }
                else if(arr[0][2]==computer && arr[1][1]==computer && arr[2][0]==5){
                    arr[2][0]=computer;
                    if(computer==1){
                        blocks[2][0].setImageResource(R.drawable.cross);
                    }
                    else {
                        blocks[2][0].setImageResource(R.drawable.circle);
                    }
                    n++;
                    check();
                    return;
                }
                else if(arr[0][2]==computer && arr[1][1]==5 && arr[2][0]==computer){
                    arr[1][1]=computer;
                    if(computer==1){
                        blocks[1][1].setImageResource(R.drawable.cross);
                    }
                    else {
                        blocks[1][1].setImageResource(R.drawable.circle);
                    }
                    n++;
                    check();
                    return;
                }else if(arr[0][2]==5 && arr[1][1]==computer && arr[2][0]==computer){
                    arr[0][2]=computer;
                    if(computer==1){
                        blocks[0][2].setImageResource(R.drawable.cross);
                    }
                    else {
                        blocks[0][2].setImageResource(R.drawable.circle);
                    }
                    n++;
                    check();
                    return;
                }
                /*Computer Advantage*/

            /*User Advantage*/
            for(int i=0;i<3;i++){
                if((arr[i][0]==player && arr[i][1]==player && arr[i][2]==5) || (arr[i][0]==player && arr[i][1]==5 && arr[i][2]==player) || (arr[i][0]==5 && arr[i][1]==player && arr[i][2]==player)){
                    if(arr[i][2]==5){
                        arr[i][2]=computer;
                        if(computer==1){
                            blocks[i][2].setImageResource(R.drawable.cross);
                        }
                        else {
                            blocks[i][2].setImageResource(R.drawable.circle);
                        }

                    }
                    else if(arr[i][1]==5){
                        arr[i][1]=computer;
                        if(computer==1){
                            blocks[i][1].setImageResource(R.drawable.cross);
                        }
                        else {
                            blocks[i][1].setImageResource(R.drawable.circle);
                        }
                    }
                    else if(arr[i][0]==5){
                        arr[i][0]=computer;
                        if(computer==1){
                            blocks[i][0].setImageResource(R.drawable.cross);
                        }
                        else {
                            blocks[i][0].setImageResource(R.drawable.circle);
                        }
                    }
                    n++;
                    check();
                    return;
                }
            }
            for(int i=0;i<3;i++) {
                if ((arr[0][i] == player && arr[1][i] == player && arr[2][i] == 5) || (arr[0][i] == player && arr[1][i] == 5 && arr[2][i] == player) || (arr[0][i] == 5 && arr[1][i] == player && arr[2][i] == player)) {
                    if (arr[2][i] == 5) {
                        arr[2][i] = computer;
                        if (computer == 1) {
                            blocks[2][i].setImageResource(R.drawable.cross);
                        } else {
                            blocks[2][i].setImageResource(R.drawable.circle);
                        }

                    } else if (arr[1][i] == 5) {
                        arr[1][i] = computer;
                        if (computer == 1) {
                            blocks[1][i].setImageResource(R.drawable.cross);
                        } else {
                            blocks[1][i].setImageResource(R.drawable.circle);
                        }
                    } else if (arr[0][i] == 5) {
                        arr[0][i] = computer;
                        if (computer == 1) {
                            blocks[0][i].setImageResource(R.drawable.cross);
                        } else {
                            blocks[0][i].setImageResource(R.drawable.circle);
                        }
                    }
                    n++;
                    check();
                    return;
                }
            }
            if(arr[0][0]==player && arr[1][1]==player && arr[2][2]==5){
                arr[2][2]=computer;
                if(computer==1){
                    blocks[2][2].setImageResource(R.drawable.cross);
                }
                else {
                    blocks[2][2].setImageResource(R.drawable.circle);
                }
                n++;
                check();
                return;
            }
            else if(arr[0][0]==player && arr[1][1]==5 && arr[2][2]==player){
                arr[1][1]=computer;
                if(computer==1){
                    blocks[1][1].setImageResource(R.drawable.cross);
                }
                else {
                    blocks[1][1].setImageResource(R.drawable.circle);
                }
                n++;
                check();
                return;
            }else if(arr[0][0]==5 && arr[1][1]==player && arr[2][2]==player){
                arr[0][0]=computer;
                if(computer==1){
                    blocks[0][0].setImageResource(R.drawable.cross);
                }
                else {
                    blocks[0][0].setImageResource(R.drawable.circle);
                }
                n++;
                check();
                return;
            }
            else if(arr[0][2]==player && arr[1][1]==player && arr[2][0]==5){
                arr[2][0]=computer;
                if(computer==1){
                    blocks[2][0].setImageResource(R.drawable.cross);
                }
                else {
                    blocks[2][0].setImageResource(R.drawable.circle);
                }
                n++;
                check();
                return;
            }
            else if(arr[0][2]==player && arr[1][1]==5 && arr[2][0]==player){
                arr[1][1]=computer;
                if(computer==1){
                    blocks[1][1].setImageResource(R.drawable.cross);
                }
                else {
                    blocks[1][1].setImageResource(R.drawable.circle);
                }
                n++;
                check();
                return;
            }else if(arr[0][2]==5 && arr[1][1]==player && arr[2][0]==player){
                arr[0][2]=computer;
                if(computer==1){
                    blocks[0][2].setImageResource(R.drawable.cross);
                }
                else {
                    blocks[0][2].setImageResource(R.drawable.circle);
                }
                n++;
                check();
                return;
            }
            /*User Advantage*/
            /*Random Move*/
            int ri = (int)(Math.random()*3);
            int rj = (int)(Math.random()*3);
            while (arr[ri][rj]!=5){
                ri = (int)(Math.random()*3);
                rj = (int)(Math.random()*3);
            }
            arr[ri][rj]=computer;
            if(computer==1){
                blocks[ri][rj].setImageResource(R.drawable.cross);
            }
            else {
                blocks[ri][rj].setImageResource(R.drawable.circle);
            }
            n++;
            check();
            /*Random Move*/
            }
        }

    public void check(){
        if(!won) {
            if ((arr[0][0] == 1 && arr[1][1] == 1 && arr[2][2] == 1) || (arr[0][2] == 1 && arr[1][1] == 1 && arr[2][0] == 1)) {
                if (player == 1) {
                    pp++;
                    Toast.makeText(this, "You Won", Toast.LENGTH_SHORT).show();
                } else if (computer == 1) {
                    cp++;
                    Toast.makeText(this, "Computer won", Toast.LENGTH_SHORT).show();
                }
                n = 10;
                won = true;
            } else if ((arr[0][0] == 0 && arr[1][1] == 0 && arr[2][2] == 0) || (arr[0][2] == 0 && arr[1][1] == 0 && arr[2][0] == 0)) {
                if (player == 0) {
                    pp++;
                    Toast.makeText(this, "You Won", Toast.LENGTH_SHORT).show();
                } else if (computer == 0) {
                    cp++;
                    Toast.makeText(this, "Computer Won", Toast.LENGTH_SHORT).show();
                }
                n = 10;
                won = true;
            } else {
                for (int i = 0; i < 3; i++) {
                    if ((arr[i][0] == 1 && arr[i][1] == 1 && arr[i][2] == 1) || (arr[0][i] == 1 && arr[1][i] == 1 && arr[2][i] == 1)) {
                        if (player == 1) {
                            pp++;
                            Toast.makeText(this, "You Won", Toast.LENGTH_SHORT).show();
                            n = 10;
                            won = true;
                            break;
                        } else if (computer == 1) {
                            cp++;
                            Toast.makeText(this, "Computer won", Toast.LENGTH_SHORT).show();
                            n = 10;
                            won = true;
                            break;
                        }
                    } else if ((arr[i][0] == 0 && arr[i][1] == 0 && arr[i][2] == 0) || (arr[0][i] == 0 && arr[1][i] == 0 && arr[2][i] == 0)) {
                        if (player == 0) {
                            pp++;
                            Toast.makeText(this, "You Won", Toast.LENGTH_SHORT).show();
                            n = 10;
                            won = true;
                            break;
                        } else if (computer == 0) {
                            cp++;
                            Toast.makeText(this, "Computer Won", Toast.LENGTH_SHORT).show();
                            n = 10;
                            won = true;
                            break;
                        }
                    }

                }
            }
        }
        p1.setText("Player : "+pp);
        p2.setText("Computer : "+cp);
    }
}