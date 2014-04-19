package fr.nicohnit.sel;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class Accueil extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }

     public void show(String message) {
    	 Toast.makeText(this,message,
    	    	  Toast.LENGTH_LONG).show();
     }
    
    public void onClick (View view) {
    	int id = view.getId();
    	if (R.id.button_carte == id) {
    		show("Boutton carte !");
    	} else if (R.id.button_chercher == id) {
    		show("Boutton chercher !");
    	} else if (R.id.button_nom == id) {
    		show("Boutton nom !");
    	} else if (R.id.button_numero == id) {
    		show("Boutton numéro !");
    	} else if (R.id.button_prefecture == id) {
    		show("Boutton prefecture !");
    	} else if (R.id.button_region == id) {
    		show("Boutton region !");
    	} else {
    		show("Autre chose");
    	}
    	 
    } 
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.accueil, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_accueil, container, false);
            return rootView;
        }
    }

}
