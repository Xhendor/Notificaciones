package curso.uabc.com.notificaciones;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] menu={"Toast","Barra de Estado","Diálogo"};
        ArrayAdapter<String> adaptador=new ArrayAdapter<String>(getApplication(),android.R.layout.simple_list_item_1,menu);
        ListView lista=(ListView)findViewById(R.id.lista);
lista.setAdapter(adaptador);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                switch (i){

                    case 0:
                        Intent iA=new Intent(getApplication(),ToastActivity.class);
                        startActivity(iA);
                        break;
                    case 1:
                        Intent iB=new Intent(getApplication(),BarraDeEstados.class);
                        startActivity(iB);
                        break;
                    case 2:
                        Intent iC=new Intent(getApplication(),Dialogos.class);
                        startActivity(iC);
                        break;

                }

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
