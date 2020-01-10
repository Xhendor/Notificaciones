package curso.uabc.com.notificaciones.dialogos;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.appcompat.app.AlertDialog;
import android.view.LayoutInflater;

import curso.uabc.com.notificaciones.R;

public class DialogoPersonalizado extends DialogFragment {
	@Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

		androidx.appcompat.app.AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
	    LayoutInflater inflater = getActivity().getLayoutInflater();

	    builder.setView(inflater.inflate(R.layout.dialog_personal, null))
	           .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                   public void onClick(DialogInterface dialog, int id) {
                       dialog.cancel();
                   }
               });
	    
	    return builder.create();
    }
}
