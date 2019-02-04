package mx.tec.lab_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.lang.annotation.Target;

public class TargetActivity extends AppCompatActivity {

    private TextView t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);

        t2 = (TextView)findViewById(R.id.receivet2);
        String nombre = getIntent().getStringExtra("sent");
        t2.setText("Bienvenido " + nombre);
    }

    //Metodo boton Volver
    public void anterior(View view){
        Intent back = new Intent(TargetActivity.this, MainActivity.class);
        startActivity(back);
    }
}
