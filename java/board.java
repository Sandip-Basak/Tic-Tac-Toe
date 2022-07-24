package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class board extends AppCompatActivity {
    ImageView aa,ab,ac,ba,bb,bc,ca,cb,cc,replay,cross, circle;
    boolean a1=true,a2=true,a3=true,b1=true,b2=true,b3=true,c1=true,c2=true,c3=true;
    TextView p1,p2;
    int n=1;
    int player1=0, player2=0;
    int[][] arr = new int[3][3];
    int turn=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);
        aa = findViewById(R.id.aa);
        ab = findViewById(R.id.ab);
        ac = findViewById(R.id.ac);
        ba = findViewById(R.id.ba);
        bb = findViewById(R.id.bb);
        bc = findViewById(R.id.bc);
        ca = findViewById(R.id.ca);
        cb = findViewById(R.id.cb);
        cc = findViewById(R.id.cc);
        replay = findViewById(R.id.replay);
        p1 = findViewById(R.id.pp1);
        p2 = findViewById(R.id.pp2);
        cross = findViewById(R.id.cross);
        circle = findViewById(R.id.circle);
        cross.setImageResource(R.drawable.cross);
        circle.setImageResource(R.drawable.circle);
        p1.setText("Player : 0");
        Toast.makeText(this, "Player 1's Turn", Toast.LENGTH_SHORT).show();
        for(int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                arr[x][y] = 5;
            }
        }

        aa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(n<=9 && a1) {
                    if (n % 2 == 0) {
                        aa.setImageResource(R.drawable.circle);
                        arr[0][0]=0;
                    } else {
                        aa.setImageResource(R.drawable.cross);
                        arr[0][0]=1;
                    }
                    n++;
                    a1=false;
                    check();
                }
            }
        });
        ab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(n<=9 && a2) {
                    if (n % 2 == 0) {
                        ab.setImageResource(R.drawable.circle);
                        arr[0][1]=0;
                    } else {
                        ab.setImageResource(R.drawable.cross);
                        arr[0][1]=1;
                    }
                    n++;
                    a2=false;
                    check();
                }
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(n<=9 && a3) {
                    if (n % 2 == 0) {
                        ac.setImageResource(R.drawable.circle);
                        arr[0][2]=0;
                    } else {
                        ac.setImageResource(R.drawable.cross);
                        arr[0][2]=1;
                    }
                    n++;
                    a3=false;
                    check();
                }
            }
        });
        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(n<=9 && b1) {
                    if (n % 2 == 0) {
                        ba.setImageResource(R.drawable.circle);
                        arr[1][0]=0;
                    } else {
                        ba.setImageResource(R.drawable.cross);
                        arr[1][0]=1;
                    }
                    n++;
                    b1=false;
                    check();
                }
            }
        });
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(n<=9 && b2) {
                    if (n % 2 == 0) {
                        bb.setImageResource(R.drawable.circle);
                        arr[1][1]=0;
                    } else {
                        bb.setImageResource(R.drawable.cross);
                        arr[1][1]=1;
                    }
                    n++;
                    b2=false;
                    check();
                }
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(n<=9 && b3) {
                    if (n % 2 == 0) {
                        bc.setImageResource(R.drawable.circle);
                        arr[1][2]=0;
                    } else {
                        bc.setImageResource(R.drawable.cross);
                        arr[1][2]=1;
                    }
                    n++;
                    b3=false;
                    check();
                }
            }
        });
        ca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(n<=9 && c1) {
                    if (n % 2 == 0) {
                        ca.setImageResource(R.drawable.circle);
                        arr[2][0]=0;
                    } else {
                        ca.setImageResource(R.drawable.cross);
                        arr[2][0]=1;
                    }
                    n++;
                    c1=false;
                    check();
                }
            }
        });
        cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(n<=9 && c2) {
                    if (n % 2 == 0) {
                        cb.setImageResource(R.drawable.circle);
                        arr[2][1]=0;
                    } else {
                        cb.setImageResource(R.drawable.cross);
                        arr[2][1]=1;
                    }
                    n++;
                    c2=false;
                    check();
                }
            }
        });
        cc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(n<=9 && c3) {
                    if (n % 2 == 0) {
                        cc.setImageResource(R.drawable.circle);
                        arr[2][2]=0;
                    } else {
                        cc.setImageResource(R.drawable.cross);
                        arr[2][2]=1;
                    }
                    n++;
                    c3=false;
                    check();
                }
            }
        });
        replay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                turn++;
                if(turn%2==0){
                    cross.setImageResource(R.drawable.circle);
                    circle.setImageResource(R.drawable.cross);
                    Toast.makeText(board.this, "Player 2's Turn", Toast.LENGTH_SHORT).show();
                }
                else {
                    cross.setImageResource(R.drawable.cross);
                    circle.setImageResource(R.drawable.circle);
                    Toast.makeText(board.this, "Player 1's Turn", Toast.LENGTH_SHORT).show();
                }
                n=1;
                aa.setImageResource(R.drawable.white);
                ab.setImageResource(R.drawable.white);
                ac.setImageResource(R.drawable.white);
                ba.setImageResource(R.drawable.white);
                bb.setImageResource(R.drawable.white);
                bc.setImageResource(R.drawable.white);
                ca.setImageResource(R.drawable.white);
                cb.setImageResource(R.drawable.white);
                cc.setImageResource(R.drawable.white);
                a1=true;a2=true;a3=true;b1=true;b2=true;b3=true;c1=true;c2=true;c3=true;
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        arr[i][j] = 5;
                    }
                }
            }
        });
    }
    public void check(){
        if((arr[0][0]==0 && arr[0][1]==0 && arr[0][2]==0) || (arr[1][0]==0 && arr[1][1]==0 && arr[1][2]==0) || (arr[2][0]==0 && arr[2][1]==0 && arr[2][2]==0)){
            n=10;
            if(turn%2==0){
                player1++;
                Toast.makeText(this, "Player 1 won", Toast.LENGTH_SHORT).show();
            }
            else {
                player2++;
                Toast.makeText(this, "Player 2 won", Toast.LENGTH_SHORT).show();
            }
        }
        else if((arr[0][0]==0 && arr[1][0]==0 && arr[2][0]==0) || (arr[0][1]==0 && arr[1][1]==0 && arr[2][1]==0) || (arr[0][2]==0 && arr[1][2]==0 && arr[2][2]==0)){
            n=10;
            if(turn%2==0){
                player1++;
                Toast.makeText(this, "Player 1 won", Toast.LENGTH_SHORT).show();
            }
            else {
                player2++;
                Toast.makeText(this, "Player 2 won", Toast.LENGTH_SHORT).show();
            }
        }
        else if((arr[0][0]==0 && arr[1][1]==0 && arr[2][2]==0) || (arr[0][2]==0 && arr[1][1]==0 && arr[2][0]==0)){
            n=10;
            if(turn%2==0){
                player1++;
                Toast.makeText(this, "Player 1 won", Toast.LENGTH_SHORT).show();
            }
            else {
                player2++;
                Toast.makeText(this, "Player 2 won", Toast.LENGTH_SHORT).show();
            }
        }
        else if((arr[0][0]==1 && arr[0][1]==1 && arr[0][2]==1) || (arr[1][0]==1 && arr[1][1]==1 && arr[1][2]==1) || (arr[2][0]==1 && arr[2][1]==1 && arr[2][2]==1)){
            n=10;
            if(turn%2==0){
                player2++;
                Toast.makeText(this, "Player 2 won", Toast.LENGTH_SHORT).show();
            }
            else {
                player1++;
                Toast.makeText(this, "Player 1 won", Toast.LENGTH_SHORT).show();
            }
        }
        else if((arr[0][0]==1 && arr[1][0]==1 && arr[2][0]==1) || (arr[0][1]==1 && arr[1][1]==1 && arr[2][1]==1) || (arr[0][2]==1 && arr[1][2]==1 && arr[2][2]==1)){
            n=10;
            if(turn%2==0){
                player2++;
                Toast.makeText(this, "Player 2 won", Toast.LENGTH_SHORT).show();
            }
            else {
                player1++;
                Toast.makeText(this, "Player 1 won", Toast.LENGTH_SHORT).show();
            }
        }
        else if((arr[0][0]==1 && arr[1][1]==1 && arr[2][2]==1) || (arr[0][2]==1 && arr[1][1]==1 && arr[2][0]==1)){
            n=10;
            if(turn%2==0){
                player2++;
                Toast.makeText(this, "Player 2 won", Toast.LENGTH_SHORT).show();
            }
            else {
                player1++;
                Toast.makeText(this, "Player 1 won", Toast.LENGTH_SHORT).show();
            }
        }
        p1.setText("Player 1 : "+player1);
        p2.setText("Player 2 : "+player2);
    }
}