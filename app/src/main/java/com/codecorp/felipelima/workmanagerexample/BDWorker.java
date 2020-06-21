package com.codecorp.felipelima.workmanagerexample;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.util.Log;
import android.webkit.URLUtil;

import androidx.work.Data;
import androidx.work.Worker;

public class BDWorker extends Worker {

    @NonNull
    @Override
    public Result doWork() {

        Log.i("Script","doWork: work is done.");

        return Result.SUCCESS;
    }
}
