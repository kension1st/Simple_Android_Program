package suara.latihan;



import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class suara extends Activity {
    /** Called when the activity is first created. */
	MediaPlayer test, test2;
	Button b1,s,p,st,pp;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        test=MediaPlayer.create(this, R.raw.suara);

        
        
        s=(Button) findViewById(R.id.button2);           
        p=(Button) findViewById(R.id.button3);
        st=(Button) findViewById(R.id.button4);
        pp=(Button) findViewById(R.id.button5);
        
        
        s.setOnClickListener(
        		new android.view.View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						test.start();
						
					}
				});
        p.setOnClickListener(
        		new android.view.View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						test.pause();
						
					}
				});
        st.setOnClickListener(
        		new android.view.View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						//test.seekTo(0);
						//test.pause();
						
						resetsuara();
						
					}
				});
        
        
        pp.setOnClickListener(
        		new android.view.View.OnClickListener() {
        			 
					
					@Override
					public void onClick(View v) {
						
						if (test.isPlaying()) {
							test.pause();
							pp.setBackgroundResource(R.drawable.play);
						}
						else {
							test.start();
							pp.setBackgroundResource(R.drawable.pause);
						}
						// TODO Auto-generated method stub
						
					}
				});
       
        	
        }
    void resetsuara()
    {
    	test.reset();
		test=MediaPlayer.create(this, R.raw.suara);	
    }
  
        
       
      
    
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		test.pause();
	}
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		test.start();
	}
}