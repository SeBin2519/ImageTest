package kr.hs.emirim.sebin2519.imagetest;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);// setContentView(new MyImage(getApplicationContext())); //this도 가능*/

        //super.onCreate(savedInstanceState);


    }

   /* //사용자 정의 View를 만듦 ==> 도화지
    class MyImage extends View {
        MyImage(Context context) { //생성자, view가 들어갈 문맥
            super(context); //view를 상속받음 => 부모의 객체가 생성될떄 defalt로 생성하지만 view는 없으므로 꼭 넣어줘야함
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);//그림 그리기 메서드

            Bitmap picture = BitmapFactory.decodeResource(getResources(),R.drawable.img1);//비트맵객체로 그리기
            float cx=getWidth()/2.0f; //점의 정중앙 좌표
            float cy=getWidth()/2.0f; //점의 정중앙 좌표
            float x = (getWidth() - picture.getWidth()) / 2.0f;
            float y = (getHeight() - picture.getHeight()) / 2.0f;
            //canvas.rotate(45,cx,cy);//캔버스 회전 (각도, 중심점)
            // canvas.translate(-150,200);//캔버스 이동 /px
            //canvas.scale(2,2,cx,cy);//캔버스 크기 /몇배로(너비,), 확대 기준
            canvas.skew(0.4f,0.4f);//캔버스 비틀기
            canvas.drawBitmap(picture, x, y, null);//뷰의 현재 넓이
        }
    }*/

}
