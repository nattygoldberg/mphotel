package com.example.natlia.mh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class PerfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        ImageView imghotel = (ImageView) findViewById(R.id.imageViewFotoHotel);
        TextView txtnomehotel = (TextView) findViewById(R.id.textViewNomeHotel);
        RatingBar avaliacao = (RatingBar) findViewById(R.id.ratingBar2);
        TextView descricao = (TextView) findViewById(R.id.textViewDescricaoHotel);
        TextView informacoes = (TextView) findViewById(R.id.textViewInfo);
        TextView contato = (TextView) findViewById(R.id.textViewContato);
        TextView infocontato = (TextView) findViewById(R.id.textViewInfoContato);
        ImageView imgmapa = (ImageView) findViewById(R.id.imageView3);
        Button btnrota = (Button) findViewById(R.id.buttonRota);
        Button btnligar = (Button) findViewById(R.id.btnLigar);
    }
}
