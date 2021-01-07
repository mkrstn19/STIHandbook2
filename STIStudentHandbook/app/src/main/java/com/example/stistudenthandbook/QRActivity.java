package com.example.stistudenthandbook;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class QRActivity extends AppCompatActivity {

    EditText fullnameEditText;
    EditText addressEditText;
    EditText numberEditText;
    ImageView qrImageView;
    Button qrButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q_r);

        fullnameEditText= findViewById(R.id.fullnameEditText);
        addressEditText= findViewById(R.id.addressEditText);
        numberEditText= findViewById(R.id.numberEditText);
        qrImageView = findViewById(R.id.qrImageView);
        qrButton = findViewById(R.id.qrButton);

        qrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                QRCodeWriter qrCodeWriter = new QRCodeWriter();

                try {
                    BitMatrix bitMatrix = qrCodeWriter.encode(fullnameEditText.getText().toString()
                            + "\n" +addressEditText.getText().toString() + numberEditText.getText().toString(),
                    BarcodeFormat.QR_CODE, 200, 200);

                    Bitmap bitmap = Bitmap.createBitmap(200, 200, Bitmap.Config.RGB_565);

                    for (int x = 0; x < 200; x++){
                        for (int y=0; y <200; y++){
                            bitmap.setPixel(x,y,bitMatrix.get(x,y) ? Color.BLACK: Color.WHITE);
                        }
                    }

                    qrImageView.setImageBitmap(bitmap);
                } catch (WriterException e) {
                    e.printStackTrace();
                }


            }
        });
    }
}