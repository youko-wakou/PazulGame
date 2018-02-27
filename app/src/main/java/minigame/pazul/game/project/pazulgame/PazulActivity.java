package minigame.pazul.game.project.pazulgame;

import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by appu2 on 2018/02/27.
 */

public class PazulActivity extends AppCompatActivity {
//    アクセス
//    最初の画像
    private ImageView imageStartPazulView;
//    最初のボタン
    private Button StartButton;
//    はじめる効果音
    private MediaPlayer startPlayer;
//    パズルのピース
    private ImageButton button_pazul1;
    private ImageButton button_pazul2;
    private ImageButton button_pazul3;
    private ImageButton button_pazul4;
    private ImageButton button_pazul5;
    private ImageButton button_pazul6;
    private ImageButton button_pazul7;
    private ImageButton button_pazul8;
    private ImageButton button_pazul9;
    private ImageButton button_pazul10;
    private ImageButton button_pazul11;
    private ImageButton button_pazul12;
    private ImageButton button_pazul13;
    private ImageButton button_pazul14;
    private ImageButton button_pazul15;
    private ImageButton button_pazul16;
//    配列
    private ImageButton[] imageButtonArray;
    private List<Integer> ImageButtonIDList;

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
                button_random_select();
            }
        });
    }

    private void button_random_select() {
//        RandomIDクラスを呼び出す
//        backgroudn用の画像を配列にsetする
        ImageButtonIDList = Arrays.asList(
                                R.drawable.pazul1,
                                R.drawable.pazul2,
                                R.drawable.pazul3,
                                R.drawable.nothing,
                                R.drawable.pazul5,
                                R.drawable.pazul7,
                                R.drawable.pazul8,
                                R.drawable.pazul9,
                                R.drawable.pazul10,
                                R.drawable.pazul11,
                                R.drawable.pazul12,
                                R.drawable.pazul13,
                                R.drawable.pazul15,
                                R.drawable.pazul16,
                                R.drawable.pazul17
        );
//        ここでButttonImageViewを取得する
        button_pazul1 = findViewById(R.id.pazul_1);
        button_pazul2 = findViewById(R.id.pazul_2);
        button_pazul3 = findViewById(R.id.pazul_3);
        button_pazul4 = findViewById(R.id.pazul_4);
        button_pazul5 = findViewById(R.id.pazul_5);
        button_pazul6 = findViewById(R.id.pazul_6);
        button_pazul7 = findViewById(R.id.pazul_7);
        button_pazul8 = findViewById(R.id.pazul_8);
        button_pazul9 = findViewById(R.id.pazul_9);
        button_pazul10 = findViewById(R.id.pazul_10);
        button_pazul11 = findViewById(R.id.pazul_11);
        button_pazul12 = findViewById(R.id.pazul_12);
        button_pazul13 = findViewById(R.id.pazul_13);
        button_pazul14 = findViewById(R.id.pazul_14);
        button_pazul15 = findViewById(R.id.pazul_15);
        button_pazul16 = findViewById(R.id.pazul_16);
//        配列
        imageButtonArray = new ImageButton[]{
                button_pazul1,
                button_pazul2,
                button_pazul3,
                button_pazul4,
                button_pazul5,
                button_pazul6,
                button_pazul7,
                button_pazul8,
                button_pazul9,
                button_pazul10,
                button_pazul11,
                button_pazul12,
                button_pazul13,
                button_pazul14,
                button_pazul15,
                button_pazul16
        };
        for(ImageButton pazul_type: imageButtonArray){
//            background画像の入ったIDリストをシャッフルする
            Collections.shuffle(ImageButtonIDList);
//            シャッフルしたリストの先頭を取り出す
            int ImageButtonBackId = ImageButtonIDList.get(0);
//            関数呼び出し。backgroundを入れたリストから削除する
            delete_Array_backgroundID(ImageButtonBackId);
//           backgroundを設定する、ランダムに取得した先頭を入れる
            pazul_type.setBackgroundResource(ImageButtonBackId);
        }
    }
//    ===========================================================================
//    配列からランダムに取り出し済みの値は削除する
    private void delete_Array_backgroundID(int ID){
        ImageButtonIDList.remove(ImageButtonIDList.indexOf(ID));
    }
}
