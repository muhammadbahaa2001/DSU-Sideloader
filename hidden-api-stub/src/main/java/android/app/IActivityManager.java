package android.app;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

public interface IActivityManager extends IInterface {

    int startActivityAsUserWithFeature(IApplicationThread caller, String callingPackage,
                                       String callingFeatureId, Intent intent, String resolvedType,
                                       IBinder resultTo, String resultWho, int requestCode, int flags,
                                       ProfilerInfo profilerInfo, Bundle options, int userId);

    abstract class Stub extends Binder implements IActivityManager {

        public static IActivityManager asInterface(IBinder obj) {
            throw new UnsupportedOperationException();
        }

    }
}
