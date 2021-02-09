package mcm.edu.ph.tapenit_ifthen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView storyBackground = findViewById(R.id.txtBG);
        TextView outcome = findViewById(R.id.txtAns);

        Button btnDecision1 = findViewById(R.id.btnDecision1);
        Button btnDecision2 = findViewById(R.id.btnDecision2);
        btnDecision1.setOnClickListener(this);
        btnDecision2.setOnClickListener(this);

        storyBackground.setText(
                "The dead are near. Moaning, groaning and bashing in the door. As you try to barricade yourself in the door, you heard a scream." +
                        "You found yourself in a position of making a decision. Save Doug or Carly?"
        );

        outcome.setText(
                "Choose to save Doug will give benefits in the group." +
                        "\nChoose to save Carly will also benefits the group, because she has a gun."
        );

    }
    @Override
    public void onClick(View view) {

        TextView outcome = findViewById(R.id.txtAns);
        TextView storyBackground = findViewById(R.id.txtBG);

        if (view.getId() == R.id.btnDecision1) {
            storyBackground.setText("You chose to help Doug");
        } else if (view.getId() == R.id.btnDecision2) {
            storyBackground.setText(("You chose to help Carly, Nice decision"));
            outcome.setText("You got out of the building succesfully");

            if (view.getId() == R.id.btnDecision1) {
                storyBackground.setText("You got in a car");
                if (view.getId() == R.id.btnDecision1) {
                }
                if (view.getId() == R.id.btnDecision2) {
                    storyBackground.setText("You died");

                }
                if (view.getId() == R.id.btnDecision1) {
                    storyBackground.setText("You manage to save both");
                }
            } else if (view.getId() == R.id.btnDecision2) {
                storyBackground.setText(("You chose to help Carly, Nice decision"));
                outcome.setText("You got out of the building succesfully");
            }
        }
    }
}