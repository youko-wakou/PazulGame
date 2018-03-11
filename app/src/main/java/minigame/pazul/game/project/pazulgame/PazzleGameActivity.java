package minigame.pazul.game.project.pazulgame;

import android.app.ActionBar;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.view.ViewGroup.LayoutParams;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by appu2 on 2018/03/01.
 */

public class PazzleGameActivity extends AppCompatActivity {
    private TableLayout tablelayout;
//    配列

    private Button[] imageID;
    private List<Button> imageIDhairetu;
    private List<Integer> hairetuGazou;
    private int[] haikeiList;
    private Button[][] buttonPazzle;
    private List<Integer> IDlist;
    private List<Button> IDButtonlist;
    Button imagebutton;
    Button imagebutton1;
    Button imagebutton2;
    Button imagebutton3;
    Button imagebutton4;
    Button imagebutton5;
    Button imagebutton6;
    Button imagebutton7;
    Button imagebutton8;
    Button imagebutton9;
    Button imagebutton10;
    Button imagebutton11;
    Button imagebutton12;
    Button imagebutton13;
    Button imagebutton14;
    Button imagebutton15;
    Button imagebutton16;
    Button StartButton;
    Button randomIDButton;
    boolean isTouch;
    private RelativeLayout mainLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pazzle_game_activity);
        IDButtonlist = new ArrayList<>();
//        こ子で最初に表示する画像を表示する
//        nizigenhairetu();
//        ここでランダムに混ぜる
        StartButton = findViewById(R.id.start_button);
        StartButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                create_table();
                StartButton.setVisibility(View.INVISIBLE);
            }
        });
        //デフォルトではfalseに指定しておく
        isTouch = false;

    }
    //ゲーム開始にデフォルトはシャッフルしていない完成状態のパズルを表示

    //シャッフルしている状態のパズルを表示する
    private void create_table() {

//        hairetuGazou = Arrays.asList(
//                R.drawable.pazul1, R.drawable.pazul2, R.drawable.pazul3, R.drawable.nothing, R.drawable.pazul4, R.drawable.pazul5, R.drawable.pazul6, R.drawable.pazul7, R.drawable.pazul8, R.drawable.pazul9, R.drawable.pazul10, R.drawable.pazul11, R.drawable.pazul12, R.drawable.pazul13, R.drawable.pazul14, R.drawable.pazul15
//        );
        IDlist = Arrays.asList(
                R.id.image1, R.id.image2, R.id.image3, R.id.image4, R.id.image5, R.id.image6, R.id.image7, R.id.image8, R.id.image9, R.id.image10, R.id.image11, R.id.image12, R.id.image13, R.id.image14, R.id.image15, R.id.image16
        );
        Collections.shuffle(IDlist);

        imageIDhairetu = Arrays.asList(
                imagebutton1, imagebutton2, imagebutton3, imagebutton4, imagebutton5, imagebutton6, imagebutton7, imagebutton8, imagebutton9, imagebutton10, imagebutton11, imagebutton12, imagebutton13, imagebutton14, imagebutton15, imagebutton16
        );
//        ここでボタンにランダムなIDをあてはめなおす
        int count = -1;
        for (int id: IDlist) {
            count += 1;
            imagebutton = findViewById(id);
            IdButtonSet(imagebutton);
        }
//       ここで背景をセットする
        haikeiList = new int[]{
            R.drawable.pazul1, R.drawable.pazul2, R.drawable.pazul3, R.drawable.nothing, R.drawable.pazul4, R.drawable.pazul5, R.drawable.pazul6, R.drawable.pazul7, R.drawable.pazul8, R.drawable.pazul9, R.drawable.pazul10, R.drawable.pazul11, R.drawable.pazul12, R.drawable.pazul13, R.drawable.pazul14, R.drawable.pazul15
        };
        int plus = -1;
        for(int haikei :haikeiList){
            plus += 1;
            buttonIDReturn().get(plus).setBackgroundResource(haikei);
        }


//        buttonPazzle = new Button[4][4];
//        int counter = -1;
//        for (int i = 0; i < 4; i++) {
//            for(int z = 0; z< 4; z++) {
//                counter += 1;
//                buttonPazzle[i][z] = imageIDhairetu.get(counter);
//            }
//        }
//        タッチイベントで座標の位置を取得する
//        touchZahyou();
    }
//    ボタンにIDを入れたものをとってきている
    private void IdButtonSet(Button id){
        IDButtonlist.add(id);
    }
