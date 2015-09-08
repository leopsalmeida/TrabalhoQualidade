package trabalhofinal.qualidade.una.com.exibecitacoes;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;


public class FraseActivity extends ActionBarActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frase);
        String citacao = getIntent().getStringExtra("citacao");

        TextView txtCitacao = (TextView) findViewById(R.id.txtCitacao);
        txtCitacao.setText(citacao);
    }
}
