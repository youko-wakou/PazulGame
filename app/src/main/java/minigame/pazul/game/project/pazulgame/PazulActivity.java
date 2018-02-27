package minigame.pazul.game.project.pazulgame;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by appu2 on 2018/02/27.
 */

public class PazulActivity extends AppCompatActivity {
//    最初の画像
    private ImageView imageStartPazulView;
//    最初のボタン
    private Button StartButton;
//    はじめる効果音
    private MediaPlayer startPlayer;

//    onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pazul_activity);
//        ゲームスタート
        start_button_clean_first();
    }
//    音楽
//    スタートミュージック
    private void startMusic(){
        startPlayer = MediaPlayer.create(this,R.raw.start);
        startPlayer.start();
    }
//    ボタンんと画像を消してゲームをスタートさせる
    private void start_button_clean_first(){
        StartButton = findViewById(R.id.pazul_start_button);
        imageStartPazulView = findViewById(R.id.start_pazul);
        StartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StartButton.setVisibility(View.INVISIBLE);
                imageStartPazulView.setVisibility(View.INVISIBLE);
                startMusic();
            }
        });
    }
}