//
    private List<Button> buttonIDReturn(){
        return IDButtonlist;
    }
    //もしパズルをタッチしたら
    public void ifPazzleTouch(){
        imageID = new Button[]{
                imagebutton1,imagebutton2,imagebutton3,imagebutton4,imagebutton5,imagebutton6,imagebutton7,imagebutton8,imagebutton9,imagebutton10,imagebutton11,imagebutton12,imagebutton13,imagebutton14,imagebutton15,imagebutton16
        };
        for(Button button: imageID){
            button.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    isTouch = true;
                }
            });
        }
    }
    //2次元配列に入れる
    private void nizigenhairetu(){
        imagebutton1 = findViewById(R.id.image1);
        imagebutton2 = findViewById(R.id.image2);
        imagebutton3 = findViewById(R.id.image3);
        imagebutton4 = findViewById(R.id.image4);
        imagebutton5 = findViewById(R.id.image5);
        imagebutton6 = findViewById(R.id.image6);
        imagebutton7 = findViewById(R.id.image7);
        imagebutton8 = findViewById(R.id.image8);
        imagebutton9 = findViewById(R.id.image9);
        imagebutton10 = findViewById(R.id.image10);
        imagebutton11 = findViewById(R.id.image11);
        imagebutton12 = findViewById(R.id.image12);
        imagebutton13 = findViewById(R.id.image13);
        imagebutton14 = findViewById(R.id.image14);
        imagebutton15 = findViewById(R.id.image15);
        imagebutton16 = findViewById(R.id.image16);
        buttonPazzle = new Button[4][4];
        buttonPazzle[0][0] = imagebutton1;
        buttonPazzle[0][1] = imagebutton2;
        buttonPazzle[0][2] = imagebutton3;
        buttonPazzle[0][3] = imagebutton4;
        buttonPazzle[1][0] = imagebutton5;
        buttonPazzle[1][1] = imagebutton6;
        buttonPazzle[1][2] = imagebutton7;
        buttonPazzle[1][3] = imagebutton8;
        buttonPazzle[2][0] = imagebutton9;
        buttonPazzle[2][1] = imagebutton10;
        buttonPazzle[2][2] = imagebutton11;
        buttonPazzle[2][3] = imagebutton12;
        buttonPazzle[3][0] = imagebutton13;
        buttonPazzle[3][1] = imagebutton14;
        buttonPazzle[3][2] = imagebutton15;
        buttonPazzle[3][3] = imagebutton16;
    }
//    private void touchZahyou(){
//        imageID = new Button[]{
//                imagebutton1,imagebutton2,imagebutton3,imagebutton4,imagebutton5,imagebutton6,imagebutton7,imagebutton8,imagebutton9,imagebutton10,imagebutton11,imagebutton12,imagebutton13,imagebutton14,imagebutton15,imagebutton16
//        };
//        for(Button button: imageID) {
//            button.setOnTouchListener(new View.OnTouchListener() {
//                @Override
//                public boolean onTouch(View v, MotionEvent event) {
//                    float touchY = event.getRawX();
//                    float touchX = event.getRawY();
//                    int touchy = (int) touchY / imagebutton1.getHeight();
//                    int touchx = (int) touchX / imagebutton2.getWidth();
//                    System.out.println(touchy);
//                    System.out.println(touchx);
//                    if(touchy ==0 && touchx ==1){
//                        System.out.println(buttonPazzle[0][0]);
//                        if(buttonPazzle[0][1] == imagebutton4) {
//                            Button valuebutton0 = buttonPazzle[0][0];
//                            Button valuebutton1 = buttonPazzle[0][1];
//                            buttonPazzle[0][0] = valuebutton0;
//                            buttonPazzle[0][1] = valuebutton1;
//                        }else if(buttonPazzle[1][0] == imagebutton4){
//                            Button valuebutton0 = buttonPazzle[1][0];
//                            Button valuebutton1 = buttonPazzle[0][0];
//                            buttonPazzle[0][0] = valuebutton0;
//                            buttonPazzle[1][0] = valuebutton1;
//                        }
//                    }else if(touchy ==1 && touchx ==1){
//                        if(buttonPazzle[0][2] == imagebutton4) {
//                            Button valuebutton0 = buttonPazzle[0][1];
//                            Button valuebutton1 = buttonPazzle[0][2];
//                            buttonPazzle[0][1] = valuebutton0;
//                            buttonPazzle[0][2] = valuebutton1;
//                        }else if(buttonPazzle[1][1] == imagebutton4){
//                            Button valuebutton0 = buttonPazzle[0][1];
//                            Button valuebutton1 = buttonPazzle[1][1];
//                            buttonPazzle[1][1] = valuebutton0;
//                            buttonPazzle[0][1] = valuebutton1;
//                        }else if(buttonPazzle[0][0] == imagebutton4){
//                            Button valuebutton0 = buttonPazzle[0][1];
//                            Button valuebutton1 = buttonPazzle[0][0];
//                            buttonPazzle[0][0] = valuebutton0;
//                            buttonPazzle[0][1] = valuebutton1;
//                        }
//                    }else if(touchy ==2 && touchx ==1){
//                        if(buttonPazzle[0][3] == imagebutton4) {
//                            Button valuebutton0 = buttonPazzle[0][1];
//                            Button valuebutton1 = buttonPazzle[0][2];
//                            buttonPazzle[0][2] = valuebutton0;
//                            buttonPazzle[0][3] = valuebutton1;
//                        }else if(buttonPazzle[1][3] == imagebutton4){
//                            Button valuebutton0 = buttonPazzle[0][3];
//                            Button valuebutton1 = buttonPazzle[1][3];
//                            buttonPazzle[1][3] = valuebutton0;
//                            buttonPazzle[0][3] = valuebutton1;
//                        }else if(buttonPazzle[0][1] == imagebutton4){
//                            Button valuebutton0 = buttonPazzle[0][2];
//                            Button valuebutton1 = buttonPazzle[0][1];
//                            buttonPazzle[0][1] = valuebutton0;
//                            buttonPazzle[0][2] = valuebutton1;
//                        }
//                    }else if(touchy ==3 && touchx ==1){
//                        if(buttonPazzle[0][2] == imagebutton4) {
//                            Button valuebutton0 = buttonPazzle[0][3];
//                            Button valuebutton1 = buttonPazzle[0][2];
//                            buttonPazzle[0][2] = valuebutton0;
//                            buttonPazzle[0][3] = valuebutton1;
//                        }else if(buttonPazzle[1][3] == imagebutton4){
//                            Button valuebutton0 = buttonPazzle[0][3];
//                            Button valuebutton1 = buttonPazzle[1][3];
//                            buttonPazzle[1][3] = valuebutton0;
//                            buttonPazzle[0][3] = valuebutton1;
//                        }
//                    }
//                    return false;
//                }
//            });
//        }
//    }


}
