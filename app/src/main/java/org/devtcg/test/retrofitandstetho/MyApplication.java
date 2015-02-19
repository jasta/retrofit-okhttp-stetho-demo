package org.devtcg.test.retrofitandstetho;

import android.app.Application;
import com.facebook.stetho.Stetho;

public class MyApplication extends Application {
  @Override
  public void onCreate() {
    super.onCreate();
    Stetho.initialize(Stetho.newInitializerBuilder(this)
        .enableWebKitInspector(Stetho.defaultInspectorModulesProvider(this))
        .build());
  }
}
