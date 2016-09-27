package kr.hs.emirim.sebin2519.imagetest;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by Mirim on 2016-09-26.
 */
public class MyImage extends View {
    int choose=MainActivity.ORIGINAL;
    Bitmap picture;

    MyImage(Context context) { //생성자, view가 들어갈 문맥
        super(context); //view를 상속받음 => 부모의 객체가 생성될떄 defalt로 생성하지만 view는 없으므로 꼭 넣어줘야함
        picture = BitmapFactory.decodeResource(getResources(),R.drawable.img1);//비트맵객체로 그리기
    }

    public void setChoose(int choose){
        this.choose=choose;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);//그림 그리기 메서드

        float cx=getWidth()/2.0f; //점의 정중앙 좌표
        float cy=getWidth()/2.0f; //점의 정중앙 좌표
        float x = (getWidth() - picture.getWidth()) / 2.0f;
        float y = (getHeight() - picture.getHeight()) / 2.0f;
        switch (choose){
            case MainActivity.ROTATE: canvas.rotate(45,cx,cy); break; //canvas.rotate(45,cx,cy);//캔버스 회전 (각도, 중심점)
            case MainActivity.TRANSELATE: canvas.translate(-150,200); break; // canvas.translate(-150,200);//캔버스 이동 /px
            case MainActivity.SCALE: canvas.scale(2,2,cx,cy); break; //canvas.scale(2,2,cx,cy);//캔버스 크기 /몇배로(너비,), 확대 기준
            case MainActivity.SKEW: canvas.skew(0.4f,0.4f); break; //canvas.skew(0.4f,0.4f);//캔버스 비틀기
        }
        canvas.drawBitmap(picture, x, y, null);//뷰의 현재 넓이
        //picture.recycle();
    }
}

