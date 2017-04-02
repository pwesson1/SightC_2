package com.example.pwess.time2kill.cardstream;

import android.os.Bundle;
import android.support.v4.app.Fragment;

public class StreamRetentionFragment extends Fragment {

    CardStreamState mState;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setRetainInstance(true);
    }

    public void storeCardStream(CardStreamState state) {
        mState = state;
    }

    public CardStreamState getCardStream() {
        return mState;
    }
}