package com.spencerkerber.asynctasktutorial;

import android.os.AsyncTask;

/**
 * Created by spencerkerber on 11/7/15.
 */
class SampleAsyncTask extends AsyncTask<String, Integer, Integer> {
    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected Integer doInBackground(String... params) {
        return null;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(Integer result) {
        super.onPostExecute(result);
    }
}