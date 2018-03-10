package minigame.pazul.game.project.pazulgame;

import android.app.ActionBar;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.view.ViewGroup.LayoutParams;
import android.widget.TableRow;
import android.widget.TextView;

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
    private List<Integer> hairetuGazou;
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

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pazzle_game_activity);
//        こ子で最初に表示する画像を表示する
        first_create_table();
//        ここでランダムに混ぜる
        StartButton = findViewById(R.id.start_button);
        StartButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                create_table();
            }
        });
    }
    private void first_create_table(){

        hairetuGazou = Arrays.asList(
                R.drawable.pazul1,R.drawable.pazul2,R.drawable.pazul3,R.drawable.nothing,R.drawable.pazul4,R.drawable.pazul5,R.drawable.pazul6,R.drawable.pazul7,R.drawable.pazul8,R.drawable.pazul9,R.drawable.pazul10,R.drawable.pazul11,R.drawable.pazul12,R.drawable.pazul13,R.drawable.pazul14,R.drawable.pazul15
        );
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
        imageID = new Button[]{
               imagebutton1,imagebutton2,imagebutton3,imagebutton4,imagebutton5,imagebutton6,imagebutton7,imagebutton8,imagebutton9,imagebutton10,imagebutton11,imagebutton12,imagebutton13,imagebutton14,imagebutton15,imagebutton16
        };
        int count = -1;
        for(Button Image: imageID) {
            count += 1;
            Image.setBackgroundResource(hairetuGazou.get(count));

        }

    }
    private void create_table(){

        hairetuGazou = Arrays.asList(
                R.drawable.pazul1,R.drawable.pazul2,R.drawable.pazul3,R.drawable.nothing,R.drawable.pazul4,R.drawable.pazul5,R.drawable.pazul6,R.drawable.pazul7,R.drawable.pazul8,R.drawable.pazul9,R.drawable.pazul10,R.drawable.pazul11,R.drawable.pazul12,R.drawable.pazul13,R.drawable.pazul14,R.drawable.pazul15
        );
        Collections.shuffle(hairetuGazou);
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
        imageID = new Button[]{
                imagebutton1,imagebutton2,imagebutton3,imagebutton4,imagebutton5,imagebutton6,imagebutton7,imagebutton8,imagebutton9,imagebutton10,imagebutton11,imagebutton12,imagebutton13,imagebutton14,imagebutton15,imagebutton16
        };
        int count = -1;
        for(Button Image: imageID){
            count += 1;
            Image.setBackgroundResource(hairetuGazou.get(count));
        }


    }

}
