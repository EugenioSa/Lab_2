package mx.tec.lab_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = (EditText)findViewById(R.id.enterT1);
    }

    //Metodo boton siguiente
    public void siguiente(View view){

        Intent next = new Intent(MainActivity.this, TargetActivity.class);
        next.putExtra("sent",t1.getText().toString());
        startActivity(next);
    }


}
