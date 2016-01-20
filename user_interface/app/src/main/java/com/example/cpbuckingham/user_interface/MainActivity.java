package com.example.cpbuckingham.user_interface;

        import android.support.v7.app.ActionBarActivity;
        import android.os.Bundle;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.widget.RelativeLayout;
        //relative layout
        import android.widget.Button;
        //button usage
        import android.graphics.Color;
        // color usage
        import android.widget.EditText;
        // allows for input

public class MainActivity extends ActionBarActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);

                //Layout
                RelativeLayout buckysLayout = new RelativeLayout(this);
                buckysLayout.setBackgroundColor(Color.GREEN);
                
                 //Button
                Button redButton = new Button(this);
                redButton.setText("Login In");
                redButton.setBackgroundColor(Color.RED);
                
                //Username input
                EditText username = new EditText(this);
                redButton.setId(1);
                username.setId(2);
                //setting IDs

                RelativeLayout.LayoutParams buttonDetails = new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT
                );
                //making a container
                RelativeLayout.LayoutParams usernameDetails = new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT
                );

                //give rules to position widget
                
                buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
                buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);
                
                usernameDetails.addRule(RelativeLayout.ABOVE, redButton.getId());
                usernameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
                usernameDetails.setMargins(0,0,0,50);


                //Add widget to layout(button is now a child of layout)
                buckysLayout.addView(redButton, buttonDetails);

                //Set this activities content/display to this view
                setContentView(buckysLayout);

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
