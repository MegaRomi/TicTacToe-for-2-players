package com.example.tictactoefor2players;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {
    private FBModule fbModule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        fbModule = new FBModule(this);


        setContentView(R.layout.activity_game);
        BoardGame boardGame = new BoardGame(this);
        setContentView(boardGame);
    }

    public void setPositionToFirebase(int line, int col) {
        fbModule.setPositionToFirebase(new Position(line,col));

    }

    public void setPositionFromFirebase() {
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }
}