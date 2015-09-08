package trabalhofinal.qualidade.una.com.trabalhoqualidade;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import trabalhofinal.qualidade.una.com.exibecitacoes.FraseActivity;

import com.example.CitationProvider;




public class MainActivity extends ActionBarActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void exibirCitacao(View v)
    {
        CitationProvider citacao = new CitationProvider();
        Intent i = new Intent(this,FraseActivity.class);
        i.putExtra("citacao",citacao.getCitation());
        startActivity(i);
    }
}
