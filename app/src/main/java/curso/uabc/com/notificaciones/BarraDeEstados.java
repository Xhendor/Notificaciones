package curso.uabc.com.notificaciones;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import curso.uabc.com.notificaciones.util.NotificationUtils;

public class BarraDeEstados extends AppCompatActivity {

        private Button btnNotificacion;

        private static final int NOTIF_ALERTA_ID = 1;
    private NotificationUtils mNotificationUtils;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_barra_de_estados);
            mNotificationUtils = new NotificationUtils(this);

            btnNotificacion = (Button)findViewById(R.id.BtnNotif);

            btnNotificacion.setOnClickListener(new OnClickListener() {
                public void onClick(View v) {
                    NotificationCompat.Builder mBuilder =
                           new NotificationCompat.Builder(BarraDeEstados.this, NotificationUtils.ANDROID_CHANNEL_ID)
                                    .setSmallIcon(android.R.drawable.stat_sys_warning)
                                    .setLargeIcon((((BitmapDrawable)getResources()
                                            .getDrawable(R.drawable.ic_launcher)).getBitmap()))
                                    .setContentTitle("Mensaje de Alerta")
                                    .setContentText("Ejemplo de notificaciÛn.")
                                    .setContentInfo("4")
                                    .setTicker("Alerta!");

                    Intent notIntent =
                            new Intent(BarraDeEstados.this, MainActivity.class);

                    PendingIntent contIntent = PendingIntent.getActivity(
                            BarraDeEstados.this, 0, notIntent, 0);

                    mBuilder.setContentIntent(contIntent);

                    NotificationManager mNotificationManager =
                            (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

                    mNotificationManager.notify(NOTIF_ALERTA_ID, mBuilder.build());
                }
            });
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_barra_de_estados, menu);
            return true;
        }

    }
