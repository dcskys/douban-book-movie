package com.kyletung.doubanbookmovie.book;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kyletung.doubanbookmovie.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BookFragmentReaded extends Fragment {


    public BookFragmentReaded() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_book_readed, container, false);
    }


}
