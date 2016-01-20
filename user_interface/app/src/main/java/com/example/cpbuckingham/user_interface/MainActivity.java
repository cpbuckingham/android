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

        //rgb - seafoam - rgb(145,231,205), pink - rgb(231,145,214), grey - rgb(189,172,178)
        
public class MainActivity extends ActionBarActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);

                //Layout - grey
                RelativeLayout buckysLayout = new RelativeLayout(this);
                Color bg = new Color(189,172,178);
                buckysLayout.setBackgroundColor(Color.bg);
                
                 //Button - seafoam
                Button LoginButton = new Button(this);
                LoginButton.setText("Login In");
                Color buttonColor = new Color(145,231,205);
                LoginButton.setBackgroundColor(Color.buttonColor);
                
                //Username input
                EditText username = new EditText(this);
                LoginButton.setId(1);
                username.setId(2);
                //setting IDs

                //making a container
                RelativeLayout.LayoutParams buttonDetails = new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT
                );
                RelativeLayout.LayoutParams usernameDetails = new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT
                );

                //give rules to position widget
                buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
                buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);
                
                usernameDetails.addRule(RelativeLayout.ABOVE, LoginButton.getId());
                usernameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
                usernameDetails.setMargins(0,0,0,50);


                //Add widget to layout(button is now a child of layout)
                buckysLayout.addView(LoginButton, buttonDetails);
                buckysLayout.addView(username, usernameDetails);

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
