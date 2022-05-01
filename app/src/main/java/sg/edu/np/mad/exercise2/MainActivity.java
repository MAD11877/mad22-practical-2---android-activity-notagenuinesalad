package sg.edu.np.mad.exercise2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Toast;
import android.widget.Toolbar;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {


    public void onDefaultToggleClick(View view) {
        Toast.makeText(this, "DefaultToggle", Toast.LENGTH_SHORT).show();
    }

    public void onCustomToggleClick(View view) {
        Toast.makeText(this, "CustomToggle", Toast.LENGTH_SHORT).show();
    }

}