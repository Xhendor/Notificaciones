package curso.uabc.com.notificaciones.dialogos;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.appcompat.app.AlertDialog;
import android.util.Log;

public class DialogoSeleccion extends DialogFragment {
	@Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

		final String[] items = {"Español", "Inglés", "Francés"};
		
        AlertDialog.Builder builder = 
        		new androidx.appcompat.app.AlertDialog.Builder(getActivity());
        
        builder.setTitle("Selección")
        .setItems(items, new DialogInterface.OnClickListener() {
	    	    public void onClick(DialogInterface dialog, int item) {
	    	        Log.i("Dialogos", "Opción elegida: " + items[item]);
	    	    }
	    	});
        
//        builder.setTitle("Selecci�n")
//        .setMultiChoiceItems(items, null, 
//        		new DialogInterface.OnMultiChoiceClickListener() {
//        	public void onClick(DialogInterface dialog, int item, boolean isChecked) {
//                Log.i("Dialogos", "Opci�n elegida: " + items[item]);
//            }
//	    });
        
//        builder.setTitle("Selecci�n")
//           .setSingleChoiceItems(items, -1, 
//        		   new DialogInterface.OnClickListener() {
//	    	    public void onClick(DialogInterface dialog, int item) {
//	    	        Log.i("Dialogos", "Opci�n elegida: " + items[item]);
//	    	    }
//	    	});

        return builder.create();
    }
}
