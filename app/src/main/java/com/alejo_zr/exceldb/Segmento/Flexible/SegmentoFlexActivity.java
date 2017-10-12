package com.alejo_zr.exceldb.Segmento.Flexible;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.alejo_zr.exceldb.MainActivity;
import com.alejo_zr.exceldb.Patologia.Flexible.ConsultaPatologiaFlexActivity;
import com.alejo_zr.exceldb.Patologia.Flexible.RegistroPatologiaFlexActivity;
import com.alejo_zr.exceldb.R;
import com.alejo_zr.exceldb.entidades.SegmentoFlex;

public class SegmentoFlexActivity extends AppCompatActivity {

   private TextView tv_nombre_carretera_segmento,tv_id_segmento,tvPav, tvnCalzadas, tvnCarriles, tvanchoCarril, tvanchoBerma, tvPRI, tvPRF, tvComentarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segmento_flex);

        tv_nombre_carretera_segmento = (TextView) findViewById(R.id.tv_nombre_carretera_segmento_flex);
        tv_id_segmento = (TextView) findViewById(R.id.tv_id_segmentoFlex);
        tvnCalzadas = (TextView) findViewById(R.id.tvnCalzadasFlex);
        tvnCarriles= (TextView) findViewById(R.id.tvnCarrilesFlex);
        tvanchoCarril= (TextView) findViewById(R.id.tvanchoCarril);
        tvanchoBerma= (TextView) findViewById(R.id.tvanchoBermaFlex);
        tvPRI= (TextView) findViewById(R.id.tvPRIFlex);
        tvPRF= (TextView) findViewById(R.id.tvPRFFlex);
        tvComentarios= (TextView) findViewById(R.id.tvComentariosFlex);


        Bundle segmentoEnviado=getIntent().getExtras();
        SegmentoFlex segmento=null;


        if(segmentoEnviado!=null){
            segmento = (SegmentoFlex) segmentoEnviado.getSerializable("segmento");
            tv_id_segmento.setText(segmento.getId_segmento().toString());
            tv_nombre_carretera_segmento.setText(segmento.getNombre_carretera().toString());
            tvnCalzadas.setText(segmento.getnCalzadas().toString());
            tvnCarriles.setText(segmento.getnCarriles().toString());
            tvanchoCarril.setText(segmento.getAnchoCarril().toString());
            tvanchoBerma.setText(segmento.getAnchoBerma().toString());
            tvPRI.setText(segmento.getPri().toString());
            tvPRF.setText(segmento.getPrf().toString());
            tvComentarios.setText(segmento.getComentarios().toString());
        }


    }

    public void onClick(View view) {

        Intent intent = null;
        switch (view.getId()) {



            case R.id.btnRegistrarPatologia:
                intent = new Intent(SegmentoFlexActivity.this, RegistroPatologiaFlexActivity.class);
                intent.putExtra("id_segmento",tv_id_segmento.getText().toString());
                intent.putExtra("nom_carretera_segmento",tv_nombre_carretera_segmento.getText().toString());
                startActivity(intent);
                break;
            case R.id.btnConsultarPatologia:
                intent = new Intent(SegmentoFlexActivity.this,ConsultaPatologiaFlexActivity.class);
                intent.putExtra("tv_id_segmento",tv_id_segmento.getText().toString());
                intent.putExtra("tv_nombre_carretera_segmento",tv_nombre_carretera_segmento.getText().toString());
                startActivity(intent);
                break;

            case R.id.btnEditarSegmentoFlex:

                intent = new Intent (SegmentoFlexActivity.this, EditarSegmentoFlexActivity.class);
                intent.putExtra("tv_id_segmento",tv_id_segmento.getText().toString());
                intent.putExtra("tv_nombre_carretera_segmento",tv_nombre_carretera_segmento.getText().toString());
                intent.putExtra("tvnCalzadas" , tvnCalzadas.getText().toString());
                intent.putExtra("tvnCarriles" , tvnCarriles.getText().toString());
                intent.putExtra("tvanchoCarril", tvanchoCarril.getText().toString());
                intent.putExtra("tvanchoBerma", tvanchoBerma.getText().toString());
                intent.putExtra("tvPRI" , tvPRI.getText().toString());
                intent.putExtra("tvPRF" , tvPRF.getText().toString());
                intent.putExtra("tvComentarios" , tvComentarios.getText().toString());

                startActivity(intent);
                break;

        }
    }
}
