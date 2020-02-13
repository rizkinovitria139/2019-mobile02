package id.ac.polinema.androidlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	protected void onStart(){
		super.onStart();
		android.widget.Toast.makeText(this, "App on Start", Toast.LENGTH_SHORT).show();
	}

	@Override
	protected void onStop(){
		super.onStop();
		android.widget.Toast.makeText(this, "App on Stop", Toast.LENGTH_SHORT).show();
	}




	// TODO: tambahkan callback onStart() di sini


	// TODO: tambahkan callback onStop() di sini

	// TODO: lengkapi callback untuk onRestart() onResume() onPause() onDestroy()
}
