package com.example.yehoon.mbtaapp;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public class TabFragment1 extends Fragment {
    private EditText et_book;
    private ProgressBar progressBar;
    private RecyclerView mRecyclerView;
    private Button btn_search;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_fragment1, container, false);

        /*
        // Initialize all the view variables.
        et_book = (EditText) rootView.findViewById(R.id.et_book);
        progressBar = (ProgressBar) rootView.findViewById(R.id.progressBar);
        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        btn_search = (Button) rootView.findViewById(R.id.btn_search);
        btn_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the search string from the input field.
                String queryString = et_book.getText().toString();

                // Hide the keyboard when the button is pushed.
                InputMethodManager inputManager = (InputMethodManager)
                        getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
                inputManager.hideSoftInputFromWindow(getActivity().getCurrentFocus().getWindowToken(),
                        InputMethodManager.HIDE_NOT_ALWAYS);

                // Check the status of the network connection.
                ConnectivityManager connMgr = (ConnectivityManager)
                        getContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();

                // If the network is active and the search field is not empty, start a FetchBook AsyncTask.
                if (networkInfo != null && networkInfo.isConnected() && queryString.length()!=0) {
                    new FetchBook(et_book, progressBar, mRecyclerView).execute(queryString);
                }
                // Otherwise update the TextView to tell the user there is no connection or no search term.
                else {
                    if (queryString.length() == 0) {
                        et_book.setHint(R.string.no_search_term);
                        //a cheap way to clear the RecyclerView
                        mRecyclerView.setAdapter(null);
                    } else {
                        et_book.setText(R.string.no_network);
                    }
                }
            }
        });
        */
        return rootView;
    }
}


