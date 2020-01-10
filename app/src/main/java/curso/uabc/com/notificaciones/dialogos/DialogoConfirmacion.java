package curso.uabc.com.notificaciones.dialogos;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.appcompat.app.AlertDialog;
import android.util.Log;

public class DialogoConfirmacion extends DialogFragment {
	@Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        androidx.appcompat.app.AlertDialog.Builder builder =
        		new AlertDialog.Builder(getActivity());
        
        builder.setMessage("�Confirma la acci�n seleccionada?")
        	   .setTitle("Confirmacion")
               .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                   public void onClick(DialogInterface dialog, int id) {
                	   	Log.i("Dialogos", "Confirmacion Aceptada.");
       					dialog.cancel();
                   }
               })
               .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                   public void onClick(DialogInterface dialog, int id) {
                	   	Log.i("Dialogos", "Confirmacion Cancelada.");
       					dialog.cancel();
                   }
               });

        return builder.create();
    }
}
