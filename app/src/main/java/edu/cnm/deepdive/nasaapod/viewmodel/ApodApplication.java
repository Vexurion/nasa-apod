package edu.cnm.deepdive.nasaapod.viewmodel;

import android.app.Application;
import com.facebook.stetho.Stetho;
import edu.cnm.deepdive.nasaapod.service.ApodDatabase;

public class ApodApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
    Stetho.initializeWithDefaults(this);
    ApodDatabase.setContex(this);
  }
}
