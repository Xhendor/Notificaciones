package curso.uabc.com.notificaciones.dialogos;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.appcompat.app.AlertDialog;

public class DialogoAlerta extends DialogFragment {
	@Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = 
        		new androidx.appcompat.app.AlertDialog.Builder(getActivity());
        
        builder.setMessage("Esto es un mensaje de alerta.")
        	   .setTitle("Información")
               .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                   public void onClick(DialogInterface dialog, int id) {
                	   dialog.cancel();
                   }
               });

        return builder.create();
    }
}
