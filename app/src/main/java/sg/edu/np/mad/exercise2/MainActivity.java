package sg.edu.np.mad.exercise2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Toast;
import android.widget.Toolbar;
import android.view.Menu;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    User user = new User("name", "description", 10, true);

    public void followButton(View v){
        Button follow = findViewById(R.id.button);
        if(!user.followed){
            follow.setText("Unfollow");
            user.followed = true;
        }
        else{
            follow.setText("Follow");
            user.followed = false;
        }

    }

}