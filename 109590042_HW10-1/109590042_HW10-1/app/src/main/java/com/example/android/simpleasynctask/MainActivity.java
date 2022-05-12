/*
 * Copyright (C) 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.simpleasynctask;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * The SimpleAsyncTask app contains a button that launches an AsyncTask
 * which sleeps in the asynchronous thread for a random amount of time.
 */

public class MainActivity extends AppCompatActivity {

    private Context mContext;
    private Activity mActivity;

    private ConstraintLayout mCLayout;
    private Button mButtonDo;
    private TextView mTextView;
    private ProgressBar mProgressBar;

    private AsyncTask mMyTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the application context
        mContext = getApplicationContext();
        mActivity = MainActivity.this;

        // Get the widget reference from XML layout
        mCLayout = (ConstraintLayout) findViewById(R.id.ConstraintLayout_layout);
        mButtonDo = (Button) findViewById(R.id.btn_do);
        mTextView = (TextView) findViewById(R.id.tv);
        mProgressBar = (ProgressBar) findViewById(R.id.pb);

        // Initialize a new click listener for positive button widget
        mButtonDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Empty the TextView
                mTextView.setText("");
                // Execute the async task
                mMyTask = new DownloadTask()
                        .execute(
                                "Task 1",
                                "Task 2",
                                "Task 3",
                                "Task 4",
                                "Task 5",
                                "Task 6",
                                "Task 7",
                                "Task 8",
                                "Task 9",
                                "Task 10"
                        );
            }
        });
    }

    private class DownloadTask extends AsyncTask<String,Integer,List<String>>{
        // Before the tasks execution
        protected void onPreExecute(){
            // Do something here
        }

        // Do the task in background/non UI thread
        protected List<String> doInBackground(String...tasks){
            // Get the number of task
            int count = tasks.length;
            // Initialize a new list
            List<String> taskList= new ArrayList<>(count);

            // Loop through the task
            for(int i =0;i<count;i++){
                // Do the current task here
                String currentTask = tasks[i];
                taskList.add(currentTask);

                // Sleep the thread for 1 second
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // Publish the async task progress
                // Added 1, because index start from 0
                publishProgress((int) (((i+1) / (float) count) * 100));

                // If the AsyncTask cancelled
                if(isCancelled()){
                    break;
                }
            }
            // Return the task list for post execute
            return taskList;
        }

        // After each task done
        protected void onProgressUpdate(Integer... progress){
            // Display the progress on text view
            mTextView.setText(""+progress[0] + " %");
            // Update the progress bar
            mProgressBar.setProgress(progress[0]);
        }

        // When all async task done
        protected void onPostExecute(List<String> result){
            for (int i=0;i<result.size();i++){
                // Do something here
            }
        }
    }
}
