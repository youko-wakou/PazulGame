package minigame.pazul.game.project.pazulgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
//ボタン
    private Button pazuleGameButton;
//    インテント
    private Intent pazuleGameIntent;
//    ==============================================================

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        パズルゲームボタンをクリックしたときの様子
        gamePazulePageClick();
    }

//    ボタンイベント
//    パズルゲームページ移動
    private void gamePazuleIntentClick(){
        pazuleGameIntent = new Intent(this,PazulActivity.class);
        startActivity(pazuleGameIntent);
    }
    private void gamePazulePageClick(){
        pazuleGameButton = findViewById(R.id.pazulgame_button);
        pazuleGameButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                gamePazuleIntentClick();
            }
        });
    }
}
